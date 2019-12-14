字符串是计算机程序设计中最常见的行为。

### 13.1 不可变String
String 对象是不可变的，String 类中每一个看起来会修改String值的方法，实际上都是创建一个全新的String对象，以包含修改后的字符串内容，而最初的String对象则丝毫未动。
[Code](Code/Immutable.java)

### 13.2 重载“+”与StringBuilder
String对象是不可变的，不可变性会带来一定的效率问题。为String对象重载的"+"操作符就是一个例子。重载的意思是，一个操作符在应用于特定类时，被赋予了特殊的意义(用于String的“+”和"+="是Java中仅有的两个重载过的操作符)

对String使用"+"和"+="的时候，会创建StringBuilder对象。
如果使用了循环，可能会重复创建StringBuilder，所以在循环多的时候，用StringBuilder。
StringBuilder提供了丰富而全面的方法，包括insert,replace,sustring,甚至reverse,但是最常见的还是append()和toString,还有delete方法。

StringBuilder是JavaSE5引入的，在这之前Java用的是StringBuilder.后者是线程安全的，因此开销也会大一些。

### 13.3 无意识的递归
Java中的每个类从根本上都是继承自Object,标准容器自然也不例外。因此容器类都有toString方法并且覆写了该方法，是的它生成的String结果能够表达容器自身，以及容器所包含的对象。
[Code](Code/ArrayListDisp.java)

如果希望toString方法打印出对象的内存地址，可以重写对象的toSting方法，输出this.

### 13.4 String 上的操作
很多方法

### 13.5 格式化输出
JavaSE5之后终于推出了c语言中printf()风格的格式化输出这一功能，不仅使得控制输出的代码更简单，同时也给Java开发者对于输出格式与排列更强大的控制能力。

#### 13.5.1 printf
c语言中的printf

#### 13.5.2 System.out.format()
JavaSE5引入的format方法可用于PrintStream或PrintWriter,format模范自c的printf
[Code](Code/)

#### 13.5.3 Formatter类
在Java中,所有新的格式化功能都由java.util.Fromatter
%d %s

#### 13.5.4 格式化说明符
在插入数据的时候，如果想要控制空格与对齐，需要更精细复杂的格式修饰符。

#### 13.5.5 Formatter转换
d 整数型、c unicode字符、b bool值、s String、f 浮点数、e 浮点数、x 整数、h 散列码 、% 字符%

#### 13.5.6 String.format()
一个十六进制转储工具

### 13.6 正则表达式
String 类自带了一个非常有用的正则表达式工具 split(),其功能是“将字符串从正则表达式匹配的地方切开”。还有一个重载的版本，可以限制切割的次数。


### 13.7 扫描输入
Scanner

#### 13.7.1 Scanner定界符
[Code_ScannerDelimiter](Code/ScannerDelimiter.java)

#### 13.7.2
用正则表达式扫描