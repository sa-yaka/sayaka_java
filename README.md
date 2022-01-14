# JVL_Project
---
项目简介
--
- **代码环境:** Archlinux
- **JDK:** JDK 11
- **项目地址:** [JVL_Project](https://github.com/Sni-anr/JVL_Project)
---
# 基本结构                
---
## 简单的 java 程序
首先写一个最简单的 java 程序，他只发送一条消息在控制台窗口中：
```java
public class FirstSample {  
 public static void main(String[] args) {  
 System.out.println("We will not use 'Hello,World!'");  
//        object.method(parameters)   println 每次调用都在新的一行上  
 }  
}
```
几乎所有的 java 程序都具有这种结构，一次还是要花时间来研究一下的。首先，java区分大小写。这与大部分编程语言一样，如果出现了大小写拼写错误，程序将无法运行。

关键字 public 被称为访问修饰符，这些修饰符用于控制程序的其他部分对这段代码的访问级别。
关键字 class 表示 java 程序中的全部内容都包含在类中，后面跟着的是类名。

> 注意：类名必须要与源代码文件名相同。

println 每次调用都在新的一行上，而 print在打印之后不会换行。

在 intellij idea 中 注释的快捷键为 `Ctrl + /` 或者 `Ctrl + Shift + /`。

## 数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

**byte：**

-   byte 数据类型是8位、有符号的，以二进制补码表示的整数；
-   最小值是 -128（-2^7）；
-   最大值是 127（2^7-1）；
-   默认值是 0；
-   byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
-   例子：byte a = 100，byte b = -50。

**short：**

-   short 数据类型是 16 位、有符号的以二进制补码表示的整数
-   最小值是 -32768（-2^15）；
-   最大值是 32767（2^15 - 1）；
-   Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
-   默认值是 0；
-   例子：short s = 1000，short r = -20000。

**int：**

-   int 数据类型是32位、有符号的以二进制补码表示的整数；
-   最小值是 -2,147,483,648（-2^31）；
-   最大值是 2,147,483,647（2^31 - 1）；
-   一般地整型变量默认为 int 类型；
-   默认值是 0 ；
-   例子：int a = 100000, int b = -200000。

**long：**

-   long 数据类型是 64 位、有符号的以二进制补码表示的整数；
-   最小值是 -9,223,372,036,854,775,808（-2^63）；
-   最大值是 9,223,372,036,854,775,807（2^63 -1）；
-   这种类型主要使用在需要比较大整数的系统上；
-   默认值是 0L；
-   例子： long a = 100000L，Long b = -200000L。  
    "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

**float：**

-   float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
-   float 在储存大型浮点数组的时候可节省内存空间；
-   默认值是 0.0f；
-   浮点数不能用来表示精确的值，如货币；
-   例子：float f1 = 234.5f。

**double：**

-   double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数；
-   浮点数的默认类型为 double 类型；
-   double类型同样不能表示精确的值，如货币；
-   默认值是 0.0d；

**boolean：**

-   boolean数据类型表示一位的信息；
-   只有两个取值：true 和 false；
-   这种类型只作为一种标志来记录 true/false 情况；
-   默认值是 false；
-   例子：boolean one = true。

**char：**

-   char 类型是一个单一的 16 位 Unicode 字符；
-   最小值是 \u0000（十进制等效值为 0）；
-   最大值是 \uffff（即为 65535）；
-   char 数据类型可以储存任何字符；
-   例子：char letter = 'A';。

### 整形

整形用来表示没有小数部分的数值，允许是负数，Java 提供了四种整形：

|类型|int|short|long|byte|
| ---- | ---- | ---- | ---- | ---- |
|存储需求|4字节|2字节|8字节|1字节|

> 在 Java 中，整形的范围与机器无关，这解决了在程序移植中出现的部分问题。
> 
> Java 没有任何无符号整形。

### 浮点型
浮点型用于表示没有小数部分的数值，在 Java 中存在两种浮点型，float 和 double。

|类型|float|double|
| ---- | ---- | ---- | 
|存储需求|4字节|8字节|

double 型的精度是 float 型的两倍，但是由于 float 的有效为较少（6 ～ 7 位有效数字），所以在通常情况下使用 double 型。

> float 型的数值后缀为 `F` 或者 `f`
> double 型的数值后缀为 `D` 或者 `d`

下面是用于表示出错或者溢出时的特殊浮点数值：

- 正无穷大
- 负无穷大
- NaN（不是一个数字）

### 字符型（char）

字符类型 char 表示一个字符。Java的 char 类型除了可表示标准的ASCII外，还可以表示一个Unicode字符。

注意`char`类型使用单引号`'`，且仅有一个字符，要和双引号`"`的字符串类型区分开。

### 布尔类型

布尔类型 boolean 只有`true`和`false`两个值，布尔类型总是关系运算的计算结果：

```
boolean b1 = true;
boolean b2 = false;
boolean isGreater = 5 > 3; // 计算结果为true
int age = 12;
boolean isAdult = age >= 18; // 计算结果为false
```

Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是通常JVM内部会把 boolean 表示为4字节整数。 

## 变量与常量

### 声明变量

在使用变量前，需要先声明变量，先指定变量类型，然后是变量名。

Java 的变量名介绍读部分的 Unicode 字符，但是`+` 这样的符号，以及空格不能出现在变量名中。

### 初始化变量

在声明变量后，必须使用赋值语句对变量进行初始化。下面是几种初始化变量的方法：
```java
int dDays
dDays = 12;

// 将声明与赋值写在一排也是可以接受的。
int dDays = 12;
```

将声明变量写在第一次使用变量的附近，这是一个好习惯。

### 局部变量

在 Java 10 中，局部变量不需要类型声明，而使用关键字 `var` 即可：
```java
var vactionDays = 12;
var greeting = "Hello";
```

### 常量

在 Java 中，关键字 final 表示常量。

关键子 final 表示这个常量只赋值一次，赋值之后就不能更改了。常量名使用全大写。

在 Java中，如果想把一个常量在一个类的多个地方使用，可以将他设置为类常量。使用关键字 static final 设置一个类常量：
```java
public class Constants {  
 public static final double CM_PER_INCH = 2.54;  
  
    public static void main(String[] args) {  
 double paperWeight = 8.5;  
        double paperHeight = 11;  
        System.out.println("Paper size in centimeters:"  
 + paperWeight * CM_PER_INCH + " by "  
 + paperHeight * CM_PER_INCH);  
    }  
}
```

由于常量定义于 main 外，所以在同一个类中用其他方法也可以使用这个常量。而且，如果常量被声明为 public，那么其他类的方法也可以使用这个常量。

### 枚举
在一个有限合集中，可以使用枚举类型来存储：
```java
enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
//现在 可以声明这种类型的变量
Size s = Size.MEDIUM
```

  ## 数学函数
  在 Java 中，包含了各种数学函数，如要计算一个数的平方跟的时候：
  ```java
double x = x;
y = Math.sqrt(x);
System.out.println(y);
//这将在屏幕上打印 2.0
```

在 Java 中，没有幂运算，所以就要使用 Math 类 的 pow方法：
```java
double y = Math.pow(x,a);
```
将 `y` 的值设置为 `x` 的 `a` 次方。pow接受 2 个 double 类型的值，返回的也是一个 double 类型的值。

## 数值类型转换

![[java_to_value.png]]
图中的六个实线箭头，表示无精度丢失的转换；另外三个虚线箭头表示有精度丢失的转换。
- 如果两个操作数中有一个是 double 型 那么另一个也会被转换为 double 型。
- 否则，如果两个操作数中有一个是 float 型 那么另一个也会被转换为 float 型。
- 否则，如果两个操作数中有一个是 long 型 那么另一个也会被转换为 long 型。
- 否则，两个操作数都会被转换为 int 型。

### 强制类型转换

Java 除了自动转换以外，还可以强制转换：
```java
double x = 9.997;
int nx = int (x);
// nx = 9
```

如果想对浮点数进行舍入运算，以更接近整数，这时就要使用到 `Math.round(x0` 方法：
```java
double x = 9.997;
int nx = int Math.round(x);
// nx = 10
```

round 返回的值为 long 型，所以仍需要强制转换将他转为 int 型。

## boolean 运算

对于布尔类型 boolean，永远只有`true`和`false`两个值。

布尔运算是一种关系运算，包括以下几类：

-   比较运算符：`>`，`>=`，`<`，`<=`，`==`，`!=`
-   与运算 `&&`
-   或运算 `||`
-   非运算 `!`

下面是一些示例：

```
boolean isGreater = 5 > 3; // true
int age = 12;
boolean isZero = age == 0; // false
boolean isNonZero = !isZero; // true
boolean isAdult = age >= 18; // false
boolean isTeenager = age >6 && age <18; // true
```

关系运算符的优先级从高到低依次是：

-   `!`
-   `>`，`>=`，`<`，`<=`
-   `==`，`!=`
-   `&&`
-   `||`

### 短路运算

布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。

因为`false && x`的结果总是`false`，无论`x`是`true`还是`false`，因此，与运算在确定第一个值为`false`后，不再继续计算，而是直接返回`false`。
```java
public class Main {
    public static void main(String[] args) {
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);
    }
}
```

如果没有短路运算，&& 后面的表达式会由于除数为 0 而报错，但实际上该语句并未报错，原因在于与运算是短路运算符，提前计算出了结果`false`。

如果变量 b 的值为 true ，则表达式变为`true && (5 / 0 > 0)`。因为无法进行短路运算，该表达式必定会由于除数为 0 而报错，可以自行测试。

类似的，对于 || 运算，只要能确定第一个值为`true`，后续计算也不再进行，而是直接返回`true`：

```java
boolean result = true || (5 / 0 > 0); // true
```

### 三元运算符

Java还提供一个三元运算符`b ? x : y`，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果。示例：

```java
public class Main {
    public static void main(String[] args) {
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println(x);
    }
}
```
上述语句的意思是，判断`n >= 0`是否成立，如果为`true`，则返回 n，否则返回 -n。这实际上是一个求绝对值的表达式。

注意到三元运算`b ? x : y`会首先计算 b ，如果 b 为`true`，则只计算 x ，否则，只计算 y 。此外， x 和 y 的类型必须相同，因为返回值不是 boolean ，而是`x`和`y`之一。



