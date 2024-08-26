package Personagem.Raças

import Personagem.Personagem

class HalflingRobusto : Raça{
    override fun bonusRaca(p: Personagem) {
        p.destreza += 2
        p.constituicao += 1
        println("\nBônus de classe aplicado!\nDestreza + 2 e Constiuição + 1.")
    }
}