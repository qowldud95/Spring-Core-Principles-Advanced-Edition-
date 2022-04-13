package study.abstractFactoryPattern.code0;

public class FactoryOfComputerFactory {

    public FactoryOfComputerFactory(String type){

        ComputerFactory computerFactory = null;

        switch (type){
            case "LG" :
                computerFactory = new LgComputer();
                break;
            case "SAMSUNG" :
                computerFactory = new SamsungComputer();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }

}
