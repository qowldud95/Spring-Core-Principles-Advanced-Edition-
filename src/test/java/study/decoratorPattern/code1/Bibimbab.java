package study.decoratorPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bibimbab implements Bab {

    @Override
    public void cook() {
        log.info("기본비빔밥 요리 시작!");
        return;
    }
}
