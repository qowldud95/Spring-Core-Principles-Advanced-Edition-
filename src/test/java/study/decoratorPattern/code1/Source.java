package study.decoratorPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Source extends Decorator{

    public Source(Bab bab){
        super(bab);
    }
    public void addMaterial(){
        log.info("비빔밥에 소스 추가");
    }
    @Override
    public void cook(){
        super.cook();
        addMaterial();
    }
}
