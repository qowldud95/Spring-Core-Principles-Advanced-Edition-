package study.chainOfResponsibilityPattern.code0;

public interface Chain {
    public void setNext(Chain nextInChain);
    public void process(Number request);
}
