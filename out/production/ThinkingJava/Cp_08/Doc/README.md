### 8.1 再论向上转型
对象既可以作为它自己本身的类型使用，也可以作为它的基类进行使用。
#### 8.1.1 忘记对象类型
记得类型的基本类型

### 8.2 转机

#### 8.2.1 方法调用绑定 
前期绑定，后期绑定(动态绑定)

#### 8.2.2 产生正确的行为
Java中大部分的方法都是通过动态绑定实现多态，除了final 和statis 方法(private 方法是final 方法)

#### 8.2.3 可拓展性

#### 8.2.4 缺陷:域与静态方法
[Code](../Code/Sub.java)

静态方法是和类而非单个对象相关联。

### 8.3 构造器与多态
构造器的调用，遵循
* 调用基类构造器，是一个递归过程，一直到最底层的类。
* 按声明的顺序调用成员的初始化方法
* 调用导出类的构造器主体

#### 8.3.2 继承与清理

#### 8.3.3 构造器内部的多态和方法
初始化的实际过程[Code](../Code/PolyConstructors.java)
    *   在其他任何事物发生之前，将分配给对象的存储空间初始化成二进制的零。
    * 如前述那样调用基类构造器。此时，调用被覆盖后的draw方法(要在调用RoundGlyph构造器调用之前)，由于步骤一的缘故，我们此时会发现radius的值为0
    * 按照声明的顺序调用成员的初始化方法。
    * 调用导出类的构造器

### 8.4 协变返回类型
Java SE5 中添加了协变返回类型，它表示在导出类中的被覆盖方法可以返回基类方法的返回乐星的某种导出类型。
[Code](../Code/CovarianReturn.java)


### 8.5 用继承进行设计