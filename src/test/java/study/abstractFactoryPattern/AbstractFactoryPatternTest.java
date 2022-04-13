package study.abstractFactoryPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.abstractFactoryPattern.code0.FactoryOfComputerFactory;

@Slf4j
public class AbstractFactoryPatternTest {
    @Test
    void code0test(){
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory("LG");
    }
}
