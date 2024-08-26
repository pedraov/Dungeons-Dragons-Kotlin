package Personagem.Raças

import Personagem.Personagem

class AnãoMontanha : Raça{
    override fun bonusRaca(p: Personagem) {
        p.forca += 2
        p.constituicao += 2
        println("\nBônus de raça aplicado!\nForça + 2 e Constiuição + 2.")
    }
}