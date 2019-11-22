import java.io.File
import scala.io.Source
object WordCount {
  def main(args: Array[String]): Unit = {
    val dirFile = new File("/home/hadoop/scala/wordCount") //读取文件夹信息
    val files=dirFile.listFiles // 文件夹下的所有文件
    for(file <- files) println(file)  // 查看文件夹里的文件
    val listFiles=files.toList // 文件转化为 list
    val wordsMap=scala.collection.mutable.Map[String,Int]() // 定义一个函数
    /*一次遍历每一个文件  读取文件的所有行  遍历文件的每一行，把行按空格拆分为单词 遍历每一个单词*/
    listFiles.foreach( file =>Source.fromFile(file).getLines().foreach(line=>line.split(" ").
      foreach(
        /*检查单词是否已经包含在map中(单词作为键值)，若有，对应元素+1  若无，追加新元素到map*/
        word=>{
          if (wordsMap.contains(word)) {
            wordsMap(word)+=1
          }else {
            wordsMap+=(word->1)
          }
        }
      )
    )

    )
    println(wordsMap)
    for((key,value)<-wordsMap) println(key+": "+value)
  }
}