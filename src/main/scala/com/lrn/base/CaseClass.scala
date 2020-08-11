package com.lrn.base

object CaseClass {
  def main(args: Array[String]): Unit = {
    println(getDayMonthYear("007-006-129"))
    println(getDayMonthYear("0076-129"))
  }

  def getDayMonthYear(s: String): String = s match {
    case s"$day-$month-$year" => s"found day: $day, month: $month, year: $year"
    case _ => "not a date"
  }
}