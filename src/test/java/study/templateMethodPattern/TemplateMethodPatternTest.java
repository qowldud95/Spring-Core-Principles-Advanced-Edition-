package study.templateMethodPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.templateMethodPattern.code0.MathTeacher;
import study.templateMethodPattern.code0.Teacher;

@Slf4j
public class TemplateMethodPatternTest {
    @Test
    void code0test(){
        Teacher mathTeacher = new MathTeacher();
        mathTeacher.start_class();
    }

}
