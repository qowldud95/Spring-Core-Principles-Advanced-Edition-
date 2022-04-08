package study.adapterPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirConditioner implements Electronic220V{
    @Override
    public void connect() {
        log.info("에어컨 220V on");
    }
}
