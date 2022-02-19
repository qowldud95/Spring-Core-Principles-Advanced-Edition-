package hello.advanced.app.v2;

import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.hellotrace.HelloTraceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV2 {

    private final HelloTraceV2 trace;

    public void save(TraceId traceId, String itemId) throws IllegalAccessException {

        TraceStatus status = null;
        try{
            status = trace.beginSync(traceId,"OrderRepositoryV1.save()");

            //저장로직
            if(itemId.equals("ex")){
                throw new IllegalAccessException("예외발생!");
            }
            sleep(1000);

            trace.end(status);
        } catch(Exception e){
            trace.exception(status, e);
            throw e;
        }



    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
