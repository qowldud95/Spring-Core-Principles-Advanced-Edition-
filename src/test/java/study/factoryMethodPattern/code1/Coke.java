package study.factoryMethodPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Coke extends Drink{
    @Override
    public void info() {
        log.info("콜라 맛");
    }
}
