object Q1 extends App {
    val obj1 = new Rational(1,2)
    val obj2 = new Rational(4,5)
    println(obj1.neg)
    println(obj2.neg)
    
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
    
}
