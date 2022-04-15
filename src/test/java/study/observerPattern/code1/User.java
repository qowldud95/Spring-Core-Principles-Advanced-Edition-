package study.observerPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class User implements Subscriber{

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void handleMessage(String message) {
        log.info(message);
    }
}
