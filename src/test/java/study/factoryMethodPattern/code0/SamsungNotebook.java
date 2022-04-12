package study.factoryMethodPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SamsungNotebook implements Notebook{
    public SamsungNotebook(){
        log.info("LG 노트북");
    }
}
