package study.BridgePattern.code0;

public class Animal {
    private HuntingHandler hunting;

    public Animal(HuntingHandler hunting){
        this.hunting = hunting;
    }

    public void findQuarry() {
        hunting.findQuarry();
    }
    public void detectedQuarry(){
        hunting.detectedQuarry();
    }
    public void attack(){
        hunting.attack();
    }
    public void hunt(){
        findQuarry();
        detectedQuarry();
        attack();
    }


}
