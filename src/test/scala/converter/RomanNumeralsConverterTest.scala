package converter

import org.scalatest.{FreeSpec, Matchers}

class RomanNumeralsConverterTest extends FreeSpec with Matchers {

  val Examples = Seq(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V",
    6 -> "VI",
    7 -> "VII",
    8 -> "VIII",
    9 -> "IX",
    10 -> "X",
    15 -> "XV",
    16 -> "XVI",
    20 -> "XX",
    40 -> "XL",
    50 -> "L",
    90 -> "XC",
    100 -> "C",
    400 -> "CD",
    500 -> "D",
    900 -> "CM",
    1000 -> "M",
    3497 -> "MMMCDXCVII"
  )

  Examples.foreach { case (arabic, roman) =>
      s"convert ${arabic} to ${roman}" in {
        RomanNumeralsConverter.fromArabic(arabic) shouldBe roman
      }
  }
}
