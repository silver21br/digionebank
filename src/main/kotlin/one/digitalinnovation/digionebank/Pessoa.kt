package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "099.899.238-23"
    private set

    constructor()

    fun pessoainfo() = "nome $ cpf"

    inner class Endereco {
        var rua: String = "rua teste"
    }
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.Endereco().rua)
    println(jether.pessoainfo())

}