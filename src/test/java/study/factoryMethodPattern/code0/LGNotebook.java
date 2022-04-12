package study.factoryMethodPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LGNotebook implements Notebook{
    public LGNotebook(){
        log.info("LG 노트북");
    }
}
