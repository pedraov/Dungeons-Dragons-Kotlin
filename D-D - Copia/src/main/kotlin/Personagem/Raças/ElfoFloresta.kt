package Personagem.Raças

import Personagem.Personagem

class ElfoFloresta : Raça{
    override fun bonusRaca(p: Personagem) {
        p.destreza += 2
        p.sabedoria += 1
        println("\nBônus de raça aplicado!\nDestreza + 2 e Sabedoria + 1.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "ELFO DA FLORESTA"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}