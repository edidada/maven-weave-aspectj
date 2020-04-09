package cc.unmi;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MethodStartAspect {

    private static ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(* cc.unmi..*(..)) && @annotation(logStartTime)")
    private void logStartTimePointcut(LogStartTime logStartTime) {
//        System.out.println("logStartTimePointcut");//Error:(13, 0) ajc: Pointcuts without an if() expression should have an empty method body
    }

    @Before("logStartTimePointcut(logStartTime)")
    public void setStartTimeInThreadLocal(LogStartTime logStartTime) {
        System.out.println(logStartTime.value());
        startTime.set(System.currentTimeMillis());
        System.out.println("from module[aspects], saved method start time in threadLocal");
    }

    @After("logStartTimePointcut(logStartTime)")
    public void setInThreadLocal(LogStartTime logStartTime) {
          System.out.println("After logStartTimePointcut");
    }

    public static Long getStartTime() {
        return startTime.get();
    }

    public static void clearStartTime() {
        startTime.set(null);
    }
}
