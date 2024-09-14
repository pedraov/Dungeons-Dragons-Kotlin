package Personagem.Raças

import Personagem.Personagem

class Orc : Raça{
    override fun bonusRaca(p: Personagem) {
            p.forca += 2
            p.constituicao += 2
            println("\nBônus de classe aplicado!\nForça + 2 e Constiuição + 1.")
    }

    override fun escolherRaça(p: Personagem) {
        p.raca = "MEIO ORC"
        print("\nRaça escolhida: " + p.raca + "\n")
    }
}