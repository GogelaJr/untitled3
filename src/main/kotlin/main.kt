fun main() {
    val f1 = Fraction(1F, 3F)


    val f2 = Fraction(2F, 6F)

    println(f1==f2)
    println(f1+f2)
    println(f1 * f2)

}


class Fraction(n1 : Float, d1: Float) {
    private var numerator: Float = n1
    private var denominator: Float = d1

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if(numerator * other.denominator/denominator ==  other.numerator){
                return true
            }
        }
        return false
    }
    override fun toString(): String {
        return "$numerator/$denominator"
    }

    operator fun plus(other: Any): String {
        if (other is Fraction){
            var a = numerator * other.denominator
            var b = other.numerator * denominator
            var c = denominator * other.denominator
            var d = a+b
            var d1 = d / 6
            var d2 = c / 6
            return "${a+b}/$c shekvecilad $d1/$d2"
//            return "$d2"
        }
        return "ragaca airia"
    }

    operator fun times(other: Any?): String {
        if (other is Fraction){
            val a = (numerator * other.numerator)
            val b = (denominator * other.denominator)
            val c = (a/b)
            val d = a / 2
            val d1 = b / 2
            return "$d/$d1"
        }
        return "eh"

    }

}