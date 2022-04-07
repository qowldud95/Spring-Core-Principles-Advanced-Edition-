package study.BridgePattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HuntingMethod2 implements HuntingHandler{

    @Override
    public void findQuarry() {
        log.info("지상에서 찾는다.");
    }

    @Override
    public void detectedQuarry() {
        log.info("노루 발견");
    }

    @Override
    public void attack() {
        log.info("물어뜯는다.");
    }
}
