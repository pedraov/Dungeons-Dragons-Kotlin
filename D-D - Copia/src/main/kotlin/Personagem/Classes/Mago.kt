package Personagem.Classes

import Personagem.Personagem

class Mago : Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Mago"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}