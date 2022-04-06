package study.decoratorPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Source extends Bibimbab{

    public Source(Bab bab) {
        super.cook();
    }

    @Override
    public void cook(){
        super.cook();
        log.info("비빔밥에 소스 추가");
    }
}
