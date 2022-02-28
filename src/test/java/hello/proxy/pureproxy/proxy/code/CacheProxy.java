package hello.proxy.pureproxy.proxy.code;

import hello.proxy.code.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//프록시
public class CacheProxy implements Subject {
    private Subject target;
    private String cacheValue;

    public CacheProxy(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("프록시 호출");
        if(cacheValue == null){
            cacheValue = target.operation();
        }
        return cacheValue;
    }
}
