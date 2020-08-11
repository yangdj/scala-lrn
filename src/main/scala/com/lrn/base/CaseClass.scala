package com.lrn.base

object CaseClass {
  def main(args: Array[String]): Unit = {
    println(getDayMonthYear("007-006-129"))
    println(getDayMonthYear("0076-129"))
    val points: Array[Point] = Array(Point2D(4, 3), Point3D(10, 3, 10))
    for (p <- points) println(hypotenuse(p))
  }

  def getDayMonthYear(s: String): String = s match {
    case s"$day-$month-$year" => s"found day: $day, month: $month, year: $year"
    case _ => "not a date"
  }

  def hypotenuse(p: Point): Double = p match {
    case Point2D(x, y) => math.sqrt(x * x + y * y)
    case Point3D(x, y, z) => math.sqrt(x * x + y * y + z * z)
  }
}