package hello.proxy.trace.logtrace;

import hello.proxy.trace.TraceStatus;

public interface LogTrace {
    TraceStatus begin(String message);
    void end(TraceStatus status);
    public void exception(TraceStatus status, Exception e);
}
