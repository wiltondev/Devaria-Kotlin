import classes.Produto
import kotlin.collections.filter
import kotlin.collections.filter as filter1

/*





 → Exibir a lista de produtos por ordem alfabetica, no mercado para que o usuário possa pedir na próxima vez.
*/

//->Escrever um programa -ok
fun main(argumentos : Array<String>) {
	if (argumentos.isEmpty()) {
		println("Favor informar lista de produtos que deseja comprar")
		return
	}

//→ Recebe algumas instruções como argumentos - ok
	val itensDisponiveis = arrayOf(
		Produto("Arroz", 10.0)
		, Produto("Feijão", 15.95)
		, Produto("Açucar", 2.90)
		, Produto("Farinha", 5.95)

	)

	//→ Validar se eles estão na lista de itens do mercado
	val itensSelecionadosDisponiveis = itensDisponiveis.filter1 {
		produto -> argumentos.any {
			argumento -> argumento.equals(produto.nome, ignoreCase = true )

		}
	}
	// → Caso estejam, avisar o usuário quais produtos estão disponíveis

	for (itenSelecionadoDisponivel in itensSelecionadosDisponiveis) {
		println(itenSelecionadoDisponivel.exibirDadosProduto())
	}
// → Quais não estão disponiveis
	val argumentosSelecionadosNaoDisponiveis = argumentos.filter {
		argumento -> !itensDisponiveis.any {
			produto -> argumento.equals(produto.nome, ignoreCase = true )
		}
	}
//quais estão
	argumentosSelecionadosNaoDisponiveis.forEach {
		println("Esse produto não está disponível: $it")

	}

	//eiber a lista de produtos por ordem alfabetica usando o lambida sortBy
	itensDisponiveis.sortBy { it.nome }
	itensDisponiveis.forEach {println("Produto disponível: ${it.exibirDadosProduto()}")
	}

}
