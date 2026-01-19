class Coche(
    val marca: String, 
    val modelo: String,
    val caballos: Int,
    val puertas: Int,
    val matricula: String
) {
    var color: String? = null
        set(value) {
            require(value != null) { "El color no puede ser nulo" }
            field = value
        }

    init {
        require(marca.isNotEmpty()) { "La marca no puede ser vacío" }
        require(modelo.isNotEmpty()) { "El modelo no puede ser vacío" }
        require(caballos in 70..700) { "El número de caballos debe ser entre 70 y 700" }
        require(puertas in 3..5) { "El número de puertas debe ser entre 3 y 5" }
        require(matricula.length == 7) { "La matricula debe ser de 7 caracteres" }
    }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', caballos=$caballos, puertas=$puertas, matricula='$matricula', color=$color)"
    }
}

fun main() {
    try {
        val coche = Coche("Ford", "Focus", 120, 5, "1234567")
        coche.color = "Rojo"
        println(coche)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}