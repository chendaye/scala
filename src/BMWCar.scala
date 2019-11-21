class BMWCar extends Car {
  override val carBrand = "BMW"  //重写超类字段，需要使用override关键字，否则编译会报错
  def info() {printf("This is a %s car. It is on sale", carBrand)} //重写超类的抽象方法时，不需要使用override关键字，不过，如果加上override编译也不错报错
  override def greeting() {println("Welcome to my BMW car!")} //重写超类的非抽象方法，必须使用override关键字
}
