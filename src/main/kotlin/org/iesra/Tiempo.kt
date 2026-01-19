class Tiempo(private var horas: Int = 0, private var minutos: Int = 0, private var segundos: Int = 0) {

    init {
        require(horas in 0..23) { "Las horas deben estar entre 0 y 23" }
        require(minutos in 0..59) { "Los minutos deben estar entre 0 y 59" }
        require(segundos in 0..59) { "Los segundos deben estar entre 0 y 59" }
    }

    override fun toString(): String {
        return "${horas}h ${minutos}m ${segundos}s"
    }

    fun incrementar(t: Tiempo): Boolean {
        val totalSegundos = this.aSegundos() + t.aSegundos()
        if (totalSegundos >= 86400) return false

        this.desdeSegundos(totalSegundos)
        return true
    }

    private fun aSegundos(): Int {
        return horas * 3600 + minutos * 60 + segundos
    }

    private fun desdeSegundos(totalSegundos: Int) {
        horas = (totalSegundos / 3600) % 24
        minutos = (totalSegundos / 60) % 60
        segundos = totalSegundos % 60
    }
}

fun main() {
    val tiempo1 = Tiempo(23, 59, 50)
    println("Tiempo1: $tiempo1")

    val incremento = Tiempo(0, 0, 15)
    if (tiempo1.incrementar(incremento)) {
        println("Tiempo incrementado: $tiempo1")
    } else {
        println("El tiempo no puede superar 23:59:59")
    }
}