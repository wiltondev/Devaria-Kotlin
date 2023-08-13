package classes

class Produto(val nome: String, val preco: Double){
	fun exibirDadosProduto() : String{
		return "Produto: $nome - Preço: $preco"

	}
}