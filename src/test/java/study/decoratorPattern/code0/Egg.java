package study.decoratorPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Egg implements Cooking{

    private Cooking cooking;

    public Egg(Cooking cooking){
        this.cooking = cooking;
    }

    @Override
    public void cook() {
        cooking.cook();
        log.info("라면에 계란 추가");
        return;
    }
}
