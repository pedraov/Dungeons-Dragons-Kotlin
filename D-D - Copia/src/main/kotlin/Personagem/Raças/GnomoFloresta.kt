package Personagem.Raças

import Personagem.Personagem

class GnomoFloresta : Raça {
    override fun bonusRaca(p: Personagem) {
        p.destreza += 1
        p.inteligencia += 2
        println("\nBônus de raça aplicado!\nDestreza + 1 e Inteligência + 2.")
    }
}