package study.proxyPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.proxyPattern.code0.Client0;
import study.proxyPattern.code0.ProxySubject;
import study.proxyPattern.code0.RealSubject;
import study.proxyPattern.code0.Subject;

@Slf4j
public class ProxyPatternTest {
    @Test
    void Client0Test(){
        //Subject cacheProxy = new ProxySubject(new RealSubject());
        //Client0 client = new Client0(cacheProxy);

        //client.execute();
       // client.execute();
       // client.execute();

        Subject cacheProxy = new ProxySubject(new RealSubject());
        cacheProxy.run();
        cacheProxy.run();
        cacheProxy.run();




    }
}
