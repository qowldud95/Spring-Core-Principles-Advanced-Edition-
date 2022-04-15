package study.templateMethodPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Teacher {
    public void inside(){
        log.info("선생님이 교실에 들어옵니다.");
    };
    public void attendance(){
        log.info("출석을 부릅니다.");
    };

    public abstract void teaching();

    public void outside(){
        log.info("선생님이 교실에서 나갑니다.");
    }

    public void start_class(){
        inside();
        attendance();
        teaching();
        outside();
    }

}
