object SingleCase {
  // 单例对象
  private var lastId = 0  //一个人的身份编号
  def newPersonId() = {
    lastId +=1
    lastId
  }
}
