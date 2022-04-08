package study.adapterPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.adapterPattern.code0.Adapter;
import study.adapterPattern.code0.AirConditioner;
import study.adapterPattern.code0.Electronic110V;
import study.adapterPattern.code0.Electronic220V;

@Slf4j
public class AdapterPatternTest {
    @Test
    void test(){
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new Adapter(airConditioner);
        connect(adapter);
    }
    void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
