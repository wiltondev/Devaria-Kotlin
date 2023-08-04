fun main() {
    println("Favor informar nome do convidado: ")
    val nome = readlnOrNull()

    if(nome.isNullOrEmpty()|| nome.isNullOrBlank()){
        println(" Nome informado não é valido!")
        return
    }

    println("Favor informar idade do convidado: ")
    val idade = readlnOrNull()?.toIntOrNull()
    if(idade== null || idade <= 17){
            println("Idade informada não é valida!")
            return

    }
    var estaConvidado = false
    when(nome){
        "João" -> estaConvidado = true
        "Maria" -> estaConvidado = true
        "Pedro" -> estaConvidado = true
        else -> estaConvidado = false
    }
    if(estaConvidado && idade >= 18){
        println("$nome , seja bem vindo a festa Kotlin!")
    }else if (!estaConvidado){
        println("voce não é convidado, verifique com a pessoa que te convidou!")
    }else{
        println("voce não tem idade para participar!")
    }

}

