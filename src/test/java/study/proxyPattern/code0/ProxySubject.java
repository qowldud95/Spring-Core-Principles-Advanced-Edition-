package study.proxyPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxySubject implements Subject{

    private Subject target;
    private String cacheValue;

    public ProxySubject(Subject target){
        this.target = target;
    }

    @Override
    public void run() {
        log.info("프록시 호출!!");
        if(cacheValue == null){
            cacheValue = "o";
            target.run();
            log.info("최초 접근으로 판단! 실체 객체에 직접 접근!!");
        }
    }
}
