class Construct {
  private var value = 0 //value用来存储计数器的起始值
  private var name = "" //表示计数器的名称
  private var mode = 1 //mode用来表示计数器类型（比如，1表示步数计数器，2表示时间计数器）

  def this(name: String){ //第一个辅助构造器
    this() //调用主构造器
    this.name = name
  }
  def this (name: String, mode: Int){ //第二个辅助构造器
    this(name) //调用前一个辅助构造器
    this.mode = mode
  }
  def increment(step: Int): Unit = { value += step}
  def current(): Int = {value}
  def info(): Unit = {printf("Name:%s and mode is %d\n",name,mode)}
}
