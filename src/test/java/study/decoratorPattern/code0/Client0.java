package study.decoratorPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client0 {
    private Cooking cooking;

    public Client0(Cooking cooking){
        this.cooking = cooking;
    }

    public void excute(){
        log.info("계란라면 주문이요!!");
        cooking.cook();
    }
}
