package study.abstractFactoryPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LgComputer implements ComputerFactory {
    @Override
    public void createKeyboard() {
        log.info("LG keyboard");
    }

    @Override
    public void createMouse() {
        log.info("LG mouse");
    }
}
