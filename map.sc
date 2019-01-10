/*
object Worksheet {
  def main(args: Array[String]): Unit = {
    val numeros = List(4,8,15,16,23,42)
    //List(8,16,30,32,46,84)
    def doble(x: Int): Int - 2 * x
    numeros.map { x => 2 * x }
  }
}
*/

object Worksheet {
  def main(args: Array[String]): Unit = {
    val coches = List("BMW","Mercedes","SEAT","Renault","Toyota")
    //coches.map { coche => coche.toUpperCase() }
    println(coches.map { _.toUpperCase() })
  }
}
