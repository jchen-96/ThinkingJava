如果一个程序只包含固定数量的且生命周期都是已知的对象，那么这是一个非常简单的程序。
### 11.1 泛型和类型安全的容器
在使用JavaSE5 之前的容器的一个主要问题就是编译器允许你想容器中插入不正确的类型。
将两个不同的实例放在同一个容器中，java中会报警告信息。在这里我们可以使用JavaSE5 所特有的注解来抑制了警告信息。

[Code](../Code/ApplesAndOranges.java)
上面例子中，一个类没有显式的声明继承自哪个类，那么它自动继承自Object.所以通常在定义的时候使用<Apple>指定类型参数，可以避免将错误的类型放到容器中。

### 11.2 基本概念
Java容器类库的用途是"保存对象"，并将其划分为两个不同的概念。
* Collection。一个独立元素的序列，这些元素都服从一条或者多条规则.List必须按照插入的顺序保存元素，而Set不能有重复元素。Queue按照队列规则，来确定对象产生的顺序(通常与他们被插入的顺序相同)。
* Map，一组成对"键值对"，允许你使用键来查找值，ArrayList允许你使用数字来查找值，因此在某种意义上，它将数字与对象关联在一起了。


```java
List<Apple> apples=new ArrayList<Apple>();
```
上面ArrayList已经被向上转型为了List。使用接口的目的在于如果你决定去修改实现，你只需要在创建的时候进行修改。
```java
List<Apple> apples=new LinkedList<Apple>();
```
但是这种方法并不总能奏效，因为某些类具有额外的功能。这时候就要使用具体的类，而不能用上层通用的接口。

Collection接口概括了序列的概念，一种存放一组对象的方式。下面这个简单的实例用Integer对象填充了一个Collection,然后打印多有产生容器中的所有元素。

[Code](../Code/SimpleCollection.java)


### 11.3 添加一组元素
Arrays.asList() 方法接收一个数组或是一个用逗号分隔的元素列表。
[Code](../Code/AddingGroups.java)

asList存在的问题，该方法的限制是对所产生的list的类型做了最理想的假设，而并没有注意你对它会赋予什么样的类型。有时候会引发问题。
[Code](../AsListInference.java)
并没有出现书上的编译不通过的情况。

### 11.4 容器的打印
直接看代码
[Code](../PrintingContainers.java)

### 11.5 List
有两种类型的List,
* 基本的ArrayList,它长于随机访问元素，但是在List中间插入和移除元素的时候比较慢。
* LinkedList,它通过代价较低的在List中间进场插入和删除操作，提供了优化的顺序访问。LinkedList 在随机访问方面则比较慢，但是它的特性集较ArrayList更大。

### 11.6 迭代器
迭代器(也是一种设计模式)的概念可以用于达成此目的。迭代器是一个对象，它的工作是遍历序列中的对象。

### 11.7 LinkedList 
LinkedList 也像ArrayList一样实现了基本的List接口，但是它执行某些操作的时候比ArrayList更高效，但是随机访问操作方面却要逊色一些。

LinkedList 还添加了可以使其用作栈和队列或者双端队列的方法。

### 11.8 Stack
LinkedList 具有能够直接实现栈所有功能的方法，因此可以直接将LinkedList作为栈使用。

### 11.9 Set
Set不保存重复的元素,Set 具有与Collection完全一样的接口，因此没有任何额外的功能，不同于前面有两个不同的List。实际上Set就是Collection,只是行为不同，(这是继承与多态的典型应用:表现不同的行为)

HashSet是无序的，TreeSet是有序的。

### 11.10 Map
将对象映射到其他对象的能力是一种解决编程问题的杀手锏。例如，随机数次数的统计
[Code](../Code/Statistics.java)
Tips:容器可以直接用System.out.println()输出

Map 与数组这些其他的Collection一样，可以很容易的拓展到多维，而我们只需将其值设置为Map.假设你正在跟踪拥有多个宠物的人，你所需要的只是一个Map<Preson,List<Pet>>

Map,可以返回keySet

### 11.11 Queue
队列是一个典型的先进先出的容器，即从容器的一端放入事物，从另一端取出来。

#### 11.11.1 PriorithQueue 
优先队列的例子
[Code](../Code/PriorityQueueDemon.java)

Integer String 和Character 可以与PriorityQueue一起工作，因为这些类已经内建了自然排序。如果你想在Priority中使用自己的类，就必须包含额外的功能以来产生自然排序，或者必须提供自己实现的Compactor.

### 11.12 Collection 和iterator
Collection 是描述所有序列容器共性的根接口，它可能被认为是一个"附属接口"，即因为要表示其他若干个接口的共性而出现的接口。另外AbstractCollection类提供了Collection的默认实现。

实现Collection或者实现Iterator ？ Iterator更轻量级

生成Iterator是将队列与消费队列的方法连接在一起耦合度最小的方式，并且与实现Collection相比，他在序列类上所施加的约束也是最小的。

### 11.13 Foreach 与迭代器
任何实现了Iterable的类，都可以用于foreach语句中。
[Code](../Code/IterableClass.java)

### 11.13.1 适配器方法惯用法
反向迭代器的能力
[Code](../Code/AdaptorMethodIdiom.java)
