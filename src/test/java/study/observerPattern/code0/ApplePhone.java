package study.observerPattern.code0;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ApplePhone implements Machine {

    public static List<Observer> updateTarget;

    public ApplePhone(){
        updateTarget = new ArrayList<>();
    }

    @Override
    public void updateButtonOn(Observer observer) {
        log.info("update button on");
        updateTarget.add(observer);
        updateNotification();
    }

    @Override
    public void updateButtonOff(Observer observer) {
        log.info("update button off");
        updateTarget.remove(observer);
        updateNotification();
    }

    @Override
    public void updateNotification() {
        for(Observer observer : updateTarget){
            log.info("observer ={}", observer);
            observer.softwareUpdate();
        }

    }
}
