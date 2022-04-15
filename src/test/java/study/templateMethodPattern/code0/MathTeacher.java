package study.templateMethodPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MathTeacher extends Teacher{

    @Override
    public void teaching() {
        log.info("선생님이 수학 수업을 합니다.");
    }
}
