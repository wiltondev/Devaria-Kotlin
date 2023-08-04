import java.math.BigDecimal

fun calculaOperacao(num1: BigDecimal, operador: String, numero2: BigDecimal): BigDecimal {
    when (operador) {
        "+" -> return num1 + numero2

        "-" -> return num1 - numero2

        "*" -> return num1 * numero2

        "/" ->return num1 / numero2

        "%" -> return num1 % numero2

        else ->return BigDecimal.ZERO
    }

}

    fun main() {

        println("Digite um número valido:")
        val num1 = readLine()!!.toBigDecimalOrNull()

        if (num1 == null) {
            println("número inválido")
            return
        }


	println("digite um operador valido ( +, -, *, /, % ):")
	val operador = readLine()

	if (operador.isNullOrEmpty() || operador.isBlank() ||
		(operador != "+" && operador != "-" && operador != "*" && operador != "/" && operador != "%")
	) {
		println("operador invalido")
		return
	}

    println("digite outro número:")
    val numero2 = readLine()?.toBigDecimalOrNull()

    if ("numero2" == null) {
        println("número inválido")
        return
    }
    val resultado = calculaOperacao(num1, operador, numero2!!)
    println("O resultado é: $resultado")

    }
