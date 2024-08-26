package Personagem.Classes

import Personagem.Personagem

class Guerreiro: Classe{
    override fun escolherClasse(p: Personagem) {
        p.classe = "Guerreiro"
        print("\nVocê é então ${p.nome}, o ${p.raca} ${p.classe}")
    }
}