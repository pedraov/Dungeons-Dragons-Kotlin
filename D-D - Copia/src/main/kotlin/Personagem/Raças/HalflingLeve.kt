package Personagem.Raças

import Personagem.Personagem

class HalflingLeve : Raça {
    override fun bonusRaca(p: Personagem) {
        p.destreza += 2
        p.carisma += 1
        print("\n" +
                "Bônus de classe aplicado!\n" +
                "Carisma + 1 e Destreza + 2")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "HALFLING LEVE"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}