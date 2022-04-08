package study.BridgePattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bird extends Animal{

    public Bird(HuntingHandler hunting) {
        super(hunting);
    }
    public void hunt(){
        log.info("새의 사냥 방식");
        super.hunt();
    }
}
