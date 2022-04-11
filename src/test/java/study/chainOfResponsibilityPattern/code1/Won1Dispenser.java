package study.chainOfResponsibilityPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Won1Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        int num = cur.getAmount()/1;
        log.info("Dispensing = " + num + " * 1won");
    }
}
