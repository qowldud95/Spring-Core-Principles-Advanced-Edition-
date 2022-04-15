package study.observerPattern.code1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    //여러 옵저버들을 등록하거나 해지할수 있어야 함.
    //옵저버들을 특정한 주제들로 묶어놓을것이기 때문에 map 사용
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber){
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber){
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).remove(subscriber);
        }
    }

    //상태를 변경할 수 있는 기능
    public void sendMessage(User user, String subject, String message){
        if(this.subscribers.containsKey(subject)){
            String userMessage = user.getName() + " : " + message ;
            this.subscribers.get(subject).forEach(s->s.handleMessage(userMessage));
        }
    }

}
