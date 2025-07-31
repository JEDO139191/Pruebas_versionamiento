fun saludar(nombre: String) {
    println("Hola, $nombre")
}

fun despedir(nombre: String) {
    println("Adiós, $nombre")
}

fun main() {
    print("¿Cuál es tu nombre? ")
    val nombre = readLine() ?: ""
    saludar(nombre)
    despedir(nombre)
}