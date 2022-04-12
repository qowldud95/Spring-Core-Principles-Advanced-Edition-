package study.strategyPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bus extends Moving{


    public Bus(MovableStrategy movableStrategy) {
        super(movableStrategy);
        transportation();
    }

    void transportation(){
        log.info("이동수단은 Bus 입니다.");
    }
}
