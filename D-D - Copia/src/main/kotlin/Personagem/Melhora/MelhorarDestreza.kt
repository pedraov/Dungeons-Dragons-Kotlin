package Personagem.Melhora

import Personagem.Personagem

class MelhorarDestreza : MelhorarPersonagem {
    override fun setAtributo(p : Personagem) {

        val tabelaDeCusto = mapOf(
            8 to 0,
            9 to 1,
            10 to 2,
            11 to 3,
            12 to 4,
            13 to 5,
            14 to 7,
            15 to 9
        )

        if (p.pontos > 0) {

            var valido = false

            while (!valido) {

                print("\nDigite o nível de destreza desejado: ")
                val newDestreza = readln().toIntOrNull()
                val custo = tabelaDeCusto[newDestreza]

                if(custo != null) {
                    if(p.pontos >= custo) {
                        if (tabelaDeCusto.containsKey(newDestreza)) {
                            p.destreza += newDestreza!!
                            print("\nMelhora feita! Nível de Destreza atual: ${p.destreza}\n")
                            p.pontos -= tabelaDeCusto[newDestreza]!!
                            valido = true
                        } else {
                            print("\nPor favor, digite um número entre 8 e 15.\n")
                        }
                    } else {
                        print("\nQuantidade de pontos inválida, digite outro valor.")
                    }
                } else{
                    print("\nPor favor, digite um valor válido.\n")
                    valido = false
                }
            }

        }else {
            p.destreza = 8
            print("\nSem pontos disponíveis, seu nível nesta habilidade será 8.")
        }

    }
}