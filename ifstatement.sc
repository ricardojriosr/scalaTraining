
object worksheet {
    def main(args: Array[String]): Unit = {
      val n = 7
      if ( n == 5 ) {
          println("Si, n vale 5")
      } else if ( n == 6 ){
          println("Bueno , pero vale 6")
      } else if ( n == 7 ){
          println("Bueno , pero vale 7")
      } else {
          println("No, n no vale 5, ni vale 6, ni 7")
      }
    }
}

object worksheet {
    val k = 10
    println( if (k==10) "k vale 10" else "k no vale 10")
}

object worksheet {
    val k = 20
    def kVale10(): String = if (k == 10) "k vale 10" else "k no vale 10"
    kVale10()
}
