package study.observerPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IosUpdate implements Observer{
    @Override
    public void softwareUpdate() {
        log.info("ios update alarm");
    }
}
