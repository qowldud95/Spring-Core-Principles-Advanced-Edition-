package study.decoratorPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ramen implements Cooking{

    @Override
    public void cook() {
        log.info("기본라면 요리 시작!");
        return;
    }
}
