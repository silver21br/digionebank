package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val maria = Gerente("JMaria do Carmo", "1234567899", 5000.0, "senha123")
    //val joao = Funcionario(nome: "Jether Rodrigues", cpf: "1234567899", BigDecimal.valueOf(val: 2000.0))
    //println(joao.nome)
    //println(joao.cpf)
    //println(joao.salario)
    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}
