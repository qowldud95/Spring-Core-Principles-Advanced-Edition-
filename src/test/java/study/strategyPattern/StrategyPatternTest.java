package study.strategyPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.strategyPattern.code0.Bus;
import study.strategyPattern.code0.LoadStrategy;
import study.strategyPattern.code0.Moving;
import study.strategyPattern.code0.RailLoadStrategy;

@Slf4j
public class StrategyPatternTest {
    @Test
    void code0test(){
        log.info("bus1의 이동수단을 도로로 설정");
        Moving bus1 = new Bus(new LoadStrategy());
        log.info("=============================");

        log.info("bus1의 이동수단을 선로로 변경하고 싶을 때, 내부 코드 변경 없이 한 코드만 수정하여 변경가능");
        Moving bus2 = new Bus(new RailLoadStrategy());
        log.info("=============================");
    }
}
