fun saludar(nombre: String) {
    if (nombre.isNotBlank()) {
        println("Hola, $nombre")
    } else {
        println("Hola, desconocido")
    }
}

fun despedir(nombre: String) {
    if (nombre.isNotBlank()) {
        println("Adiós, $nombre")
    } else {
        println("Adiós, desconocido")
    }
}

fun main() {
    print("¿Cuál es tu nombre? ")
    val nombre = readLine()?.trim() ?: ""
    saludar(nombre)
    despedir(nombre)
}