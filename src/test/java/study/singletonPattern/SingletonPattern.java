package study.singletonPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.singletonPattern.code0.Singleton;

@Slf4j
public class SingletonPattern {
    @Test
    void code0test(){
        Singleton.getInstance().getClass();

        Singleton.getInstance().getClass();
    }
}
