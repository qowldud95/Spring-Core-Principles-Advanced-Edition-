package study.decoratorPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.decoratorPattern.code0.Client0;
import study.decoratorPattern.code0.Cooking;
import study.decoratorPattern.code0.Egg;
import study.decoratorPattern.code0.Ramen;
import study.decoratorPattern.code1.Bab;
import study.decoratorPattern.code1.Bibimbab;
import study.decoratorPattern.code1.Client1;
import study.decoratorPattern.code1.Rice;

@Slf4j
public class DecoratorPatternTest {

    //implements 사용
    @Test
    public void code0Test(){
        Cooking ramen = new Ramen();
        Cooking addEgg = new Egg(ramen);
        Client0 client = new Client0(addEgg);
        client.excute();
    }
    //extends 사용
    @Test
    public void code1Test(){
        Bab Bibimbab = new Bibimbab();
        Bab addRiceBibimbab = new Rice(Bibimbab);
        Client1 client1 = new Client1(addRiceBibimbab);
        client1.excute();
    }
}
