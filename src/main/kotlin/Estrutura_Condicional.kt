fun main(){
    print("Em que ano estamos? ")
    val anoAtual = readln().toInt()
    print("Em que ano você nasceu? ")
    val anoNascimento = readln().toInt()
    val idade = subtracao(anoAtual, anoNascimento)
    print("Em $anoAtual você terá $idade anos")
    if (idade >= 21) {
        print(" e já terá atingido a maioridade.")
    }   else {
        print(" #chateado")
    }

}
fun subtracao(anoAtual:Int,anoNascimento:Int):Int {
    return anoAtual - anoNascimento
}