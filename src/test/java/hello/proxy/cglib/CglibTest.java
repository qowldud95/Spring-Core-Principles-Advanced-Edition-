package hello.proxy.cglib;

import hello.proxy.cglib.code.TimeMethodInterceptor;
import hello.proxy.common.service.ConcreteService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

@Slf4j
public class CglibTest {
    @Test
    void cglib(){
        ConcreteService target = new ConcreteService();

        //cglib은 Enhancer을 사용해서 프록시를 만든다.
        Enhancer enhancer = new Enhancer();

        //cglib은 구체클래스를 상속받아서 프록시를 생성할 수 있다. 어떤 구체 클래스를 상속받을지 지정한다.
        enhancer.setSuperclass(ConcreteService.class);

        //프록시에 적용할 실행 로직을 할당.
        enhancer.setCallback(new TimeMethodInterceptor(target));

        //프록시 생성. 앞서 설정한 " enhancer.setSuperclass(ConcreteService.class); "  에서 지정한 클래스를 상속받아서 프록시가 만들어짐.
        enhancer.create();



    }
}
