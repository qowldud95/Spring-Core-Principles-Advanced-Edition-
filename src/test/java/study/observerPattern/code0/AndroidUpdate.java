package study.observerPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidUpdate implements Observer{
    @Override
    public void softwareUpdate() {
        log.info("android update alarm");
    }
}
