package study.BridgePattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoodleTypeIsRamen implements NoodleTypeHandler{
    @Override
    public void putWater() {
        log.info("라면 물을 넣는다");
    }

    @Override
    public void putNoodle() {
        log.info("라면 면을 넣는다");
    }

    @Override
    public void putSource() {
        log.info("라면 스프를 넣는다");
    }

    @Override
    public void boil() {
        log.info("3분간 팔팔 끓인다");
    }
}
