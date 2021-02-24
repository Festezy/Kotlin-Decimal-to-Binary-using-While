fun main(){
    var dec = 10
    var bin = ""

    println("Dec: $dec")

    do {
        bin = "${dec % 2}$bin"
        dec = Math.floor((dec / 2).toDouble()).toInt()
    } while (dec > 0)

    println("Bin : $bin")
}
