fun main(argumentos: Array<String>) {

	for(indice in argumentos.indices){
		println("Percorrendo os argumentos posição: $indice e valor ${argumentos[indice]}")
	}


	for(indiceDecrescente in argumentos.size-1 downTo 0){
		println("percorrendo os argumentos posição: $indiceDecrescente e valor: ${argumentos[indiceDecrescente]}")
	}

	for(argumentos in argumentos){
		println("percorrendo os argumentos com foreach: $argumentos")
	}


	var contadorDeArgumentosLidos = 0
	while (contadorDeArgumentosLidos < argumentos.size){
		println("percorrer os argumentos posição:${++contadorDeArgumentosLidos} e valor:${argumentos[contadorDeArgumentosLidos-1]}")
		++contadorDeArgumentosLidos
	}

	//do while
	var contadorLoopsEfetuados = 0
	do {
		println("percorrer os argumentos posição com do while, total de loops:$contadorLoopsEfetuados e valor:${argumentos[contadorLoopsEfetuados ]}")
		contadorLoopsEfetuados++
	} while (contadorLoopsEfetuados < argumentos.size)

}