package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val joao = Analista("Joao Pedro", "1234567899", 2000.0)
    //val joao = Funcionario(nome: "Jether Rodrigues", cpf: "1234567899", BigDecimal.valueOf(val: 2000.0))
    //println(joao.nome)
    //println(joao.cpf)
    //println(joao.salario)
    imprimeRelatorioFuncionario.imprime(joao)
}
    fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
