### 3.1 更简单的打印语句
静态导入、import static

### 3.2 Java 操作符 
String 类支持 + 和+=

### 3.3 优先级

### 3.4 赋值
引用

### 3.5 算数操作符

3.5.1 
一元减号和一元加号，与二元减号、三元加号都是用相同的符号，编译器能够自动识别
eg: x=a*-b  ==> x=a*(-b)

### 3.6 自增和自减
前缀和后缀

### 3.7 关系操作符
3.7.1 测试对象的等价性
==不能用来判断对象是否想等
equal 能判断内容，前提是<font color=red>重写</font>了equal 方法
否则equals 默认比较的是<font color=red>引用</font>

### 3.8 逻辑操作符
<font color=red>短路</font>短路的特点

### 3.9 直接常量 
char 两个字节16位
short 两个字节，最大值ox7fff,有符号
指数记数

### 3.10 按位操作
与(&)、或(|)、非(~)、异或(^)

### 3.11 移位
 左移(<<)、右移(>>)[若符号位正，高位补0，若符号为负，高位补1]
 无符号右移(>>>)
<font color=red>对char byte或short 类型进行移位处理，那么在移位进行之前、会被转化为int型，结果也是int</font>

### 3.12 三元操作符号 

### 3.13 字符串操作 +和+=

### 3.14 操作符的常见错误
==和=

### 3.15 类型转换
3.15.1 
窄转化是，浮点==>整型 截尾
四舍五入方法(round)
3.15.2 类型提升

### 3.16 Java 无sizeof

### 3.17 小结
<font color =red>注:</font>除了bool类型，其他类型均可以相互转化。



