fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor informar um argumento valido!")
        return
    }

    val numero = argumentos[0].toIntOrNull()

    if(numero == null){
        println("Favor informar um numero valido!")
        return
    }

    println("O numero informado foi: $numero")


    var soma = 0
    soma = numero + numero
    println ("A soma é $soma")

}