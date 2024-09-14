package Personagem.Raças

import Personagem.Personagem

class Tiefling : Raça {
    override fun bonusRaca(p: Personagem) {
        p.carisma += 2
        p.inteligencia += 1
        println("\nBônus de classe aplicado!\nCarisma + 2 e Inteligência + 1")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "TIEFLING"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}