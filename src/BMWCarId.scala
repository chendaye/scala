class BMWCarId extends CarId{ //使用extends关键字
  override var id = 20000 //BMW汽车编号从20000开始
  def currentId(): Int = {id += 1; id} //返回汽车编号
}