fun main() {
    println("===================================")
    println("     GAME SUIT TERMINAL VERSION")
    println("===================================")

    print("Kesempatan Pemain 1 - Ketik pilih: Gunting/ Kertas/ Batu : ")
    val p1 : String = readLine()!!.toLowerCase()

    print("Kesempatan Pemain 2 - Ketik pilih: Gunting/ Kertas/ Batu : ")
    val p2 : String = readLine()!!.toLowerCase()
    val hasil : String = ("$p1 + $p2")

    val win = ("$hasil")
    val result = when (win) {
        "gunting + kertas" -> println("Pemain ke-1 sebagai pemenang karna memilih Gunting")
        "gunting + batu" -> println("Pemain ke-2 sebagai pemenang karna memilih Batu")
        "gunting + gunting" -> println("Pemain ke-1 & 2, sama-sama memilih Gunting sehingga Seri")
        "batu + kertas" -> println("Pemain ke-2 sebagai pemenang karna memilih Kertas")
        "batu + gunting" -> println("pemain ke-1 sebagai pemenang karna memilih Batu")
        "batu + batu" -> println("pemain ke-1 & 2, sama-sama memilih Batu sehingga Seri")
        "kertas + gunting" -> println("pemain ke-2 sebagai pemenang karna memilih Gunting")
        "kertas + batu" -> println("pemain ke-1 sebagai pemenang karna memilih Kertas")
        "kertas + kertas" -> println("pemain ke-1 & 2, sama-sama memilih Kertas sehingga Seri ")
        else ->println("Maaf pilihan yang anda ketikan salah, silakan ulangi lagi")
    }
}
