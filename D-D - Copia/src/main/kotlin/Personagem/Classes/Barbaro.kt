package Personagem.Classes

import Personagem.Personagem

class Barbaro : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Bárbaro"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}