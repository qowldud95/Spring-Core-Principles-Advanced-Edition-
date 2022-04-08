package study.adapterPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HairDryer implements Electronic110V{
    @Override
    public void powerOn() {
        log.info("헤어드라이기 110V on");
    }
}
