trait CarId {
  // 包含一个抽象字段id和抽象方法currentId。注意，抽象方法不需要使用abstract关键字，特质中没有方法体的方法，默认就是抽象方法
  var id: Int
  def currentId(): Int     //定义了一个抽象方法

  // 也可以包含具体的实现
  def greeting(msg: String) {println(msg)}
}