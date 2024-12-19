import kotlin.random.Random


fun main() {

    val secret = Random.nextInt(0,101)
    var playng = true
    var n: Int = 0

    while (playng){
        print("> ")
        n = readln().toInt()

        when{
            n > secret -> println("O número sorteado é menor")
            n < secret -> println("O número sorteado é maior")
            else -> playng = false
        }

    }

    println()
    println("Parabéns voce acertou o número sorteado o numero é $n!!")

}