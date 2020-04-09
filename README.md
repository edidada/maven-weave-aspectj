# maven-weave-aspectj

Examples of how to weave AspectJ aspects with `aspectj-maven-plugin`. There are two cases:

1. Define aspects in the same module
2. Define aspects in another module



```shell
mvn compile
mvn exec:java -Dexec.mainClass="cc.unmi.HelloAop"
```
失败
直接运行
HelloAop

总结：
一个接口定义
用在方法上 可以用在类上吗？

一个切面，切点
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

定义处理逻辑
