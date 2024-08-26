package Personagem.Raças

import Personagem.Personagem

class AnãoColina : Raça{
    override fun bonusRaca(p: Personagem) {
        p.constituicao += 2
        p.sabedoria += 1
        println("\nBônus de raça aplicado!\nConstiuição + 2 e sabedoria + 1")
    }
}