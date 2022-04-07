package study.decoratorPattern.code1;

public class Decorator implements Bab{

    private Bab bab;

    public Decorator(Bab bab) {
        this.bab = bab;
    }

    @Override
    public void cook() {
        bab.cook();
    }
}
