package converter

import scala.annotation.tailrec

object RomanNumeralsConverter {

  val Rules = Seq(
    1000 -> "M",
    900 -> "CM",
    500 -> "D",
    400 -> "CD",
    100 -> "C",
    90 -> "XC",
    50 -> "L",
    40 -> "XL",
    10 -> "X",
    9 -> "IX",
    5 -> "V",
    4 -> "IV",
    1 -> "I"
  )

  def fromArabic(number: Int): String = {
    var remainder: Int = number

    toRoman("", number, Rules)
  }

  @tailrec
  def toRoman(result: String, number: Int, rules: Seq[(Int, String)]): String = rules match {
    case Nil => result
    case (arabic, roman) :: rest =>
      val times = number / arabic
      val remainder = number % arabic
      toRoman(result + (roman * times), remainder, rest)
  }
}
