package study.decoratorPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rice extends Bibimbab{
    public Rice(Bab bab) {
        super.cook();
    }

    @Override
    public void cook(){
        super.cook();
        log.info("비빔밥에 밥 추가");
        return;
    }
}
