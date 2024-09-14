package Personagem.Raças

import Personagem.Personagem

class GnomoRochas : Raça {
    override fun bonusRaca(p: Personagem) {
        p.constituicao += 1
        p.inteligencia += 2
        println("\nBônus de classe aplicado!\nConstiuição + 1 e Inteligência + 2.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "GNOMO DAS ROCHAS"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}