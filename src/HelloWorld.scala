package src.HelloWorld

import java.awt.Color  // 引入Color
import java.awt._  // 引入包内所有成员
import java.io._

object HelloWorld {
    /* 这是一个 Scala 程序
    * 这是一行注释
    * 这里演示了多行注释
    */
    def printScala = {
        var myVarInt = 10;
        val myValStr = "Hello, Scala!";
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

        println("a == b = " + (a == b) );
        println("a != b = " + (a != b) );
        println("a > b = " + (a > b) );
        println("a < b = " + (a < b) );
        println("b >= a = " + (b >= a) );
        println("b <= a = " + (b <= a) ); 

        var ab = true;
        var bb = false;

        println("ab && bb = " + (ab && bb) );

        println("ab || bb = " + (ab || bb) );

        println("!(ab && bb) = " + !(ab && bb) );

        a = 60;           /* 60 = 0011 1100 */  
        b = 13;           /* 13 = 0000 1101 */
        c = 0;

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

        a = 10;    
        b = 20;
        c = 0;

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

    // 方法
    def m(x: Int) = x + 3

    // 函数
    val f = (x: Int) => x + 3

    // 闭包
    var factor = 3  
    val multiplier = (i:Int) => i * factor  

    def main(args: Array[String]): Unit = {
        // 输出 Hello World
        // 这是一个单行注释
        println("Hello, world!")
        printScala()
    }
}


final case class Symbol private (name: String) {
   override def toString: String = "'" + name
}


class Outer{
    class Inner{
    private def f(){println("f")}
    class InnerMost{
        f() // 正确
        }
    }
    // (new Inner).f() //错误
}


object add{
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}


object Hello{
   def printMe( ) : Unit = {
      println("Hello, Scala!")
   }
}


object TestString {
   val greeting: String = "Hello,World!"

   def main(args: Array[String]) {
      println( greeting )
   }
}


object TestFormatString {
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


object TestArray {
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


object TestCollection {
    // 定义整型 List
    val xList = List(1,2,3,4)

    // 定义 Set
    val xSet = Set(1,3,5,7)

    // 定义 Map
    val xMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

    // 创建两个不同类型元素的元组
    val xTuple = (10, "Runoob")

    // 定义 Option
    val xOpt:Option[Int] = Some(5)

    def main(args: Array[String]) {
        val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
      
        while (it.hasNext){
            println(it.next())
        }

        val ita = Iterator(20,40,2,50,69, 90)
        val itb = Iterator(20,40,2,50,69, 90)
        println("最大元素是：" + ita.max )
        println("最小元素是：" + itb.min )
   }
}


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


class Person {
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}

object TestOverride extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}


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


trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class PointTrait(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[PointTrait] &&
    obj.asInstanceOf[PointTrait].x == x
}

object TestTrait {
   def main(args: Array[String]) {
      val p1 = new PointTrait(2, 3)
      val p2 = new PointTrait(2, 4)
      val p3 = new PointTrait(3, 3)

      println(p1.isNotEqual(p2))
      println(p1.isNotEqual(p3))
      println(p1.isNotEqual(2))
   }
}
