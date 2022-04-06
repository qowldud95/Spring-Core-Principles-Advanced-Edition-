package study.proxyPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client0 {

    private Subject target;

    public Client0(Subject target){
        this.target = target;
    }

    public void execute(){
        log.info("Subject 사용할래요");
        target.run();
    }
}
