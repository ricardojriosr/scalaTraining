
object worksheet {
  def main(args: Array[String]): Unit = {
    var k = 0
    while (k < 20) {
      //println("k vale " + k)
      println(s"k vale $k (el siguient es ${k + 1})")
      k = k + 1
    }
  }
}

object worksheet {
  def main(args: Array[String]): Unit = {
    var k = 0
    do {
      println(s"k vale $k")
      k = k + 1
    } while(k < 20)
  }
}
