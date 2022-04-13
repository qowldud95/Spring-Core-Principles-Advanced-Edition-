package study.abstractFactoryPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SamsungComputer implements ComputerFactory{
    @Override
    public void createKeyboard() {
        log.info("SAMSUNG keyboard");
    }

    @Override
    public void createMouse() {
        log.info("SAMSUNG mouse");
    }
}
