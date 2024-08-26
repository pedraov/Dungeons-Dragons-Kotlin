package Personagem.Classes

import Personagem.Personagem

class Bruxo : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Bruxo"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}