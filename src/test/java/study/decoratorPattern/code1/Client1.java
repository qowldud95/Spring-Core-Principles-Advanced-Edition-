package study.decoratorPattern.code1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client1 {
    private Bab bab;

    public Client1(Bab bab) {
        this.bab = bab;
    }

    public void excute(){
        log.info("비빔밥 주문이요!! 계란추가, 소스추가");
        bab.cook();
    }
}
