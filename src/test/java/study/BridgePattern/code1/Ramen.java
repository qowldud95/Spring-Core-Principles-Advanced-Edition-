package study.BridgePattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ramen extends Noodle{

    public Ramen(NoodleTypeHandler noodleType) {
        super(noodleType);
    }

    @Override
    public void typeOfNoodle() {
        log.info("면 종류는 라면입니다.");
        super.putWater();
        super.putNoodle();
        super.putSource();
        super.boil();
    }
}
