interface Drawable {
    fun drawInfo()
}

class Square(val side: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side length $side")
    }
}

class Triangle(val base: Double, val height: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
    }
}

fun main() {
    val square = Square(5.0)
    square.drawInfo()

    val triangle = Triangle(3.0, 4.0)
    triangle.drawInfo()
}