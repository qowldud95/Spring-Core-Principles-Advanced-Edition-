package study.InterpreterPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.InterpreterPattern.code0.Expression;
import study.InterpreterPattern.code0.MinusExpression;
import study.InterpreterPattern.code0.PlusExpression;

@Slf4j
public class InterpreterPatternTest {

    @Test
    void code0test(){
        Expression plusExpression = new PlusExpression();
        Expression minusExpression = new MinusExpression();

        log.info("result1 :: " + plusExpression.interprete("3+1"));
        log.info("result2 :: " + plusExpression.interprete("3-1"));

        log.info("result3 :: " + minusExpression.interprete("3+1"));
        log.info("result4 :: " + minusExpression.interprete("3-1"));


    }
}
