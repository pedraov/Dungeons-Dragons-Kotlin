package Personagem.Raças

import Personagem.Personagem

class ElfoDrow : Raça{
    override fun bonusRaca(p: Personagem) {
        p.destreza += 2
        p.carisma += 1
        println("\nBônus de raça aplicado!\nDestreza + 2, Carisma + 1.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "ELFO DROW"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}