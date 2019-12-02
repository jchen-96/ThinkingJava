Java的基本理念是"结构不佳的代码不能运行"

Java异常时Java提供的一种识别及相应错误的一致性机制。
Java异常机制可以使程序中异常处理代码和正常业务代码分离，保证程序代码更加优雅，并提高程序健壮性。在有效使用异常的情况下，异常能清晰的回答what,where,why 三个问题这三个问题：异常类型回答了“什么”被抛出，异常堆栈跟踪回答了“在哪”抛出，异常信息回答了“为什么被抛出”。

Java异常机制用到的几个关键字：try catch finally throw throws
* try 用于监听。将要被监听的代码(可能别抛出异常的代码)放在try语句块只能，当try语句内发生异常时，异常就被抛出。
* catch 用于捕捉异常。catch 用来捕捉try语句块中发生的异常。
* <font color='red'>finally finally 语句块总是会被执行。它主要用于回收再try块里打开的物力资源(如数据库连接，网络连接和磁盘文件)。只有finally块，执行完成之后，才会回来执行try或者catch 块中的return 或者throw 语句，如果finally 中使用了return 或者throw等终结方法的语句，则就不会跳回执行，直接停止。</font>
* throw --用于抛出异常
* throws --用在方法签名中，用于声明该方法是可能抛出的异常

### 了解try和catch的基本用法
[Code](Code/Demo1.java)
在try语句块中有除数为0的操作，该操作会抛出java.lang.ArithmeticException异常。通过catch，对该异常进行捕获。
观察结果我们发现，并没有执行System.out.println("i="+i)。这说明try语句块发生异常之后，try语句块中的剩余内容就不会再被执行了。

### 了解finally的基本用法
[Code](Code/Demon2.java)

### 了解throws和throw的基本用法
[Code](Code/Demo3.java)
