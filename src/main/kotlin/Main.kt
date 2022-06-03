fun main(args: Array<String>) {
    val operacao:Int?
    var num1:Int
    var num2:Int

    print("Digite o primeiro número: ")
    num1 = readLine()?.toInt()?:0
    print("Digite o segundo número: ")
    num2 = readLine()?.toInt()?:0

    println("Calculadora básica: ")
    println("Escolha a operação: ")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    print("Escolha a operação desejada: ")

    operacao = readLine()?.toInt()

    when (operacao){
        1 -> print(num1 + num2)
        2 -> print(num1 - num2)
        3 -> print(num1 * num2)
        4 -> print(num1 / num2)
        else -> print("Opção inválida")
    }

}

