package Personagem.Classes

import Personagem.Personagem

class Guardião: Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Guardião"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}