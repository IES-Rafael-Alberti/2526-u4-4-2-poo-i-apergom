class Persona(
    val nombre: String?,
    val peso: Double,
    private var _altura: Double
) {
    val imc: Double
        get() = peso / (_altura * _altura)

    constructor(nombre: String, peso: Double, altura: Double) : this(nombre, peso, altura)

    var altura: Double
        get() = _altura
        set(value) {
            require(value > 0) { "La altura debe ser mayor a 0" }
            _altura = value
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false
        return nombre == other.nombre && peso == other.peso && altura == other.altura
    }

    override fun toString(): String =
        "Nombre: ${nombre ?: "Sin nombre"}, Peso: $peso, Altura: $altura, IMC: $imc"

    fun calcularDescripcion(): String {
        return when {
            imc < 18.5 -> "Bajo peso"
            imc < 24.9 -> "Saludable"
            imc < 29.9 -> "Sobrepeso"
            else -> "Obesidad"
        }
    }
}

fun main() {
    val persona1 = Persona(null, 70.0, 1.75)
    val persona2 = Persona("Ana", 68.0, 1.60)
    val persona3 = Persona("Luis", 75.0, 1.80)

    println("Persona 1: $persona1")
    println("Persona 2: $persona2")
    println("Persona 3: $persona3")
}