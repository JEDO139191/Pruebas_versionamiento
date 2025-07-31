fun saludar(nombre: String) {
    println("Hola, $nombre")
}

fun main() {
    print("¿Cuál es tu nombre? ")
    val nombre = readLine() ?: ""
    saludar(nombre)
}