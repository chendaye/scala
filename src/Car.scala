abstract class Car{   //是抽象类，不能直接被实例化
  val carBrand: String //字段没有初始化值，就是一个抽象字段
  def info() //抽象方法，不需要使用abstract关键字
  def greeting() {println("Welcome to my car!")}
}
