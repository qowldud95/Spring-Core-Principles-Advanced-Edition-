package study.BridgePattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HuntingMethod1 implements HuntingHandler{

    @Override
    public void findQuarry() {
        log.info("물 위에서 찾는다.");
    }

    @Override
    public void detectedQuarry() {
        log.info("물고기 발견!");
    }

    @Override
    public void attack() {
        log.info("낚아챈다.");
    }
}
