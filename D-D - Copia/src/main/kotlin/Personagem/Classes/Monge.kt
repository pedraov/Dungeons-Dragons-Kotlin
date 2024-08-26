package Personagem.Classes

import Personagem.Personagem

class Monge: Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Monge"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}