package study.decoratorPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rice extends Decorator{

    public Rice(Bab bab) {
        super(bab);
    }

    //deco기능
    public void addMaterial(){
        log.info("비빔밥에 밥 추가");
    }

    @Override
    public void cook(){
        super.cook();
        addMaterial();
    }
}
