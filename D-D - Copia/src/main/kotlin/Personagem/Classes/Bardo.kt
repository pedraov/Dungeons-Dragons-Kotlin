package Personagem.Classes

import Personagem.Personagem

class Bardo : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Bardo"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}