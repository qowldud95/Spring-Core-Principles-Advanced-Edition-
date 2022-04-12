package study.factoryMethodPattern.code1;

public class VendingMachine extends DrinkFactory{
    @Override
    public Drink create(String drinkType) {
        switch(drinkType) {
            case "coffee" :
                return new Coffee();
            case "coke" :
                return new Coke();
            default:
                throw new RuntimeException(drinkType + "is not existed");
        }
    }
}
