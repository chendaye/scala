object first {
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
    import java.io.PrintWriter //这行是Scala解释器执行上面语句后返回的结果
    val out = new PrintWriter("/tmp/write.file")
    for (i <- 1 to 5) out.println(i)
    // 必须要执行out.close()语句，才会看到output.txt文件被生成，如果没有执行out.close()语句，我们就无法看到生成的output.txt文件
    out.close()

    // 读取文本文件中的行
    import scala.io.Source
    val inputFile = Source.fromFile("/tmp/write.file")
    val lines = inputFile.getLines //返回的结果是一个迭代器
    for (line <- lines) println(line)

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
  }
}
