class Rectangulo(private val base: Double, private val altura: Double) {

    init {
        require(base > 0) { "La base debe ser mayor que 0" }
        require(altura > 0) { "La altura debe ser mayor que 0" }
    }

    fun area(): Double = base * altura
    fun perimetro(): Double = 2 * (base + altura)

    override fun toString(): String {
        return "Rectángulo(base=$base, altura=$altura)"
    }
}

fun main() {
    val rectangulos = listOf(
        Rectangulo(5.0, 10.0),
        Rectangulo(3.0, 6.0),
        Rectangulo(7.5, 4.5)
    )

    rectangulos.forEach {
        println(it)
        println("Área: ${it.area()}, Perímetro: ${it.perimetro()}")
    }
}