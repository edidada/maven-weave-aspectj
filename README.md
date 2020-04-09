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

