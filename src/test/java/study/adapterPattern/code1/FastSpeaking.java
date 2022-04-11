package study.adapterPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FastSpeaking implements FastVersion{
    @Override
    public void soundOn() {
        log.info("fast version on!");
    }

    @Override
    public void volumeUP() {
        log.info("fast version volume up!!");

    }

    @Override
    public void volumeDown() {
        log.info("fast version volume down..");
    }
}
