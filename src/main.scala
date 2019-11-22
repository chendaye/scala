object main {
  def main(args: Array[String]): Unit = {
    // val  var
    var a: Int = 1 + 2
    println(a)
    var myPrice : Double = 9.9
    myPrice = 10.6
    println(myPrice)

    // 字面量
    val r: Int = 5
    5.toString() // 产生字符串 5

    // 操作符
    var sum1 = 6 + 6
    println(sum1)
    var sum2 = 6.+(6)
    println(sum2)

    // 打印语句
    print("My name is:")
    print("Ziyu")
    // 打印换行
    println("My name is:")
    println("Ziyu")
    // Scala还带有C语言风格的格式化字符串的printf函数：
    val i = 5;
    val j = 8;
    // 更多关于printf函数的使用方法，读者可以参考C语言书籍
    printf("My name is %s. I hava %d apples and %d eggs.\n","Ziyu",i,j)


    // 读文件
//    import java.io.PrintWriter //这行是Scala解释器执行上面语句后返回的结果
//    val out = new PrintWriter("/tmp/write.file")
//    for (i <- 1 to 5) out.println(i)
//    // 必须要执行out.close()语句，才会看到output.txt文件被生成，如果没有执行out.close()语句，我们就无法看到生成的output.txt文件
//    out.close()

    // 读取文本文件中的行
//    import scala.io.Source
//    val inputFile = Source.fromFile("/tmp/write.file")
//    val lines = inputFile.getLines //返回的结果是一个迭代器
//    for (line <- lines) println(line)

    // if
    val x = 6
    if (x>0) {println("This is a positive number")
    } else {
      println("This is not a positive number")
    }

    if (x>0) {
      println("This is a positive number")
    } else if (x==0) {
      println("This is a zero")
    } else {
      println("This is a negative number")
    }

    // while
    var n = 9
    while (n > 0) {
      n -= 1
      printf("n is %d\n",n)
    }

    // do-while
    var m = 0
    do {
      m += 1
      println(m)
    }while (m<5)

    // for
    for (i <- 1 to 5) println(i)

    for (i <- 1 to 5 by 2) println(i)

    // 但是，有时候，我们可能不希望打印出所有的结果，我们可能希望过滤出一些满足制定条件的结果，这个时候，就需要使用到称为“守卫(guard)”的表达式。比如，我们只希望输出1到5之中的所有偶数

    for (i <- 1 to 5 if i%2==0) println(i)

    // Scala也支持“多个生成器”的情形，可以用分号把它们隔开

    for (i <- 1 to 5; j <- 1 to 3) println(i*j)

    // 每个生成器都添加一个“守卫”
    for (i <- 1 to 5 if i%2==0; j <- 1 to 3 if j!=i) println(i*j)

    // for 推导
    for (i <- 1 to 5 if i%2==0) yield i

    //数组
    val intValueArr = new Array[Int](3)  //声明一个长度为3的整型数组，每个数组元素初始化为0
    intValueArr(0) = 12 //给第1个数组元素赋值为12
    intValueArr(1) = 45  //给第2个数组元素赋值为45
    intValueArr(2) = 33 //给第3个数组元素赋值为33

    // 字符串数组
    val myStrArr = new Array[String](3) //声明一个长度为3的字符串数组，每个数组元素初始化为null
    myStrArr(0) = "BigData"
    myStrArr(1) = "Hadoop"
    myStrArr(2) = "Spark"
    for (i <- 0 to 2) println(myStrArr(i))

    // 简化方法
    val intValue = Array(12,45,33)
    val myStr = Array("BigData","Hadoop","Spark")

    // 列表
    val intList = List(1,2,3)
    // 在头部添加一个元素
    val intListOther = 0::intList
    // 构造列表
    val intListw = 1::2::3::Nil  // Nil表示空列表

    // 链接不同的列表
    val intList1 = List(1,2)
    val intList2 = List(3,4)
    val intList3 = intList1:::intList2

    println(intList3.sum)

    // 元组
    val tuple = ("BigData",2015,45.0)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    // 集合

    // 创建一个不可变集
    var mySet = Set("Hadoop","Spark")
    mySet += "Scala"  //向mySet中增加新的元素
    println(mySet.contains("Scala"))

    // 创建不可变集合
    import scala.collection.mutable.Set
    val myMutableSet = Set("Database","BigData")
    myMutableSet += "Cloud Computing"
    println(myMutableSet)


    // 映射
    // 创建一个不可变映射

    val university = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University","PKU"->"Peking University")

    println(university("XMU"))

    // 检查映射中是否包含某个值

    val xmu = if (university.contains("XMU")) university("XMU") else 0
    println(xmu)


    // 可变映射

    import scala.collection.mutable.Map
    val university2 = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University","PKU"->"Peking University")
    university2("XMU") = "Ximan University" //更新已有元素的值
    university2("FZU") = "Fuzhou University" //添加新元素

    // 使用+=操作来添加新的元素
    university2 += ("TJU"->"Tianjin University") //添加一个新元素
    university2 += ("SDU"->"Shandong University","WHU"->"Wuhan University") //同时添加两个新元素

    // 映射循环
    for ((k,v) <- university) printf("Code is : %s and name is: %s\n",k,v)

    // 只想把所有键打印出来：
    for (k<-university.keys) println(k)


    // 只想把所有值打印出来
    for (v<-university.values) println(v)


    // 迭代器
    val iter = Iterator("Hadoop","Spark","Scala")
    while (iter.hasNext) {
      println(iter.next())
    }

    for (elem <- iter) {
      println(elem)
    }


    // 类
    val myCounter = new Counter
    println(myCounter.value)  //打印value的初始值
    myCounter.value = 3 //为value设置新的值
    println(myCounter.value)  //打印value的新值
    myCounter.increment(1) //这里设置步长为1，每次增加1
    println(myCounter.current)

    // 构造函数
    val myCounter1 = new Construct  //主构造器
    val myCounter2 = new Construct("Runner") //第一个辅助构造器，计数器的名称设置为Runner，用来计算跑步步数
    val myCounter3 = new Construct("Timer",2) //第二个辅助构造器，计数器的名称设置为Timer，用来计算秒数
    myCounter1.info  //显示计数器信息
    myCounter1.increment(1)     //设置步长
    printf("Current Value is: %d\n",myCounter1.current) //显示计数器当前值
    myCounter2.info  //显示计数器信息
    myCounter2.increment(2)     //设置步长
    printf("Current Value is: %d\n",myCounter2.current) //显示计数器当前值
    myCounter3.info  //显示计数器信息
    myCounter3.increment(3)     //设置步长
    printf("Current Value is: %d\n",myCounter3.current) //显示计数器当前值

    // 单例对象
    printf("The first person id is %d.\n",SingleCase.newPersonId())
    printf("The second person id is %d.\n",SingleCase.newPersonId())
    printf("The third person id is %d.\n",SingleCase.newPersonId())


    // apply update 方法
    val myObject = new TestApplyClass
    println(myObject("param1"))


    // 继承
    val myCar1 = new BMWCar()
    myCar1.greeting()
    myCar1.info()

    // trait
    val myCarId2 = new BMWCarId()
    printf("My second CarId is %d.\n",myCarId2.currentId)
    myCarId2.greeting("BMW")

    // 模式匹配
    val colorNum = 1
    val colorStr = colorNum match {
      case 1 => "red"
      case 2 => "green"
      case 3 => "yellow"
      case _ => "Not Allowed"
    }
    println(colorStr)
    // 类型模式匹配
    for (elem <- List(9,12.3,"Spark","Hadoop",'Hello)){
      val str  = elem match{
        case i: Int => i + " is an int value."
        case d: Double => d + " is a double value."
        case "Spark"=> "Spark is found."
        case s: String => s + " is a string value."
        case _ => "This is an unexpected value."
      }
      println(str)
    }

    // guard 语句
    for (elem <- List(1,2,3,4)){
      elem match {
        case _ if (elem %2 == 0) => println(elem + " is even.")
        case _ => println(elem + " is odd.")
      }
    }

    // case 类模式匹配
    case class Car(brand: String, price: Int)
    val myBYDCar = new Car("BYD", 89000)
    val myBMWCar = new Car("BMW", 1200000)
    val myBenzCar = new Car("Benz", 1500000)
    for (car <- List(myBYDCar, myBMWCar, myBenzCar)) {
      car match{
        case Car("BYD", 89000) => println("Hello, BYD!")
        case Car("BMW", 1200000) => println("Hello, BMW!")
        case Car(brand, price) => println("Brand:"+ brand +", Price:"+price+", do you want it?")
      }
    }


    // 函数 函数就是一个变量：有类型 有值
    def counter(value: Int): Boolean = { value >= 1} // 函数的类型 (Int) => Int
    val counters: Int => Boolean = { (value) => value > 1 }

    // Lambda表达式
    val myNumFunc: Int=>Int = (num: Int) => num * 2
    println(myNumFunc(3))

    // 闭包
    def plusStep(step: Int) = (num: Int) => num + step
    //给step赋值
    val myFunc = plusStep(3)
    //调用myFunc函数
    println(myFunc(10))


    // 高阶函数
//    def sumInts(a: Int, b: Int): Int = {
//      if(a > b) 0 else a + sumInts(a + 1, b)
//    }

    //定义了一个新的函数sum，以函数f为参数 sum是一个接受函数参数的函数，因此，是一个高阶函数 (Int=>Int, Int, Int) => Int
    def sum(f: Int => Int, a: Int, b: Int): Int ={
      if(a > b) 0 else f(a) + sum(f, a+1, b)
    }
    //定义了一个新的函数self，该函数的输入是一个整数x，然后直接输出x自身
    def self(x: Int): Int = x
    //重新定义sumInts函数
    def sumInts2(a: Int, b: Int): Int = sum(self, a, b)

    // 高阶函数代码重用
    def sum3(f: Int => Int, a: Int, b: Int): Int = {
      if(a > b) 0 else f(a) + sum3(f, a+1, b)
    }

    def self3(x: Int): Int = x
    def square(x: Int): Int = x * x
    def powerOfTwo(x: Int): Int = if(x == 0) 1 else 2 * powerOfTwo(x-1)

    def sumInts(a: Int, b: Int): Int = sum3(self3, a, b)
    def sumSquared(a: Int, b: Int): Int = sum3(square, a, b)
    def sumPowersOfTwo(a: Int, b: Int): Int = sum3(powerOfTwo, a, b)
    println(sumInts2(1,5))
    println(sumSquared(1,5))
    println(sumPowersOfTwo(1,5))

    // 占位符
    val numList = List(-3, -5, 1, 6, 9)
    numList.filter(x => x > 0 )
    numList.filter(_ > 0)


    // 列表循环
    val list = List(1, 2, 3, 4, 5)
    for (elem <- list) println(elem)

    val list1 = List(1, 2, 3, 4, 5)
    list1.foreach(elem => println(elem)) //本行语句甚至可以简写为list.foreach(println)，或者写成：list foreach println

    // 映射
    // 不可变映射
    val university66 = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University","PKU"->"Peking University")
    for ((k,v) <- university66) printf("Code is : %s and name is: %s\n",k,v)
    // 键值
    for (k<-university66.keys) println(k)
    // 值
    for (v<-university66.values) println(v)

    // forearch
    university66 foreach {case(k,v) => println(k+":"+v)} //或者写成：university.foreach

    university66 foreach {kv => println(kv._1+":"+kv._2)}

    // map
    val books = List("Hadoop", "Hive", "HDFS")
    books.map(s => s.toUpperCase) // 参数是 Lamda表达式 也就是匿名函数
    println(books)
    // flatMap
    val books2 = List("Hadoop","Hive","HDFS")
    books2 flatMap (s => s.toList) // books中的每个元素都调用toList，生成List[Char]，最终，多个Char的集合被“拍扁”成一个集合
    println(books2)

    // filter
    // 用filter操作过滤得到那些学校名称中包含“Xiamen”的元素
    val universityOfXiamen = university filter {kv => kv._2 contains "Xiamen"}
    universityOfXiamen.foreach {kv => println(kv._1+":"+kv._2)}

    // reduce
    val list8 = List(1,2,3,4,5)
    val reduce = list8.reduce(_ - _)
    val reduceLeft =list8.reduceLeft(_ + _)
    val reduceRight = list8.reduceRight(_ + _)
    println(reduce)
    println(reduceLeft)
    println(reduceRight)

    // fold
    val list9 = List(1,2,3,4,5)
    val fold = list9.fold(6)(_*_)
    println(fold)
  }
}
