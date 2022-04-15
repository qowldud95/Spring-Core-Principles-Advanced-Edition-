package study.observerPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.observerPattern.code0.*;
import study.observerPattern.code1.ChatServer;
import study.observerPattern.code1.User;

@Slf4j
public class ObserverPatternTest {
    @Test
    void code0test(){
        Machine applePhone1 = new ApplePhone();
        Machine applePhone2 = new ApplePhone();

        applePhone1.updateButtonOn(new IosUpdate());
        applePhone2.updateButtonOn(new IosUpdate());

        log.info("-----------------------");
    }

    @Test
    void code1test(){
        ChatServer chatServer = new ChatServer();
        User user1 = new User("jiyoung");
        User user2 = new User("gildong");

        chatServer.register("자바스터디", user1);
        chatServer.register("디비스터디", user1);

        chatServer.register("디비스터디", user2);

        chatServer.sendMessage(user1, "자바스터디", "자바스터디를 시작하자!!");
        chatServer.sendMessage(user2, "디비스터디", "디비스터디를 시작하자!!");

        chatServer.unregister("디비스터디", user1);

        chatServer.sendMessage(user2, "디비스터디", "옵저버 패턴 장/단점 보는중");

    }
}
