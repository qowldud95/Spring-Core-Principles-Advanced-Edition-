package study.singletonPattern.code0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Singleton {

    private static Singleton instance;

    //생성자에 직접 접근하지 못하게 private으로..
    private Singleton(){
        run();
    }

    public static Singleton getInstance(){
        if(instance == null){
            //synchronized를 활용하여 멀티스레드 환경에서 여러 인스턴스 생성하는것을 방지
            synchronized (Singleton.class){
                if(instance == null) instance = new Singleton();
            }
        }
        return instance;
    }

    void run(){
        log.info("실행!!!");
    }
}
