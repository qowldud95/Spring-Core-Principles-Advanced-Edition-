package study.factoryMethodPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Coffee extends Drink{

    @Override
    public void info() {
        log.info("커피 맛");
    }
}
