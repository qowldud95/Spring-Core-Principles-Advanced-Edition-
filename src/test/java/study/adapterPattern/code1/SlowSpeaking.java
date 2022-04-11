package study.adapterPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SlowSpeaking implements SlowVersion {

    @Override
    public void soundOn() {
        log.info("slow version on!");
    }

    @Override
    public void volumeUp() {
        log.info("slow version volume up!!");
    }

    @Override
    public void volumeDown() {
        log.info("slow version volume down..");
    }
}
