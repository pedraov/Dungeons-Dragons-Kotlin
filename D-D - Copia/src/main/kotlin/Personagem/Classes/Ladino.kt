package Personagem.Classes

import Personagem.Personagem

class Ladino : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Ladino"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}