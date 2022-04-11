package study.adapterPattern.code1;

public class VoiceModulator implements FastVersion{
    private SlowSpeaking slowSpeaking;
    public VoiceModulator(SlowSpeaking slowSpeaking){
        this.slowSpeaking = slowSpeaking;
    }

    @Override
    public void soundOn() {
        slowSpeaking.soundOn();
    }

    @Override
    public void volumeUP() {
        slowSpeaking.volumeUp();
    }

    @Override
    public void volumeDown() {
        slowSpeaking.volumeDown();
    }
}
