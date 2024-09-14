package Personagem.Raças

import Personagem.Personagem

class MeioElfo : Raça {
    override fun bonusRaca(p: Personagem) {
        p.carisma += 2
        println("\nBônus de raça aplicado!\nCarisma + 2.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "MEIO ELFO"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}