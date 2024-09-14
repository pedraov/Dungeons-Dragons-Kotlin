package Personagem.Raças

import Personagem.Personagem

class Humano : Raça{
    override fun bonusRaca(p: Personagem) {
            p.forca += 1
            p.carisma += 1
            p.destreza += 1
            p.constituicao += 1
            p.inteligencia += 1
            p.sabedoria += 1
            println("\nBônus de classe aplicado!\nForça + 1, Carisma + 1, Destreza + 1, Constiuição + 1, Sabedoria + 1 e Inteligência + 1.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "HUMANO"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}