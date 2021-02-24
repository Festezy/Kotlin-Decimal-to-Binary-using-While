fun main(){
val num = 20
val binary = convertDecimalToBinary(num)
println("$num in decimal = $binary in binary")
}

fun convertDecimalToBinary(n: Int): Long {
    var n = n
    var binaryNumber: Long = 0
    var remainder: Int
    var i = 1

    while (n != 0) {
        remainder = n % 2
        System.out.printf("", n, n / 2)
        n /= 2
        binaryNumber += (remainder * i).toLong()
        i *= 10
    }
    return binaryNumber
}
