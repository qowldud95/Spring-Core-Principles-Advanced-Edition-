package study.chainOfResponsibilityPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Won100Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 100){
            int num = cur.getAmount() / 100;
            int remainder = cur.getAmount() % 100;

            log.info("Dispensing = " + num + " * 100won");
            if (remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextChain.dispense(cur);
        }
    }
}
