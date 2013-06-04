package net.manub.projecteuler

object Problem2 extends App {

  override def main(args: Array[String]) {
    def sum = (x: Int, y: Int) => x + y

    println (fibonacci.filter(_ % 2 == 0).takeWhile(_ < 4e6).reduce(sum))
  }

  lazy val fibonacci: Stream[Int] = 0 #:: 1 #:: fibonacci.zip(fibonacci.tail).map { n => n._1 + n._2 }



}
