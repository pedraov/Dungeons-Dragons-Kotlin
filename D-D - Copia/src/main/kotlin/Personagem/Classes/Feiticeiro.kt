package Personagem.Classes

import Personagem.Personagem

class Feiticeiro : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Feiticeiro"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}