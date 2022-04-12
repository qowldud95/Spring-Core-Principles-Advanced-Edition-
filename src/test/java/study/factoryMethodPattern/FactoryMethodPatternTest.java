package study.factoryMethodPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.factoryMethodPattern.code0.NotebookFactory;
import study.factoryMethodPattern.code1.Drink;
import study.factoryMethodPattern.code1.DrinkFactory;
import study.factoryMethodPattern.code1.VendingMachine;

@Slf4j
public class FactoryMethodPatternTest {
    @Test
    void code0test(){
        NotebookFactory notebookFactory = new NotebookFactory();
        notebookFactory.createNoteBook("LG");
    }

    @Test
    void code1test(){
        DrinkFactory drinkFactory = new VendingMachine();
        //Drink drink1 = drinkFactory.create("coffee");
        //drink1.info();
        drinkFactory.create("coffee").info();
    }
}
