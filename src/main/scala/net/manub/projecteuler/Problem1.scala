package net.manub.projecteuler

object Problem1 extends App {

  def sumMultiples3or5UpTo(limit: Int): Int = {
    (1 until 1000).foldLeft(0)(
      (x, y) => {x + (if (y % 3 == 0 || y % 5 == 0) y else 0)}
    )
  }

  override def main(args: Array[String]) {
    print(sumMultiples3or5UpTo(999))
  }


}
