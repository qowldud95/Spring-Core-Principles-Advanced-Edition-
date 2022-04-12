package study.strategyPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RailLoadStrategy implements MovableStrategy{

    @Override
    public void move() {
        log.info("선로를 통해 이동");
    }
}
