//import scala.collection.mutable

object Worksheet {
  def main(args: Array[String]): Unit = {
    /*
                    ANY
    AnyVal                          ANYREF
    AnyVal: Int, Long, Double, Float, Byte, Short, Char , Boolean, Unit
    AnyRef: List, Null, Nothing
    */

    //Inmutables
    //val k = 5

    //Mutables
    //var j = 5

    /*
    Traversable
          |
    Iterable
    ------------------
    Set   Map   Seq
                  |
                -------------------------
                IndexedSeq    LinearSeq

    */
    val frutas = Array("Pera","Manzana","Albaricoque")
    frutas.apply(1) // Manzana
    frutas(0) // Pera
    frutas.length // 3
    frutas.isEmpty //false
    frutas.nonEmpty // true
    frutas.indexOf("Pera") // 0
    frutas indexOf "Pera" //0
    

  }
}
