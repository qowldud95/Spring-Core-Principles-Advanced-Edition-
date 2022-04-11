package study.chainOfResponsibilityPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.chainOfResponsibilityPattern.code0.Chain;
import study.chainOfResponsibilityPattern.code0.NegativProcessor;
import study.chainOfResponsibilityPattern.code0.Number;
import study.chainOfResponsibilityPattern.code0.PositiveProcessor;
import study.chainOfResponsibilityPattern.code0.ZeroProcessor;
import study.chainOfResponsibilityPattern.code1.*;

@Slf4j
public class ChainOfResponsibilityPatternTest {
    @Test
    void code0test(){
        Chain chain1 = new NegativProcessor();
        Chain chain2 = new ZeroProcessor();
        Chain chain3 = new PositiveProcessor();

        chain1.setNext(chain2);
        chain2.setNext(chain3);

        chain1.process(new Number(90));
    }

    @Test
    void code1test(){
        DispenseChain chain1 = new Won100Dispenser();
        DispenseChain chain2 = new Won10Dispenser();
        DispenseChain chain3 = new Won1Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        chain1.dispense(new Currency(397));

    }
}
