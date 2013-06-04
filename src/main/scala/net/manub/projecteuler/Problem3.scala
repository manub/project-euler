package net.manub.projecteuler


object Problem3 extends App {

  override def main(args: Array[String]) {

    print(factor(600851475143L))
  }

  def factor(x: Long): List[Long] = {
    if (x <= 1) List.empty

    val primes = (2 until Math.ceil(Math.sqrt(x.toLong)).toInt).filter(x % _ == 0)

    if (!primes.isEmpty)
      primes(0) :: factor(x / primes(0))
    else List.empty

  }

}
