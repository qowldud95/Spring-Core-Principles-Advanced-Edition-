package proxy.pureproxy.proxy;

import proxy.pureproxy.proxy.code.CacheProxy;
import proxy.pureproxy.proxy.code.ProxyPatternClient;
import proxy.pureproxy.proxy.code.RealSubject;
import proxy.pureproxy.proxy.code.Subject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {
    @Test
    void noProxyTest(){
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
        //3번 처리하면 총3초의 시간이 걸림.
        //그런데 이 데이터가 한번 조회하면 변하지 않는 데이터라면 어딘가에 보관해두고 이미 조회한 데이터를 사용하는게 좋다.
        //이를 캐시 라고 한다.
        //프록시패턴의 주요기능 : 접근제어 (캐시도 접근제어 기능중 하나)
    }

    @Test
    void cacheProxyTest(){
        Subject realSubject = new RealSubject();
        Subject cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);
        client.execute();
        client.execute();
        client.execute();
        //realSubject와 cacheProxy를 생성하고 둘을 연결.
        //client -> cacheProxy -> realSubject 런타임 객체 의존관계 완성
        //클라이언트가 실제 realSubject를 호출하는것이 아니라  cacheProxy를 호출하게 된다.
    }
}
