package Personagem.Classes

import Personagem.Personagem

class Clérigo : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Clérigo"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}