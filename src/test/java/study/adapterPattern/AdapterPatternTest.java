package study.adapterPattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.adapterPattern.code0.Adapter;
import study.adapterPattern.code0.AirConditioner;
import study.adapterPattern.code0.Electronic110V;
import study.adapterPattern.code0.Electronic220V;
import study.adapterPattern.code1.FastSpeaking;
import study.adapterPattern.code1.FastVersion;
import study.adapterPattern.code1.SlowSpeaking;
import study.adapterPattern.code1.VoiceModulator;

@Slf4j
public class AdapterPatternTest {
    @Test
    void code0test(){
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new Adapter(airConditioner);
        connect(adapter);
    }
    void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

    @Test
    void code1test(){
        log.info("===== 느린 버전으로 재생하기 ======");
        SlowSpeaking slowSpeaking = new SlowSpeaking();
        slowSpeaking.soundOn();
        slowSpeaking.volumeUp();

        log.info("===== 빠른 버전으로 재생하기 ======");
        FastSpeaking fastSpeaking = new FastSpeaking();
        fastSpeaking.soundOn();
        fastSpeaking.volumeDown();

        log.info("===== 빠른버전에 느린버전 끼워넣기 ======");
        FastVersion modulator = new VoiceModulator(slowSpeaking);
        switchSlowly(modulator);
        }

        void switchSlowly(FastVersion fastVersion){
            log.info("음성변조 중......loading....");
            fastVersion.soundOn();
            fastVersion.volumeUP();
        }

}
