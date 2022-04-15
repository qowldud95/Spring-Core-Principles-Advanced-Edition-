package study.observerPattern.code0;

public interface Machine {
    void updateButtonOn(Observer observer);
    void updateButtonOff(Observer observer);
    void updateNotification();
}
