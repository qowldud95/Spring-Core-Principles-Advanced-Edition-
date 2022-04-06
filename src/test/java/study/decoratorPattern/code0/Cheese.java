package study.decoratorPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cheese implements Cooking{

    private Cooking cooking;

    public Cheese(Cooking cooking){
        this.cooking = cooking;
    }
    @Override
    public void cook() {
        log.info("라면에 치즈 추가");
        String result = "";
        return ;
    }
}
