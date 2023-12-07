package inflearn.advanced.trace.hellotrace;

import inflearn.advanced.trace.TraceId;
import inflearn.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTraceV1Test {

    @Test
    void begin_end(){
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);
    }

    @Test
    void begin_exception(){
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalArgumentException());
    }

}