
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

## 字符串

在 Java 中字符串叫 String，每个用双引号括起来的都是 String 字符串的一个实例。
```java
String greeting = "Welcome to Java!";
String e = "Hello";
```

### 子串
String 类的 substring 方法可以从一个较大的字符串中提取出一个子串。
```java
String greeting = "Welcome to Java!";
String s = greeting.substring(0,6);
// println(s); 将打印 Welcome
```

### 拼接
在 Java 中，可以使用 + 来连接两个字符串：
```java
String expletive = "Expletive";
String PG13 = "deleted";
String massage = expletive + PG13;
// printle(massage); 将打印 Expletivedeleted
```

将一个字符串与一个非字符串连接时，会将后者（任何类型）转换为字符串。

在 Java 中，还提供了一个 repeat 方法：
```java
String repeated = "Java".repeat(3);
// 打印 JavaJavaJava
```

### 不可变字符串

String 类中，没有提供修改修改字符串中某个字符的方法。但是可以使用 substring 或者 replace 的方法。

```java
public class StringReplaceEmp {  
 public static void main(String[] args) {  
 String str = "Hello World";  
        System.out.println(str);  
//      substring 方法  
 System.out.println(str.substring(0, 5) + " Java");  
        for (int i = 0; i < 5; i++) {  
 System.out.print("==");  
        }  
 System.out.println("\n" + str);  
//      Java replace() 方法  
 System.out.println(str.replace('H', 'W'));  
        System.out.println(str.replaceFirst("He", "Wa"));  
        System.out.println(str.replaceAll("He", "Ha"));  
    }  
}
```

### 检测字符串是否相等
可以使用 equals 来检测两个字符串内容是否相等。
```java
s.equals(t);
"Hello".equals("Hello.");
"Hello".equals(str);
//这些表达式都是合法的
```

如果字符串 s 与字符串 t 相等，则返回 `true` 否则就返回 `false`。

要想检测两个字符串内容是否相等，但是忽略大小写可以使用 equalsIgnoreCase 方法。
```java
"Hello".equalsIgnoreCase(str);
```

### 码点与码单元

lenght 方法将返回采用 UTF-16 编码表示给定字符串所需的代码单元数量。

```java
String greeting = "Hello";
int n =  greeting.length(); //is 5
```

要想得到实际的长度，也就是码点数量，可以调用：
```java
int cpCount = greeting.codePointCount(0, greeting.length());
```

调用 s.charAt(n) 将会返回第 n 位的码元（ 0 <= n <= langth() - 1 ）。

```java
int index = greeting.offsetByCodePoints(0,1);
int cp = greeting.codePointAt(index);
```

一个 Unicode 字符就是一个码点，Unicode 的常用字符对应一个代码单元，辅助字符对应两个代码单元。

```java
// 测试 码元 码点 length codePointCount charAt offsetByCodePoints codePointAtpublic class LengthCodePointCount {  
 public static String greeting = "Hello\uD835\uDD46"; // 𝕆  
  
 public static void main(String[] args) {  
 int unCode = greeting.length();                            // 码元个数 常用字符集一个码元，辅助字符集两个码元。  
 System.out.println(greeting + " code unit is " + unCode);  
  
        for (int i = 0; i < 5; i++) {  
 System.out.print("===");  
        }  
  
 int cp = greeting.codePointCount(0, greeting.length());  
        System.out.println("\nThe code Point is " + cp);           //码点个数，一个 Unicode 字符就是一个码点。  
  
 for (int i = 0; i < 5; i++) {  
 System.out.print("===");  
        }  
  
 char first = greeting.charAt(0);  
        char last = greeting.charAt(greeting.length() - 1);  
  
        System.out.println("\nThe first code unit is " + first);   //第一个码元，显示字符 H System.out.println("The last code unit is " + last);        //最后一个码元，辅助字符集𝕆 char 无法存储（？）  
  
 for (int i = 0; i < 5; i++) {  
 System.out.print("===");  
        }  
  
 int index = greeting.offsetByCodePoints(0, 5);  
        cp = greeting.codePointAt(index);  
        System.out.println("\nThe last code point is " + Integer.toHexString(cp));       //码点 一般为 16 进制数  
 }  
  
}
```

## 输入输出

### 读取输入
“标准输出流“只需要 `System.out.println` ，然而读取“标准输入流“却不止这么简单了。想要创建标准输入流需要先构建一个与“标准输入流” `System.in` 关联的Scanner 对象。

```java
Scanner in = new Scanner(Systtem.in);
```

现在，就可以使用 Scanner 类的各种方法来读取输入了。例如，nextLine 方法将读取一行输入。
```java
System.out.printl("Watt is your name ?");
String name = in.nextLine();
```

这里使用 nextLine 方法是因为在输入中可能有空格。而想要读取一个单词（一空格结尾），就可以调用 next 方法：
```java
String firstName = in.next;
```

想要读取一个整数，就调用 nexxtInt 方法：
```java
System.out.printl("How old are you ?");
String age = in.nexInt();
```

于此类似，想要读取一个浮点数就调用nextDouble 方法。

最后在程序最前面添加一行代码：
```java
import java.util.*
```

Scanner 类定义在 java.util 包中，当使用的类不再java.lang 包中时，一定要使用 import 指令导入相应的包。

```java
import java.util.*;  
  
public class inputTest {  
 public static void main(String[] args) {  
 Scanner in = new Scanner(System.in);  
  
        System.out.print("Enter your name : ");  
        String name = in.nextLine();  
  
        System.out.print("Enter your age : ");  
        int age = in.nextInt();  
  
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));  
    }  
}
```

#### char 类型的数据输入
由于Scanner类只提供了字符串String类的输入方式,没有char类型的输入方法，但是，我们可以使用 java 提供的 charAt(x) 方法来实现。
```java
import java.util.Scanner;

public class CharGet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      利用charAt(n);方法,这个方法可以返回字符串第n个位置的字符。
        char character = scanner.next().charAt(0);
        System.out.println((int) character);
    }
}
```


### 格式化输出

在 Java 中，沿用了 C 语言中库函数 printf 方法，例如：
```java
// println
double x = 10000.0 / 3.0;
System.out.println(x);
// 打印 3333.33333333335;


// printf
System.out.printf("%8.2f",x);
// 打印 333.33
```

下面是一下其他格式化的例子：
```java
import java.util.Date;  
  
/*
 * 使用printf输出  
 */  
/*关键技术点  
 * 使用java.io.PrintStream的printf方法实现C风格的输出  
 * printf 方法的第一个参数为输出的格式,第二个参数是可变长的,表示待输出的数据对象  
 */public class Printf {  
  
 public static void main(String[] args) {  
 /* 输出字符串 */ // %s表示输出字符串，也就是将后面的字符串替换模式中的%s  
 System.out.printf("%s", new Integer(1212));  
        // %n表示换行  
 System.out.printf("%s%n", "end line");  
        // 还可以支持多个参数  
 System.out.printf("%s = %s%n", "Name", "Zhangsan");  
        // %S将字符串以大写形式输出  
 System.out.printf("%S = %s%n", "Name", "Zhangsan");  
        // 支持多个参数时，可以在%s之间插入变量编号，1$表示第一个字符串，3$表示第3个字符串  
 System.out.printf("%1$s = %3$s %2$s%n", "Name", "san", "Zhang");  
  
        /* 输出boolean类型 */ System.out.printf("true = %b; false = ", true);  
        System.out.printf("%b%n", false);  
  
        /* 输出整数类型*/  
 Integer iObj = 342;  
        // %d表示将整数格式化为10进制整数  
 System.out.printf("%d; %d; %d%n", -500, 2343L, iObj);  
        // %o表示将整数格式化为8进制整数  
 System.out.printf("%o; %o; %o%n", -500, 2343L, iObj);  
        // %x表示将整数格式化为16进制整数  
 System.out.printf("%x; %x; %x%n", -500, 2343L, iObj);  
        // %X表示将整数格式化为16进制整数，并且字母变成大写形式  
 System.out.printf("%X; %X; %X%n", -500, 2343L, iObj);  
  
        /* 输出浮点类型*/  
 Double dObj = 45.6d;  
        // %e表示以科学技术法输出浮点数  
 System.out.printf("%e; %e; %e%n", -756.403f, 7464.232641d, dObj);  
        // %E表示以科学技术法输出浮点数，并且为大写形式              
System.out.printf("%E; %E; %E%n", -756.403f, 7464.232641d, dObj);  
        // %f表示以十进制格式化输出浮点数  
 System.out.printf("%f; %f; %f%n", -756.403f, 7464.232641d, dObj);  
        // 还可以限制小数点后的位数  
 System.out.printf("%.1f; %.3f; %f%n", -756.403f, 7464.232641d, dObj);  
  
        /* 输出日期类型*/  
 // %t表示格式化日期时间类型，%T是时间日期的大写形式，在%t之后用特定的字母表示不同的输出格式  
 Date date = new Date();  
        long dataL = date.getTime();  
        // 格式化年月日  
 // %t之后用y表示输出日期的年份（2位数的年，如99）  
 // %t之后用m表示输出日期的月份，%t之后用d表示输出日期的日号  
 System.out.printf("%1$ty-%1$tm-%1$td; %2$ty-%2$tm-%2$td%n", date, dataL);  
        // %t之后用Y表示输出日期的年份（4位数的年），  
 // %t之后用B表示输出日期的月份的完整名， %t之后用b表示输出日期的月份的简称  
 System.out.printf("%1$tY-%1$tB-%1$td; %2$tY-%2$tb-%2$td%n", date, dataL);  
  
        // 以下是常见的日期组合  
 // %t之后用D表示以 "%tm/%td/%ty"格式化日期  
 System.out.printf("%1$tD%n", date);  
        //%t之后用F表示以"%tY-%tm-%td"格式化日期  
 System.out.printf("%1$tF%n", date);  
  
        /*输出时间类型*/  
 // 输出时分秒  
 // %t之后用H表示输出时间的时（24进制），%t之后用I表示输出时间的时（12进制），  
 // %t之后用M表示输出时间的分，%t之后用S表示输出时间的秒  
 System.out.printf("%1$tH:%1$tM:%1$tS; %2$tI:%2$tM:%2$tS%n", date, dataL);  
        // %t之后用L表示输出时间的秒中的毫秒  
 System.out.printf("%1$tH:%1$tM:%1$tS %1$tL%n", date);  
        // %t之后p表示输出时间的上午或下午信息  
 System.out.printf("%1$tH:%1$tM:%1$tS %1$tL %1$tp%n", date);  
  
        // 以下是常见的时间组合  
 // %t之后用R表示以"%tH:%tM"格式化时间  
 System.out.printf("%1$tR%n", date);  
        // %t之后用T表示以"%tH:%tM:%tS"格式化时间  
 System.out.printf("%1$tT%n", date);  
        // %t之后用r表示以"%tI:%tM:%tS %Tp"格式化时间  
 System.out.printf("%1$tr%n", date);  
  
        /* 输出星期*/  
 // %t之后用A表示得到星期几的全称  
 System.out.printf("%1$tF %1$tA%n", date);  
        // %t之后用a表示得到星期几的简称  
 System.out.printf("%1$tF %1$ta%n", date);  
  
        // 输出时间日期的完整信息  
 System.out.printf("%1$tc%n", date);  
    }  
}  

/*  
 *printf方法中,格式为"%s"表示以字符串的形式输出第二个可变长参数的第一个参数值;  
 *格式为"%n"表示换行;格式为"%S"表示将字符串以大写形式输出;在"%s"之间用"n$"表示  
 *输出可变长参数的第n个参数值.格式为"%b"表示以布尔值的形式输出第二个可变长参数  
 *的第一个参数值.  
 *
 * 格式为"%d"表示以十进制整数形式输出;"%o"表示以八进制形式输出;"%x"表示以十六进制  
 * 输出;"%X"表示以十六进制输出,并且将字母(A、B、C、D、E、F)换成大写.格式为"%e"表  
 * 以科学计数法输出浮点数;格式为"%E"表示以科学计数法输出浮点数,而且将e大写;格式为  
 * "%f"表示以十进制浮点数输出,在"%f"之间加上".n"表示输出时保留小数点后面n位.  
 *
 * 格式为"%t"表示输出时间日期类型."%t"之后用y表示输出日期的二位数的年份(如99)、用m  
 * 表示输出日期的月份,用d表示输出日期的日号;"%t"之后用Y表示输出日期的四位数的年份  
 * (如1999)、用B表示输出日期的月份的完整名,用b表示输出日期的月份的简称."%t"之后用D  
 * 表示以"%tm/%td/%ty"的格式输出日期、用F表示以"%tY-%tm-%td"的格式输出日期.  
 *
 * "%t"之后用H表示输出时间的时(24进制),用I表示输出时间的时(12进制),用M表示输出时间  
 * 分,用S表示输出时间的秒,用L表示输出时间的秒中的毫秒数、用 p 表示输出时间的是上午还是  
 * 下午."%t"之后用R表示以"%tH:%tM"的格式输出时间、用T表示以"%tH:%tM:%tS"的格式输出  
 * 时间、用r表示以"%tI:%tM:%tS %Tp"的格式输出时间.  
 *
 * "%t"之后用A表示输出日期的全称,用a表示输出日期的星期简称.  
 */
```

### 文件输入输出

要想输入文件，需要先构建一个 Scanner 对象：
```java
Scanner in = new Scanner(Path.of("file.txt"), StandardCharsets.UTF_8);
```

如果文件中包含反斜杠符号 `\` ，那么就需要添加一个额外的反斜杠符号 `\\` ，例如：
```java
"C:\\file\\myfile.txt"
```

如果想要写入文件，就需要构建一个 PrintWriter 对象。
```java
PrintWriter out = new PrintWriter("myfile.txt", StandardCharsets.UTF_8);
```

如果使用集成开发环境，可以使用下面的调用找到这个目录的位置：
```java
String dir = System.get.Property("user.dir");
```

## Java 循环结构

顺序结构的程序语句只能被执行一次。

如果您想要同样的操作执行多次，就需要使用循环结构。

Java中有三种主要的循环结构：

-   **while** 循环
-   **do…while** 循环
-   **for** 循环

在Java5中引入了一种主要用于数组的增强型for循环。

### while 循环

while是最基本的循环，它的结构为：
```java
while( 布尔表达式 ) { //循环内容 }
```
只要布尔表达式为 true，循环就会一直执行下去。如果开始时循环条件的值就为 false，那么 while 循环将不执行。

### do…while 循环

对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。

do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。


**注意：**布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false。

```java
public class Test {  
 public static void main(String[] args) {  
 int x = 10;  
        do {  
 System.out.print("value of x : " + x);  
            x++;  
            System.out.print("\n");  
        } while (x < 20);  
    }  
}
```

### for循环

虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。

for循环执行的次数是在执行前就确定的。语法格式如下：

for(初始化; 布尔表达式; 更新) { //代码语句 }

关于 for 循环有以下几点说明：

-   最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
-   然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
-   执行一次循环后，更新循环控制变量。
-   再次检测布尔表达式。循环执行上面的过程。
```java
public class Welcome {  
 public static void main(String[] args) {  
 String greeting = "Welcome to Java!";  
        System.out.println(greeting);  
        for (int i = 0; i < greeting.length(); i++)  
 System.out.print("=");  
        System.out.println();  
    }  
}
```

> 在 for 循环中，检测浮点数是否相等时要格外小心，程序可能永远不会结束。因为舍入的误差，可能永远无法达到精确的最终值。

## switch 语句

在处理多个选项时，使用 if / else 的结构可能有些臃肿。还在 Java 中有一个与 C/C++ 完全一样的 switch 语句。
```java
switch (expression) {  
 case value:  
        //语句  
 break; //可选  
 case value:  
        //语句  
 break; //可选  
 //你可以有任意数量的case语句  
 default: //可选  
 //语句
```

switch 将从与选项匹配的 case 标签开始执行，直到遇到 break 语句，或者执行到 switch 语句的结束为止。如果没有相匹配的 case 标签，但是有 default 子句，就会执行这个子句。

switch case 语句有如下规则：

-   switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
    
-   switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。
    
-   case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
    
-   当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
    
-   当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
    
-   switch 语句可以包含一个 default 分支，该分支一般是 switch 语句的最后一个分支（可以在任何位置，但建议在最后一个）。default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。
    

**switch case 执行时，一定会先进行匹配，匹配成功返回当前 case 的值，再根据是否有 break，判断是否继续输出，或是跳出判断。**

#### break

先来看看不带标签的 break 语句：
```java
while (year <= 100){
	balance += payment;
	double interest = interest = balance * interestRate / 100;
	balance += interest;
	if(balance > goal) break;
	year ++;
}
```

在循环开始时，如果 year > 100，或者在循环中 balance > goal 都会跳出循环。

Java 还有一种带标签的 break 语句，用于跳出多重嵌套的循环语句：
```java
read_date;
for (...){
	......;
	for (...){
		n = in.nextInt;
		if (n < 0) break read_date;
		......;
	}
}
......;
```

还有一种 continue 语句，与 break 语句一样，他会中断正常的控制流程，将回到内层循环的首部。如果使用 for 循环，他将跳到 for 循环的更新部分。

## 大数
如果基本的整数和浮点数无法满足精度要求，那么可以使用 java.math 包中的两个类：`BigInetger` 和 `BigDecimal`。这两个类可以包含任意长度数字序列的数值。 BigInetger 类实现任意精度的整数计算， BigDecimal 类实现任意精度的浮点数计算。

使用静态的 value0f 方法可以将普通的数值转为大数：
```java
BigInteger a = BigInteger.value0f(100);
```

对于更大的数，可以使用一个带字符串参素的构造器：

```java
BigInteger reallyBig = new BigInteger("1145141919810114514191981011451419198101145141919810");
```

另外还有一些常量：`BigInteger.ZERO`、`BigInteger.ONE`、`BigInteger.TEN`、`BigInteger.TOW`。

不过遗憾的是，大数不能使用我们熟悉的算数运算符处理，而是使用了大数类中的 add 和 multiply 方法。

```java
BigInteger c = a.add(b); // c = a + b
BigInteger d = a.multiply(b.add(BigInteger.value0f(2))); // d = c * (b + 2)
```

```java
        import java.math.BigInteger;  
        import java.util.Scanner;  
  
public class bigNumber {  
 public static void main(String[] args) {  
 Scanner sc = new Scanner(System.in);  
        BigInteger b1 = new BigInteger("123456789");  
        BigInteger b2 = new BigInteger("987654321");  
        System.out.println("加法操作：" + b2.add(b1));  
        System.out.println("减法操作：" + b2.subtract(b1));  
        System.out.println("乘法操作：" + b2.multiply(b1));  
        System.out.println("除法操作：" + b2.divide(b1));  
        System.out.println("最大数：" + b2.max(b1));  
        System.out.println("最小数：" + b2.min(b1));  
        BigInteger result[] = b2.divideAndRemainder(b1);  
        System.out.println("商是：" + result[0] + " " + "余数是：" + result[1]);  
    }  
  
}
```

## 数组
### 声明数组
在 java 中，有两种方法来声明数组：
```java
int[] a;
int a[];
```
上面的语句都声明了整形数组 `a`，不过要使它成为真正的数组就因该使用 `new` 操作符创建数组。
```java
int[] a = new int[100];
```

这条语句声明并且初始化了一个可以存储100个整数的数组。

数组长度并不要求一定是常量，`new int [n]` 就会创建一个长度为 n 的数组。

> 一旦创建了数组，就不能改变它的长度。

另外，你还可以使用如下的方式创建数组。

```java
int[] smallPrimes = {2, 3, 4, 5, 6, 7,};
```

使用这种方法创建数组不需要使用 `new` 甚至不需要指定长度。

```java
String name{
       Shinoi,
       Sayaka,
       Sni Syk.
};
```

还可以声明一个匿名数组：
```java
new int[] {100, 200, 300, 12, 20,};
```

### for each 循环

```java
        for (int element : a) {
            System.out.println(element);
        }
```

与

```java
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
```

一样都可以打印数组中的每一个元素。

```java
import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many unmbers do you need to draw? ");
        int k = in.nextInt(); // 多少次

        System.out.print("What is the highest number your can draw? ");
        int n = in.nextInt(); // 一共多少
        in.close();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) { // 池
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) { // 抽出的
            int r = (int) (Math.random() * n); // 随即浮点数
            result[i] = numbers[r];
            numbers[r] = numbers[r - 1];
            n--;
        }

        Arrays.sort(result); // 排序
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result) {
            System.out.println(r); // 输出结果
        }
    }
}
```

### 多维数组

```java
int[] [] magicSquare = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
```

因为 magicSquare 包含3个数组，因此，magicSquare.length为3。实际上ns在内存中的结构如下：

```
                              ┌───┬───┬───┬───┐
                   ┌───┐  ┌──>│ 1 │ 2 │ 3 │ 4 │
magicSquare ─────> │░░░│──┘   └───┴───┴───┴───┘
                   ├───┤      ┌───┬───┬───┬───┐
                   │░░░│─────>│ 5 │ 6 │ 7 │ 8 │
                   ├───┤      └───┴───┴───┴───┘
                   │░░░│──┐   ┌───┬───┬───┬───┐
                   └───┘  └──>│ 9 │10 │11 │12 │
                              └───┴───┴───┴───┘
```

如果我们定义一个普通数组arr0，然后把ns[0]赋值给它：

```java
public class Main {
    public static void main(String[] args) {
        int[][] magicSquare = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        int[] arr0 = ns[0];
        System.out.println(arr0.length); // 4
    }
}
```

实际上arr0就获取了ns数组的第0个元素。因为ns数组的每个元素也是一个数组，因此，arr0指向的数组就是{ 1, 2, 3, 4 }。在内存中，结构如下：

```
                     arr0 ─────┐
                               ▼
                             ┌───┬───┬───┬───┐
                  ┌───┐  ┌──>│ 1 │ 2 │ 3 │ 4 │
magicSquare ─────>│░░░│──┘   └───┴───┴───┴───┘
                  ├───┤      ┌───┬───┬───┬───┐
                  │░░░│─────>│ 5 │ 6 │ 7 │ 8 │
                  ├───┤      └───┴───┴───┴───┘
                  │░░░│──┐   ┌───┬───┬───┬───┐
                  └───┘  └──>│ 9 │10 │11 │12 │
                             └───┴───┴───┴───┘
```

访问二维数组的某个元素需要使用array[row][col]，例如：

```java
System.out.println(magicSquare[1][2]); 
```

要打印一个二维数组，可以使用两层嵌套的`for each`循环：

```java
for (int[] arr : ns) {
    for (int n : arr) {
        System.out.print(n);
        System.out.print(', ');
    }
    System.out.println();
}
```

或者使用Java标准库的`Arrays.deepToString`()：

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] magicSquare = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(magicSquare));
    }
}
```

三维数组
三维数组就是二维数组的数组。可以这么定义一个三维数组：
```java
int[][][] magicSquare = {
    {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    },
    {
        {10, 11},
        {12, 13}
    },
    {
        {14, 15, 16},
        {17, 18}
    }
};
```

它在内存中的结构如下：
```java

                                       ┌───┬───┬───┐
                            ┌───┐  ┌──>│ 1 │ 2 │ 3 │
                        ┌──>│░░░│──┘   └───┴───┴───┘
                        │   ├───┤      ┌───┬───┬───┐
                        │   │░░░│─────>│ 4 │ 5 │ 6 │
                        │   ├───┤      └───┴───┴───┘
                        │   │░░░│──┐   ┌───┬───┬───┐
                 ┌───┐  │   └───┘  └──>│ 7 │ 8 │ 9 │
magicSquare ────>│░░░│──┘              └───┴───┴───┘
                 ├───┤      ┌───┐      ┌───┬───┐
                 │░░░│─────>│░░░│─────>│10 │11 │
                 ├───┤      ├───┤      └───┴───┘
                 │░░░│──┐   │░░░│──┐   ┌───┬───┐
                 └───┘  │   └───┘  └──>│12 │13 │
                        │              └───┴───┘
                        │   ┌───┐      ┌───┬───┬───┐
                        └──>│░░░│─────>│14 │15 │16 │
                            ├───┤      └───┴───┴───┘
                            │░░░│──┐   ┌───┬───┐
                            └───┘  └──>│17 │18 │
                                       └───┴───┘
```

如果我们要访问三维数组的某个元素，例如，ns[2][0][1]，只需要顺着定位找到对应的最终元素15即可。

理论上，我们可以定义任意的N维数组。但在实际应用中，除了二维数组在某些时候还能用得上，更高维度的数组很少使用。

```java
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6; // 增长次数
        final int NYEARS = 10;

        // 设置利率为 10% 11% 12% 13% 14% 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        // 最初存款 10000 balances[0 ~ 5] = 10000
        double[][] balances = new double[NYEARS][NRATES];
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // 计算未来的利息
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // 上一年存款
                double oldBalance = balances[i - 1][j];
                // 增长的
                double interest = oldBalance * interestRate[j];
                // 现在的存款
                balances[i][j] = oldBalance + interest;
            }
        }

        // 打印利率
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        // 打印存款
        for (double[] row : balances) {
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }

            System.out.println();
        }
    }
}
```

# 对象与类

## 使用与定义类
```java
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // 构造对象，初始化为当前日期
        int month = date.getMonthValue(); // 获得当前的月份
        int today = date.getDayOfMonth(); // 获得当前的日期

        date = date.minusDays(today - 1); // 将 date 设置为一周的第一天
        DayOfWeek weekday = date.getDayOfWeek(); // 得到这一天为星期几
        int value = weekday.getValue(); // 返回一个整数，表示当天为星期几 1 = Monday ... 6 = Saturday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) { // 2022-01-29 时 value 为 6.
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*"); // 是当天就打印 *
            else
                System.out.print(" ");
            date = date.plusDays(1); // 到下一天
            if (date.getDayOfWeek().getValue() == 1) // 如果是一周的第一天就换行
                System.out.println();
        }

        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
```
## 用户自定义类

```java
import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        // 构建一个数组，并填入三个对象
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // 使用 employee 的 raiseSalary() 使每个员工的工资增加 5%
        for (Employee e : staff){
            e.raiseSalary(5);
        }

        //  遍历 staff 打印员工信息
        for (Employee e : staff){
            System.out.println("name= " + e.getName() + ",salary= " + e.getSalary() 
                    + ", hireDay= " + e.getHireDay());
        }
    }
}


class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    //构建 Employee 数组
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
```

关键字 `public`意味着任何方法都可以调用这些方法，而关键字 `private`可以确保只有 Employee 类可以访问这些字段。


下面是 Employee 类的构造器：

```java
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
```

可以发现，构造器一类名相同。在构造 Employee 类的对象时，构造器就会运行，从而将实例字段初始化为所需要的初始值。

例如使用以下代码创建 Employee 类的实例时：

```java
new Employee("Carl Cracker", 75000, 1987, 12, 15);
```
将会把实例字段设置为：

```java
name = "Carl Cracker";
salary = 75000;
hireDay = LocalDate.of(1987, 12, 15);
```

构造器需要结合 new 运算符来调用，不能对一个已经存在的对象使用构造器来重设字段

需要注意的是：

- 构造器与类同名。
- 每个类可以有一个以上的构造器。
- 构造器可以有0个，1个，或者多个参数。
- 构造器没有返回值    
- 构造器总是与 new 操作符一起使用。

### var 声明局部变量