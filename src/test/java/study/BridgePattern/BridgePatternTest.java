package study.BridgePattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.BridgePattern.code0.Animal;
import study.BridgePattern.code0.Bird;
import study.BridgePattern.code0.HuntingMethod1;
import study.BridgePattern.code1.Noodle;
import study.BridgePattern.code1.NoodleTypeIsRamen;
import study.BridgePattern.code1.Ramen;

@Slf4j
public class BridgePatternTest {
    @Test
    void code0test(){
        Animal bird = new Bird(new HuntingMethod1());
        bird.hunt();
    }

    @Test
    void code1test(){
        Noodle ramen = new Ramen(new NoodleTypeIsRamen());
        ramen.typeOfNoodle();
    }

}
