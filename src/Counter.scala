class Counter {
  private var privateValue = 0  //变成私有字段，并且修改字段名称
  def value = privateValue //定义一个方法，方法的名称就是原来我们想要的字段的名称 getter
  def value_=(newValue: Int){
    if (newValue > 0) privateValue = newValue //只有提供的新值是正数，才允许修改  setter
  }
  def increment(step: Int): Unit = { value += step}
  def current(): Int = {value}
}