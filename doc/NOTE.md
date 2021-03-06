
# Scala笔记

## Scala简介

Scala 是 Scalable Language 的简写，是一门多范式的编程语言，Java平台的Scala于2003年底/2004年初发布。.NET平台的Scala发布于2004年6月。该语言第二个版本，v2.0，发布于2006年3月。

## Scala特性

* **面向对象特性**-Scala是一种纯面向对象的语言，每个值都是对象。对象的数据类型以及行为由类和特质描述。类抽象机制的扩展有两种途径：一种途径是子类继承，另一种途径是灵活的混入机制。这两种途径能避免多重继承的种种问题。
* **函数式编程**-Scala也是一种函数式语言，其函数也能当成值来使用。Scala提供了轻量级的语法用以定义匿名函数，支持高阶函数，允许嵌套多层函数，并支持柯里化。Scala的case class及其内置的模式匹配相当于函数式编程语言中常用的代数类型。更进一步，程序员可以利用Scala的模式匹配，编写类似正则表达式的代码处理XML数据。
* **静态类型**-Scala具备类型系统，通过编译时检查，保证代码的安全性和一致性。
* **扩展性**-Scala的设计秉承一项事实，即在实践中，某个领域特定的应用程序开发往往需要特定于该领域的语言扩展。Scala提供了许多独特的语言机制，可以以库的形式轻易无缝添加新的语言结构：任何方法可用作前缀或后缀操作符；可以根据预期类型自动构造闭包。
* **并发性**-Scala使用Actor作为其并发模型，Actor是类似线程的实体，通过邮箱发收消息。Actor可以复用线程，因此可以在程序中可以使用数百万个Actor,而线程只能创建数千个。在2.10之后的版本中，使用Akka作为其默认Actor实现。

## Scala基础语法

Scale基础语法和Java类似，但是Scala 与 Java 的最大区别是：Scala 语句末尾的分号 `;` 是可选的。

* **对象**-对象有属性和行为。
* **类**-类是对象的抽象，而对象是类的具体实例。
* **方法**-方法描述的基本的行为，一个类可以包含多个方法。
* **字段**-每个对象都有它唯一的实例变量集合，即字段。对象的属性通过给字段赋值来创建。

*Scala基础语法注意要点*

* **区分大小写**-Scala是大小写敏感的
* **类名**-对于所有的类名的第一个字母要大写。
* **方法名称**-所有的方法名称的第一个字母用小写。如果若干单词被用于构成方法的名称，则每个单词的第一个字母应大写。
* **程序文件名**-程序文件的名称尽量应该与对象名称完全匹配，但是新版本可以不必相同

**标识符**

Scala 可以使用两种形式的标志符，字符数字和符号。

字符数字使用字母或是下划线开头，后面可以接字母或是数字，符号"$"在 Scala 中也看作为字母。然而以"$"开头的标识符为保留的 Scala 编译器产生的标志符使用，应用程序应该避免使用"$"开始的标识符，以免造成冲突。

Scala 的命名规则采用和 Java 类似的 camel 命名规则，首字符小写，比如 toString。类名的首字符还是使用大写。此外也应该避免使用以下划线结尾的标志符以避免冲突。符号标志符包含一个或多个符号，如+，:，? 等，比如:

**Scala关键字**

关键字|关键字|关键字|关键字
-|-|-|-
abstract|	case|	catch|	class
def	|do|	else|	extends
false|	final|	finally	|for
forSome	|if|	implicit|	import
lazy|	match|	new|	null
object|	override|	package|	private
protected|	return|	sealed|	super
this|	throw|	trait|	try
true|	type|	val|	var
while|	with|	yield|	 
`-`	|`:`|	`=`	|`=>`
`<-`|	`<:`|	`<%`	|`>:`
`#`|	`@`||

**Scala 注释**

Scala 类似 Java 支持单行和多行注释。多行注释可以嵌套，但必须正确嵌套，一个注释开始符号对应一个结束符号。注释在 Scala 编译中会被忽略，实例如下：

```scala
object HelloWorld {
   /* 这是一个 Scala 程序
    * 这是一行注释
    * 这里演示了多行注释
    */
   def main(args: Array[String]) {
      // 输出 Hello World
      // 这是一个单行注释
      println("Hello, world!") 
   }
}
```

**空格和空行**

一行中只有空格或者带有注释，Scala 会认为其是空行，会忽略它。标记可以被空格或者注释来分割。

**换行符**

Scala是面向行的语言，语句可以用分号（;）结束或换行符。Scala 程序里,语句末尾的分号通常是可选的。如果愿意可以输入一个,但若一行里仅 有一个语句也可不写。另一方面,如果一行里写多个语句那么分号是需要的。

**Scala包**

Scala 使用 package 关键字定义包，在Scala将代码定义到某个包中有两种方式：

第一种方法和 Java 一样，在文件的头定义包名，这种方法就后续所有代码都放在该包中。 第二种方法有些类似 C#，如：

```scala
package com.runoob
class HelloWorld
```

```scala
package com.runoob {
  class HelloWorld 
}
```

*引用包*

```scala
import java.awt.Color  // 引入Color
 
import java.awt._  // 引入包内所有成员
 
def handler(evt: event.ActionEvent) { // java.awt.event.ActionEvent
  ...  // 因为引入了java.awt，所以可以省去前面的部分
}
```

## Scala数据类型

Scala 与 Java有着相同的数据类型，下表列出了 Scala 支持的数据类型：

数据类型|	描述
-|-
Byte|	8位有符号补码整数。数值区间为 -128 到 127
Short|	16位有符号补码整数。数值区间为 -32768 到 32767
Int|	32位有符号补码整数。数值区间为 -2147483648 到 2147483647
Long|	64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
Float|	32 位, IEEE 754 标准的单精度浮点数
Double|	64 位 IEEE 754 标准的双精度浮点数
Char|	16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
String|	字符序列
Boolean|	true或false
Unit|	表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
Null|	null 或空引用
Nothing|	Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。
Any|	Any是所有其他类的超类
AnyRef|	AnyRef类是Scala里所有引用类(reference class)的基类

**整型字面量**

整型字面量用于 Int 类型，如果表示 Long，可以在数字后面添加 L 或者小写 l 作为后缀。：

```scala
0
035
21 
0xFFFFFFFF 
0777L
```

**浮点型字面量**

```scala
0.0 
1e30f 
3.14159f 
1.0e100
.1
```

**符号字面量**

```scala
package scala
final case class Symbol private (name: String) {
   override def toString: String = "'" + name
}
```

**字符串字面量**

```scala
"dugu\ndugu"
"hello"
```

**Null值**

空值是 scala.Null 类型。

Scala.Null和scala.Nothing是用统一的方式处理Scala面向对象类型系统的某些"边界情况"的特殊类型。

Null类是null引用对象的类型，它是每个引用类（继承自AnyRef的类）的子类。Null不兼容值类型。

**Scala 转义字符**

转义字符|	Unicode|	描述
-|-|-
`\b`|	\u0008|	退格(BS) ，将当前位置移到前一列
`\t`|	\u0009|	水平制表(HT) （跳到下一个TAB位置）
`\n`|	\u000a|	换行(LF) ，将当前位置移到下一行开头
`\f`|	\u000c|	换页(FF)，将当前位置移到下页开头
`\r`|	\u000d|	回车(CR) ，将当前位置移到本行开头
`\"`|	\u0022|	代表一个双引号(")字符
`\'`|	\u0027|	代表一个单引号（'）字符
`\\`|	\u005c|	代表一个反斜线字符 '\'

## Scala变量

变量是一种使用方便的占位符，用于引用计算机内存地址，变量创建后会占用一定的内存空间。

基于变量的数据类型，操作系统会进行内存分配并且决定什么将被储存在保留内存中。因此，通过给变量分配不同的数据类型，可以在这些变量中存储整数，小数或者字母。

**变量声明**

变量的类型在变量名之后等号之前声明。定义变量的类型的语法格式如下：

```scala
var VariableName : DataType [=  Initial Value]
```

**变量类型引用**

在 Scala 中声明变量和常量不一定要指明数据类型，在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。

所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错。

```scala
var myVar = 10;
val myVal = "Hello, Scala!";
```

## Scala访问修饰符

Scala 访问修饰符基本和Java的一样，分别有：private，protected，public。

如果没有指定访问修饰符，默认情况下，Scala 对象的访问级别都是 public。

Scala 中的 private 限定符，比 Java 更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。

**私有(Private)成员**

用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。

```scala
class Outer{
    class Inner{
    private def f(){println("f")}
    class InnerMost{
        f() // 正确
        }
    }
    (new Inner).f() //错误
}
```

**保护(Protected)成员**

在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。而在java中，用protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。

```scala
package p{
class Super{
    protected def f() {println("f")}
    }
    class Sub extends Super{
        f()
    }
    class Other{
        (new Super).f() //错误
    }
}
```

**公共(Public)成员**

Scala中，如果没有指定任何的修饰符，则默认为 public。这样的成员在任何地方都可以被访问。

```scala
class Outer {
   class Inner {
      def f() { println("f") }
      class InnerMost {
         f() // 正确
      }
   }
   (new Inner).f() // 正确因为 f() 是 public
}
```

**Scala运算符**

* **算术运算符**


运算符|	描述|	实例
-|-|-
`+`|	加号|	`A + B` 运算结果为 30
`-`|	减号|	`A - B` 运算结果为 -10
`*`|	乘号|	`A * B` 运算结果为 200
`/`|	除号|	`B / A` 运算结果为 2
`%`|	取余|	`B % A` 运算结果为 0

```scala
object Test {
   def main(args: Array[String]) {
      var a = 10;
      var b = 20;
      var c = 25;
      var d = 25;
      println("a + b = " + (a + b) );
      println("a - b = " + (a - b) );
      println("a * b = " + (a * b) );
      println("b / a = " + (b / a) );
      println("b % a = " + (b % a) );
      println("c % a = " + (c % a) );   
   }
}
```

* **关系运算符**


运算符|	描述|	实例
-|-|-
`==`|	等于|	`(A == B)` 运算结果为 false
`!=`|	不等于|	`(A != B)` 运算结果为 true
`>`|	大于|	`(A > B)` 运算结果为 false
`<`|	小于|	`(A < B)` 运算结果为 true
`>=`|	大于等于|	`(A >= B)` 运算结果为 false
`<=`|	小于等于|	`(A <= B)` 运算结果为 true

```scala
object Test {
   def main(args: Array[String]) {
      var a = 10;
      var b = 20;
      println("a == b = " + (a == b) );
      println("a != b = " + (a != b) );
      println("a > b = " + (a > b) );
      println("a < b = " + (a < b) );
      println("b >= a = " + (b >= a) );
      println("b <= a = " + (b <= a) );
   }
}
```

* **逻辑运算符**

运算符|	描述|	实例
-|-|-
`&&`|	逻辑与|	`(A && B)` 运算结果为 false
`||`|	逻辑或|	`(A || B)` 运算结果为 true
`!`|	逻辑非|	`!(A && B)` 运算结果为 true

```scala
object Test {
   def main(args: Array[String]) {
      var a = true;
      var b = false;

      println("a && b = " + (a&&b) );

      println("a || b = " + (a||b) );

      println("!(a && b) = " + !(a && b) );
   }
} 
```

* **位运算符**

`p`|	`q`|	`p & q`|	`p | q`|	`p ^ q`
-|-|-|-|-
0|	0|	0|	0|	0|
0|	1|	0|	1|	1|
1|	1|	1|	1|	0|
1|	0|	0|	1|	1|

运算符|	描述|	实例
-|-|-
`&`|	按位与运算符|	`(a & b)` 输出结果 12 ，二进制解释： 0000 1100
`|`|	按位或运算符|	`(a | b)` 输出结果 61 ，二进制解释： 0011 1101
`^`|	按位异或运算符|	`(a ^ b)` 输出结果 49 ，二进制解释： 0011 0001
`~`|	按位取反运算符|	`(~a )` 输出结果 -61 ，二进制解释： 1100 0011， 在一个有符号二进制数的补码形式。
`<<`|	左移动运算符|	`a << 2` 输出结果 240 ，二进制解释： 1111 0000
`>>`|	右移动运算符|	`a >> 2` 输出结果 15 ，二进制解释： 0000 1111
`>>>`|	无符号右移|	`A >>>2` 输出结果 15, 二进制解释: 0000 1111

```scala
object Test {
   def main(args: Array[String]) {
      var a = 60;           /* 60 = 0011 1100 */  
      var b = 13;           /* 13 = 0000 1101 */
      var c = 0;

      c = a & b;            /* 12 = 0000 1100 */ 
      println("a & b = " + c );

      c = a | b;            /* 61 = 0011 1101 */
      println("a | b = " + c );

      c = a ^ b;            /* 49 = 0011 0001 */
      println("a ^ b = " + c );

      c = ~a;               /* -61 = 1100 0011 */
      println("~a = " + c );

      c = a << 2;           /* 240 = 1111 0000 */
      println("a << 2 = " + c );

      c = a >> 2;           /* 15 = 1111 */
      println("a >> 2  = " + c );

      c = a >>> 2;          /* 15 = 0000 1111 */
      println("a >>> 2 = " + c );
   }
} 
```

* **赋值运算符**

运算符|	描述|	实例
-|-|-
`=`|	简单的赋值运算，指定右边操作数赋值给左边的操作数。|	`C = A + B` 将 `A + B` 的运算结果赋值给 `C`
`+=`|	相加后再赋值，将左右两边的操作数相加后再赋值给左边的操作数。|	`C += A` 相当于 `C = C + A`
`-=`|	相减后再赋值，将左右两边的操作数相减后再赋值给左边的操作数。|	`C -= A` 相当于 `C = C - A`
`*=`|	相乘后再赋值，将左右两边的操作数相乘后再赋值给左边的操作数。|	`C *= A` 相当于 `C = C * A`
`/=`|	相除后再赋值，将左右两边的操作数相除后再赋值给左边的操作数。|	`C /= A` 相当于 `C = C / A`
`%=`|	求余后再赋值，将左右两边的操作数求余后再赋值给左边的操作数。|	`C %= A` 相当于 `C = C % A`
`<<=`|	按位左移后再赋值|	`C <<= 2` 相当于 `C = C << 2`
`>>=`|	按位右移后再赋值|	`C >>= 2` 相当于 `C = C >> 2`
`&=`|	按位与运算后赋值|	`C &= 2` 相当于 `C = C & 2`
`^=`|	按位异或运算符后再赋值|	`C ^= 2` 相当于 `C = C ^ 2`
`|=`|	按位或运算后再赋值|	`C |= 2` 相当于 `C = C | 2`

```scala
object Test {
   def main(args: Array[String]) {
      var a = 10;    
      var b = 20;
      var c = 0;

      c = a + b;
      println("c = a + b  = " + c );

      c += a ;
      println("c += a  = " + c );

      c -= a ;
      println("c -= a = " + c );

      c *= a ;
      println("c *= a = " + c );

      a = 10;
      c = 15;
      c /= a ;
      println("c /= a  = " + c );

      a = 10;
      c = 15;
      c %= a ;
      println("c %= a  = " + c );

      c <<= 2 ;
      println("c <<= 2  = " + c );

      c >>= 2 ;
      println("c >>= 2  = " + c );

      c >>= a ;
      println("c >>= a  = " + c );

      c &= a ;
      println("c &= 2  = " + c );
     
      c ^= a ;
      println("c ^= a  = " + c );

      c |= a ;
      println("c |= a  = " + c );
   }
} 
```

**Scala运算符优先级**

类别|	运算符|	关联性
-|-|-
1|	`() []`|	左到右
2|	`! ~`|	右到左
3|	`* / %`|	左到右
4|	`+ -`|	左到右
5|	`>> >>> <<`|	左到右
6|	`> >= < <=`|	左到右
7|	`== !=`|	左到右
8|	`&`|	左到右
9|	`^`|	左到右
10|	`|`|	左到右
11|	`&&`|	左到右
12|	`||`|	左到右
13|	`= += -= *= /= %= >>= <<= &= ^= |=`|	右到左
14|	`,`|	左到右

## Scala IF...ELSE 语句

Scala IF...ELSE 语句是通过一条或多条语句的执行结果（True或者False）来决定执行的代码块。

```scala
object Test {
   def main(args: Array[String]) {
      var x = 10;

      if( x < 20 ){
         println("x < 20");
      }
   }
}
```

**if...else 语句**

```scala
object Test {
   def main(args: Array[String]) {
      var x = 30;

      if( x < 20 ){
         println("x 小于 20");
      }else{
         println("x 大于 20");
      }
   }
}
```

**if...else if...else 语句**

```scala
object Test {
   def main(args: Array[String]) {
      var x = 30;

      if( x == 10 ){
         println("X 的值为 10");
      }else if( x == 20 ){
         println("X 的值为 20");
      }else if( x == 30 ){
         println("X 的值为 30");
      }else{
         println("无法判断 X 的值");
      }
   }
}
```

## Scala循环

Scala 语言提供了以下几种循环类型。

循环类型|	描述
-|-
`while` 循环|	运行一系列语句，如果条件为true，会重复运行，直到条件变为false。
`do...while` 循环|	类似 while 语句区别在于判断循环条件之前，先执行一次循环的代码块。
`for` 循环|	用来重复执行一系列语句直到达成特定条件达成，一般通过在每次循环完成后增加计数器的值来实现。

## Scala 方法与函数

Scala 有方法与函数，二者在语义上的区别很小。Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。

Scala 中的方法跟 Java 的类似，方法是组成类的一部分。

Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。

Scala 中使用 `val` 语句可以定义函数，`def` 语句定义方法。

```scala
class Test{
  def m(x: Int) = x + 3
  val f = (x: Int) => x + 3
}
```

**方法声明**

```
def functionName ([参数列表]) : [return type]
```

**方法定义**

方法定义由一个 def 关键字开始，紧接着是可选的参数列表，一个冒号 : 和方法的返回类型，一个等于号 = ，最后是方法的主体。

Scala 方法定义格式如下：

```
def functionName ([参数列表]) : [return type] = {
   function body
   return [expr]
}
```

```scala
object add{
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}
```

如果方法没有返回值，可以返回为 Unit，这个类似于 Java 的 void, 实例如下：

```scala
object Hello{
   def printMe( ) : Unit = {
      println("Hello, Scala!")
   }
}
```

**方法调用**

```scala
object Test {
   def main(args: Array[String]) {
        println( "Returned Value : " + addInt(5,7) );
   }
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}
```

## Scala闭包

闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。

闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。

如下面这段匿名的函数：

```scala
val multiplier = (i:Int) => i * 10  
```

函数体内有一个变量 i，它作为函数的一个参数。如下面的另一段代码：

```scala
val multiplier = (i:Int) => i * factor
```

在 multiplier 中有两个变量：i 和 factor。其中的一个 i 是函数的形式参数，在 multiplier 函数被调用时，i 被赋予一个新的值。然而，factor不是形式参数，而是自由变量，考虑下面代码：

```scala
var factor = 3  
val multiplier = (i:Int) => i * factor  
```

这里引入一个自由变量 factor，这个变量定义在函数外面。

这样定义的函数变量 multiplier 成为一个"闭包"，因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。

完整实例

```scala
object Test {  
   def main(args: Array[String]) {  
      println( "muliplier(1) value = " +  multiplier(1) )  
      println( "muliplier(2) value = " +  multiplier(2) )  
   }  
   var factor = 3  
   val multiplier = (i:Int) => i * factor  
}  
```

## Scala字符串

以下实例将字符串赋值给一个常量：

```scala
object Test {
   val greeting: String = "Hello,World!"

   def main(args: Array[String]) {
      println( greeting )
   }
}
```

以上实例定义了变量 greeting，为字符串常量，它的类型为 String (java.lang.String)。

在 Scala 中，字符串的类型实际上是 Java String，它本身没有 String 类。

在 Scala 中，String 是一个不可变的对象，所以该对象不可被修改。这就意味着如果修改字符串就会产生一个新的字符串对象。

但其他对象，如数组就是可变的对象。接下来会为大家介绍常用的 java.lang.String 方法。

**创建字符串**

```scala
var greetingStr1 = "Hello World!";
var greetingStr2:String = "Hello World!";
```

不一定为字符串指定 String 类型，因为 Scala 编译器会自动推断出字符串的类型为 String。

当然也可以直接显示的声明字符串为 String 类型，如下实例：

```scala
object Test {
   val greeting: String = "Hello, World!"

   def main(args: Array[String]) {
      println( greeting )
   }
}
```

如果需要创建一个可以修改的字符串，可以使用 String Builder 类

```scala
object Test {
   def main(args: Array[String]) {
      val buf = new StringBuilder;
      buf += 'a'
      buf ++= "bcdef"
      println( "buf is : " + buf.toString );
   }
}
```

**格式化创建字符串**

```scala
object Test {
   def main(args: Array[String]) {
      var floatVar = 12.456
      var intVar = 2000
      var stringVar = "!"
      var fs = printf("浮点型变量为 " +
                   "%f, 整型变量为 %d, 字符串为 " +
                   " %s", floatVar, intVar, stringVar)
      println(fs)
   }
}
```

## Scala数组

Scala 语言中提供的数组是用来存储固定大小的同类型元素，数组对于每一门编辑应语言来说都是重要的数据结构之一。

声明数组变量并不是声明 number0、number1、...、number99 一个个单独的变量，而是声明一个就像 numbers 这样的变量，然后使用 numbers[ 0 ]、numbers[ 1 ]、...、numbers[ 99 ] 来表示一个个单独的变量。数组中某个指定的元素是通过索引来访问的。

数组的第一个元素索引为0，最后一个元素的索引为元素总数减1。

```scala
var z:Array[String] = new Array[String](3)

var z = new Array[String](3)

var z = Array("Runoob", "Baidu", "Google")
```

**处理数组**

数组的元素类型和数组的大小都是确定的，所以当处理数组元素时候，通常使用基本的 for 循环。

以下实例演示了数组的创建，初始化等处理过程：

```scala
object Test {
   def main(args: Array[String]) {
      var myList = Array(1.9, 2.9, 3.4, 3.5)
      
      // 输出所有数组元素
      for ( x <- myList ) {
         println( x )
      }

      // 计算数组所有元素的总和
      var total = 0.0;
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("总和为 " + total);

      // 查找数组中的最大元素
      var max = myList(0);
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      println("最大值为 " + max);
    
   }
}
```

**多维数组**

多维数组一个数组中的值可以是另一个数组，另一个数组的值也可以是一个数组。矩阵与表格是常见的二维数组。

以上是一个定义了二维数组的实例：

```scala
var myMatrix = ofDim[Int](3,3)
```

实例中数组中包含三个数组元素，每个数组元素又含有三个值。

接下来来看一个二维数组处理的完整实例：

```scala
import Array._

object Test {
   def main(args: Array[String]) {
      var myMatrix = ofDim[Int](3,3)
      
      // 创建矩阵
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }
      
      // 打印二维阵列
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
    
   }
}
```

**合并数组**

以下实例中，使用 `concat()` 方法来合并两个数组，`concat()` 方法中接受多个数组参数：

```scala
import Array._

object Test {
   def main(args: Array[String]) {
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      
      // 输出所有数组元素
      for ( x <- myList3 ) {
         println( x )
      }
   }
}
```

**创建区间数组**

以下实例中，使用了 range() 方法来生成一个区间范围内的数组。range() 方法最后一个参数为步长，默认为 1：

```scala
import Array._

object Test {
   def main(args: Array[String]) {
      var myList1 = range(10, 20, 2)
      var myList2 = range(10,20)

      // 输出所有数组元素
      for ( x <- myList1 ) {
         print( " " + x )
      }
      println()
      for ( x <- myList2 ) {
         print( " " + x )
      }
   }
}
```

## Scala集合

Scala提供了一套很好的集合实现，提供了一些集合类型的抽象。

Scala 集合分为可变的和不可变的集合。

可变集合可以在适当的地方被更新或扩展。这意味着可以修改，添加，移除一个集合的元素。

而不可变集合类，相比之下，永远不会改变。不过，仍然可以模拟添加，移除或更新操作。但是这些操作将在每一种情况下都返回一个新的集合，同时使原来的集合不发生改变。

接下来将为大家介绍几种常用集合类型的应用：

序号|	集合及描述
-|-
1|	Scala List(列表) List的特征是其元素以线性方式存储，集合中可以存放重复对象。
2|	Scala Set(集合) Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。
3|	Scala Map(映射) Map 是一种把键对象和值对象映射的集合，它的每一个元素都包含一对键对象和值对象。
4|	Scala 元组 元组是不同类型的值的集合
5|	Scala Option Option[T] 表示有可能包含值的容器，也可能不包含值。
6|	Scala Iterator（迭代器） 迭代器不是一个容器，更确切的说是逐一访问容器内元素的方法。

```scala
// 定义整型 List
val x = List(1,2,3,4)

// 定义 Set
val x = Set(1,3,5,7)

// 定义 Map
val x = Map("one" -> 1, "two" -> 2, "three" -> 3)

// 创建两个不同类型元素的元组
val x = (10, "Runoob")

// 定义 Option
val x:Option[Int] = Some(5)
```

## Scala Iterator（迭代器）

Scala Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法。

迭代器 `it` 的两个基本操作是 `next` 和 `hasNext`。

调用 `it.next()` 会返回迭代器的下一个元素，并且更新迭代器的状态。

调用 `it.hasNext()` 用于检测集合中是否还有元素。

让迭代器 `it` 逐个返回所有元素最简单的方法是使用 `while` 循环：

```scala
object Test {
   def main(args: Array[String]) {
      val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
      
      while (it.hasNext){
         println(it.next())
      }
   }
}
```

**查找最大与最小元素**

```scala
object Test {
   def main(args: Array[String]) {
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("最大元素是：" + ita.max )
      println("最小元素是：" + itb.min )

   }
}
```

**获取迭代器的长度**

```scala
object Test {
   def main(args: Array[String]) {
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("ita.size 的值: " + ita.size )
      println("itb.length 的值: " + itb.length )

   }
}
```

## Scala 类和对象

类是对象的抽象，而对象是类的具体实例。类是抽象的，不占用内存，而对象是具体的，占用存储空间。类是用于创建对象的蓝图，它是一个定义包括在特定类型的对象中的方法和变量的软件模板。

可以使用 new 关键字来创建类的对象，实例如下：

```scala
class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("x 的坐标点: " + x);
      println ("y 的坐标点: " + y);
   }
}
```

Scala中的类不声明为public，一个Scala源文件中可以有多个类。

以上实例的类定义了两个变量 x 和 y ，一个方法：move，方法没有返回值。

Scala 的类定义可以有参数，称为类参数，如上面的 xc, yc，类参数在整个类中都可以访问。

接着可以使用 new 来实例化类，并访问类中的方法和变量：

```scala
import java.io._

class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("x 的坐标点: " + x);
      println ("y 的坐标点: " + y);
   }
}

object Test {
   def main(args: Array[String]) {
      val pt = new Point(10, 20);

      // 移到一个新的位置
      pt.move(10, 10);
   }
}
```
执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
x 的坐标点: 20
y 的坐标点: 30
```

## Scala 继承

Scala继承一个基类跟Java很相似, 但需要注意以下几点：

* 1、重写一个非抽象方法必须使用override修饰符。
* 2、只有主构造函数才可以往基类的构造函数里写参数。
* 3、在子类中重写超类的抽象方法时，不需要使用override关键字。

```scala
class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("x 的坐标点: " + x);
      println ("y 的坐标点: " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("x 的坐标点 : " + x);
      println ("y 的坐标点 : " + y);
      println ("z 的坐标点 : " + z);
   }
}
```

Scala 使用 extends 关键字来继承一个类。实例中 Location 类继承了 Point 类。Point 称为父类(基类)，Location 称为子类。

override val xc 为重写了父类的字段。

继承会继承父类的所有属性和方法，Scala 只允许继承一个父类。

实例如下：

```scala
import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("x 的坐标点 : " + x);
      println ("y 的坐标点 : " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("x 的坐标点 : " + x);
      println ("y 的坐标点 : " + y);
      println ("z 的坐标点 : " + z);
   }
}

object Test {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);

      // 移到一个新的位置
      loc.move(10, 10, 5);
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
x 的坐标点 : 20
y 的坐标点 : 30
z 的坐标点 : 20
```

Scala重写一个非抽象方法，必须用override修饰符。

```scala
class Person {
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}

object Test extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
Employee[name=Fred][salary=50000.0]
```

**Scala 单例对象**

在 Scala 中，是没有 static 这个东西的，但是它也为提供了单例模式的实现方法，那就是使用关键字 object。

Scala 中使用单例模式时，除了定义的类之外，还要定义一个同名的 object 对象，它和类的区别是，object对象不能带参数。

当单例对象与某个类共享同一个名称时，他被称作是这个类的伴生对象：companion object。必须在同一个源文件里定义类和它的伴生对象。类被称为是这个单例对象的伴生类：companion class。类和它的伴生对象可以互相访问其私有成员。

单例对象实例

```scala
import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
   }
}

object Test {
   def main(args: Array[String]) {
      val point = new Point(10, 20)
      printPoint

      def printPoint{
         println ("x 的坐标点 : " + point.x);
         println ("y 的坐标点 : " + point.y);
      }
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
x 的坐标点 : 10
y 的坐标点 : 20
```

**伴生对象实例**

```scala
// 私有构造方法
class Marker private(val color:String) {

  println("创建" + this)
  
  override def toString(): String = "颜色标记："+ color
  
}

// 伴生对象，与类名字相同，可以访问类的私有属性和方法
object Marker{
  
    private val markers: Map[String, Marker] = Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "green" -> new Marker("green")
    )
    
    def apply(color:String) = {
      if(markers.contains(color)) markers(color) else null
    }
  
    
    def getMarker(color:String) = { 
      if(markers.contains(color)) markers(color) else null
    }
    def main(args: Array[String]) { 
        println(Marker("red"))  
        // 单例函数调用，省略了.(点)符号  
        println(Marker getMarker "blue")  
    }
}
```

## Scala Trait(特征)

Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。

与接口不同的是，它还可以定义属性和方法的实现。

一般情况下Scala的类只能够继承单一父类，但是如果是 Trait(特征) 的话就可以继承多个，从结果来看就是实现了多重继承。

Trait(特征) 定义的方式与类类似，但它使用的关键字是 trait，如下所示：

```scala
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}
```

以上Trait(特征)由两个方法组成：isEqual 和 isNotEqual。isEqual 方法没有定义方法的实现，isNotEqual定义了方法的实现。子类继承特征可以实现未被实现的方法。所以其实 Scala Trait(特征)更像 Java 的抽象类。

以下演示了特征的完整实例：

```scala
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x
}

object Test {
   def main(args: Array[String]) {
      val p1 = new Point(2, 3)
      val p2 = new Point(2, 4)
      val p3 = new Point(3, 3)

      println(p1.isNotEqual(p2))
      println(p1.isNotEqual(p3))
      println(p1.isNotEqual(2))
   }
}
```


执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
false
true
true
```

**特征构造顺序**

特征也可以有构造器，由字段的初始化和其他特征体中的语句构成。这些语句在任何混入该特征的对象在构造时都会被执行。

构造器的执行顺序：

1. 调用超类的构造器；
2. 特征构造器在超类构造器之后、类构造器之前执行；
3. 特征由左到右被构造；
4. 每个特征当中，父特征先被构造；
5. 如果多个特征共有一个父特征，父特征不会被重复构造，所有特征被构造完毕，子类被构造。构造器的顺序是类的线性化的反向。线性化是描述某个类型的所有超类型的一种技术规格。

## Scala 模式匹配

Scala 提供了强大的模式匹配机制，应用也非常广泛。

一个模式匹配包含了一系列备选项，每个都开始于关键字 case。每个备选项都包含了一个模式及一到多个表达式。箭头符号 => 隔开了模式和表达式。

以下是一个简单的整型值模式匹配实例：

```scala
object Test {
   def main(args: Array[String]) {
      println(matchTest(3))

   }
   def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
many
```

match 对应 Java 里的 switch，但是写在选择器表达式之后。即： 选择器 match {备选项}。

match 表达式通过以代码编写的先后次序尝试每个模式来完成计算，只要发现有一个匹配的case，剩下的case不会继续匹配。

接下来来看一个不同数据类型的模式匹配：

```scala
object Test {
   def main(args: Array[String]) {
      println(matchTest("two"))
      println(matchTest("test"))
      println(matchTest(1))
      println(matchTest(6))

   }
   def matchTest(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
2
many
one
scala.Int
```

实例中第一个 case 对应整型数值 1，第二个 case 对应字符串值 two，第三个 case 对应类型模式，用于判断传入的值是否为整型，相比使用isInstanceOf来判断类型，使用模式匹配更好。第四个 case 表示默认的全匹配备选项，即没有找到其他匹配时的匹配项，类似 switch 中的 default。

**使用样例类**

使用了case关键字的类定义就是就是样例类(case classes)，样例类是种特殊的类，经过优化以用于模式匹配。

以下是样例类的简单实例:

```scala
object Test {
   def main(args: Array[String]) {
       val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
       val charlie = new Person("Charlie", 32)
   
    for (person <- List(alice, bob, charlie)) {
        person match {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) =>
               println("Age: " + age + " year, name: " + name + "?")
         }
      }
   }
   // 样例类
   case class Person(name: String, age: Int)
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
Hi Alice!
Hi Bob!
Age: 32 year, name: Charlie?
```

在声明样例类时，下面的过程自动发生了：

1. 构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
2. 在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
3. 提供unapply方法使模式匹配可以工作；
4. 生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。

## Scala 正则表达式

Scala 通过 scala.util.matching 包中的 Regex 类来支持正则表达式。以下实例演示了使用正则表达式查找单词 Scala :

```scala
import scala.util.matching.Regex

object Test {
   def main(args: Array[String]) {
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"
      
      println(pattern findFirstIn str)
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
Some(Scala)
```

实例中使用 String 类的 r() 方法构造了一个Regex对象。

然后使用 findFirstIn 方法找到首个匹配项。

如果需要查看所有的匹配项可以使用 findAllIn 方法。

可以使用 mkString( ) 方法来连接正则表达式匹配结果的字符串，并可以使用管道(|)来设置不同的模式：

```scala
import scala.util.matching.Regex

object Test {
   def main(args: Array[String]) {
      val pattern = new Regex("(S|s)cala")  // 首字母可以是大写 S 或小写 s
      val str = "Scala is scalable and cool"
      
      println((pattern findAllIn str).mkString(","))   // 使用逗号 , 连接返回结果
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
Scala,scala
```

如果需要将匹配的文本替换为指定的关键词，可以使用 replaceFirstIn( ) 方法来替换第一个匹配项，使用 replaceAllIn( ) 方法替换所有匹配项，实例如下:

```scala
object Test {
   def main(args: Array[String]) {
      val pattern = "(S|s)cala".r
      val str = "Scala is scalable and cool"
      
      println(pattern replaceFirstIn(str, "Java"))
   }
}
```

## Scala 异常处理

Scala 的异常处理和其它语言比如 Java 类似。

Scala 的方法可以通过抛出异常的方法的方式来终止相关代码的运行，不必通过返回值。

**抛出异常**

Scala 抛出异常的方法和 Java一样，使用 throw 方法，例如，抛出一个新的参数异常：

```scala
throw new IllegalArgumentException
```

**捕获异常**

异常捕捉的机制与其他语言中一样，如果有异常发生，catch字句是按次序捕捉的。因此，在catch字句中，越具体的异常越要靠前，越普遍的异常越靠后。 如果抛出的异常不在catch字句中，该异常则无法处理，会被升级到调用者处。

捕捉异常的catch子句，语法与其他语言中不太一样。在Scala里，借用了模式匹配的思想来做异常的匹配，因此，在catch的代码里，是一系列case字句，如下例所示：

```scala
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Test {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException =>{
            println("Missing file exception")
         }
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }
}
```

执行以上代码，输出结果为：

```scala
$ scalac Test.scala 
$ scala Test
Missing file exception
```

catch字句里的内容跟match里的case是完全一样的。由于异常捕捉是按次序，如果最普遍的异常，Throwable，写在最前面，则在它后面的case都捕捉不到，因此需要将它写在最后面。

**finally 语句**

finally 语句用于执行不管是正常处理还是有异常发生时都需要执行的步骤，实例如下：

```scala
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Test {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException => {
            println("Missing file exception")
         }
         case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Exiting finally...")
      }
   }
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
Missing file exception
Exiting finally...
```

## Scala 提取器(Extractor)

提取器是从传递给它的对象中提取出构造该对象的参数。

Scala 标准库包含了一些预定义的提取器，会大致的了解一下它们。

Scala 提取器是一个带有unapply方法的对象。unapply方法算是apply方法的反向操作：unapply接受一个对象，然后从对象中提取值，提取的值通常是用来构造该对象的值。

以下实例演示了邮件地址的提取器对象：

```scala
object Test {
   def main(args: Array[String]) {
      
      println ("Apply 方法 : " + apply("Zara", "gmail.com"));
      println ("Unapply 方法 : " + unapply("Zara@gmail.com"));
      println ("Unapply 方法 : " + unapply("Zara Ali"));

   }
   // 注入方法 (可选)
   def apply(user: String, domain: String) = {
      user +"@"+ domain
   }

   // 提取方法（必选）
   def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      if (parts.length == 2){
         Some(parts(0), parts(1)) 
      }else{
         None
      }
   }
}
```

执行以上代码，输出结果为：

```scale
$ scalac Test.scala 
$ scala Test
Apply 方法 : Zara@gmail.com
Unapply 方法 : Some((Zara,gmail.com))
Unapply 方法 : None
```

以上对象定义了两个方法： apply 和 unapply 方法。通过 apply 方法无需使用 new 操作就可以创建对象。所以可以通过语句 Test("Zara", "gmail.com") 来构造一个字符串 "Zara@gmail.com"。

unapply方法算是apply方法的反向操作：unapply接受一个对象，然后从对象中提取值，提取的值通常是用来构造该对象的值。实例中使用 Unapply 方法从对象中提取用户名和邮件地址的后缀。

实例中 unapply 方法在传入的字符串不是邮箱地址时返回 None。代码演示如下：

unapply("Zara@gmail.com") 相等于 Some("Zara", "gmail.com")
unapply("Zara Ali") 相等于 None
提取器使用模式匹配
在实例化一个类的时，可以带上0个或者多个的参数，编译器在实例化的时会调用 apply 方法。可以在类和对象中都定义 apply 方法。

就像之前提到过的，unapply 用于提取指定查找的值，它与 apply 的操作相反。 当在提取器对象中使用 match 语句是，unapply 将自动执行，如下所示：

```scala
object Test {
   def main(args: Array[String]) {
      
      val x = Test(5)
      println(x)

      x match
      {
         case Test(num) => println(x + " 是 " + num + " 的两倍！")
         //unapply 被调用
         case _ => println("无法计算")
      }

   }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}
```

执行以上代码，输出结果为：

```s
$ scalac Test.scala 
$ scala Test
10
10 是 5 的两倍！
```

## Scala 文件 I/O

Scala 进行文件写操作，直接用的都是 java中 的 I/O 类 （java.io.File)：

```scala
import java.io._

object Test {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt" ))

      writer.write("")
      writer.close()
   }
}
```

执行以上代码，会在的当前目录下生产一个 test.txt 文件，文件内容为"":

```s
$ scalac Test.scala 
$ scala Test
$ cat test.txt 
```

从屏幕上读取用户输入
有时候需要接收用户在屏幕输入的指令来处理程序。实例如下：

```scala
import scala.io._
object Test {
   def main(args: Array[String]) {
      print("请输入 : " )
      val line = StdIn.readLine()

      println("谢谢，输入的是: " + line)
   }
}
```

Scala2.11 后的版本 Console.readLine 已废弃，使用 scala.io.StdIn.readLine() 方法代替。

执行以上代码，屏幕上会显示如下信息:

```
$ scalac Test.scala 
$ scala Test
请输入官网 : dugu
谢谢，输入的是: dugu
```

从文件上读取内容
从文件读取内容非常简单。可以使用 Scala 的 Source 类及伴生对象来读取文件。以下实例演示了从 "test.txt"(之前已创建过) 文件中读取内容:

```scala
import scala.io.Source

object Test {
   def main(args: Array[String]) {
      println("文件内容为:" )

      Source.fromFile("test.txt" ).foreach{ 
         print 
      }
   }
}
```

执行以上代码，输出结果为:

```s
$ scalac Test.scala 
$ scala Test
文件内容为:
```

