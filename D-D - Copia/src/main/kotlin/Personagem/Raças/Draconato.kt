package Personagem.Raças

import Personagem.Personagem

class Draconato : Raça{
    override fun bonusRaca(p: Personagem) {
        p.forca += 2
        p.carisma += 1
        println("\nBônus de raça aplicado!\nForça + 2 e Carisma + 1.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "DRACONATO"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}