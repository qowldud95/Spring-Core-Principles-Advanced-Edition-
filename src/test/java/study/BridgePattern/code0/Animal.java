package study.BridgePattern.code0;

public class Animal {
    private HuntingHandler hunting;

    public Animal(HuntingHandler hunting){
        this.hunting = hunting;
    }
    public void FindQuarry() {
        hunting.findQuarry();
    }


}
