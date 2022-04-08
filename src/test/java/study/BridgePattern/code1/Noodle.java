package study.BridgePattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract public class Noodle {
    private NoodleTypeHandler noodleType;

    public Noodle(NoodleTypeHandler noodleType){
        this.noodleType = noodleType;
    }

    abstract public void typeOfNoodle();

    public void putWater(){
        noodleType.putNoodle();
    }
    public void putNoodle(){
        noodleType.putNoodle();
    }
    public void putSource(){
        noodleType.putSource();
    }
    public void boil(){
        noodleType.boil();
    }

}
