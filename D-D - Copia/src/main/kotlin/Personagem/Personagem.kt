package Personagem

import Personagem.Classes.*
import Personagem.Melhora.*
import Personagem.Raças.*

class Personagem () {

    var nome: String? = null
    var raca: String? = null
    var classe: String? = null
    var nivel: Int = 1
    var vida: Int = 0
    var pontos = 27
    var forca = 0
    var destreza = 0
    var inteligencia = 0
    var constituicao = 0
    var sabedoria = 0
    var carisma = 0

    fun EscolherRaça(r: Raça){
        r.escolherRaça(this)
    }
    fun MelhorarPersonagem(m: MelhorarPersonagem){
        m.setAtributo(this)
    }

    fun BonusRaça(r: Raça) {
        r.bonusRaca(this)
    }

    fun EscolherClasse(c : Classe){
        c.escolherClasse(this)
    }

    fun CalcularPV(){
        var modificador: Int = 0
        when(constituicao){
            8 -> modificador = -1
            9 -> modificador = -1
            10 -> modificador = 0
            11 -> modificador = 0
            12 -> modificador = 1
            13 -> modificador = 1
            14 -> modificador = 2
            15 -> modificador = 2
            16 -> modificador = 3
            17 -> modificador = 3
            18 -> modificador = 4
            19 -> modificador = 4
            else -> modificador = 0
        }

        vida = 10 + modificador
    }

    fun MostrarPersonagem(){
        print("\n${nome}, o ${raca} ${classe}.")
        print("\nPontos de Vida: ${vida}")
        print("\nNível: ${nivel}")
        print("\nForça: ${forca}")
        print("\nDestreza: ${destreza}")
        print("\nInteligencia: ${inteligencia}")
        print("\nConstituicao: ${constituicao}")
        print("\nSabedoria: ${sabedoria}")
        print("\nCarisma: ${carisma}")
    }

    init {
        fun Interação1(){

            //Interação 1 - Escolha de nome
            var nome: String? = null

            while (nome.isNullOrBlank() || nome.any { it.isDigit() }) {
                print("Olá viajante, qual seria seu nome?\n")
                nome = readLine()

                if (nome.isNullOrBlank()) {
                    println("Por favor, insira um nome válido (não pode ser vazio).")
                } else if (nome.any { it.isDigit() }) {
                    println("O nome não pode conter números. Tente novamente.")
                    nome = null
                }
            }

            this.nome = nome

            print("\nMuito prazer ${this.nome}, eu sou seu mestre e irei te guiar na criação do seu personagem!")
        }

        fun Interação2(){

            //Interação 2 - Escolha da raça
            var opcao: Int? = null

            while (opcao == null) {
                print("\nVamos escolher a raça do seu personagem, você pode ser: 1 - Humano, 2 - Elfo, 3 - Anão" +
                        ", 4 - Halfling, 5 - Gnomo, 6 - Draconato, 7 - Meio-Elfo, 8 - Meio-Orc ou 9 - Tiefling.\nEscolha uma delas para prosseguir\nDigite o número da raça que deseja.\n")

                val entrada = readLine()
                opcao = entrada?.toIntOrNull()

                if (opcao == null || opcao !in 1..9) {
                    println("Por favor, digite um número válido entre 1 e 9.")
                    opcao = null
                }
            }

            //Melhorar isto:
            //Package de controle?
            when (opcao) {
                1 -> {
                    this.EscolherRaça(Humano())
                    print(this.raca)
                    this.BonusRaça(Humano())
                }

                2 -> {
                    var opcao: Int? = null

                    while (opcao == null) {
                        print("\nEscolha entre as Sub-Raças:" +
                                "1 - Alto Elfo, 2 - Elfo da Floresta e 3 - Drow (Elfo Sombrio)\n")

                        val entrada = readLine()
                        opcao = entrada?.toIntOrNull()

                        if (opcao in 1..3) {
                            when(opcao) {
                                1 -> {this.EscolherRaça(ElfoAlto()); this.BonusRaça(ElfoAlto())}
                                2 -> {this.EscolherRaça(ElfoFloresta()); this.BonusRaça(ElfoFloresta())}
                                3 -> {this.EscolherRaça(ElfoDrow()); this.BonusRaça(ElfoDrow())}
                            }
                        } else {
                            print("Por favor, digite um número entre 1 e 3.")
                            opcao = null
                        }
                    }
                }

                3 -> {
                    var opcao: Int? = null

                    while (opcao == null) {
                        print("\nEscolha entre as Sub-Raças:" +
                                "1 - Anão da Colina e 2 - Anão da Montanha.\n")

                        val entrada = readLine()
                        opcao = entrada?.toIntOrNull()

                        if (opcao in 1..2) {
                            when(opcao) {
                                1 -> {this.EscolherRaça(AnãoColina()); this.BonusRaça(AnãoColina())}
                                2 -> {this.EscolherRaça(AnãoMontanha()); this.BonusRaça(AnãoMontanha())}
                            }
                        } else {
                            print("Por favor, escolha entre as duas raças.")
                            opcao = null
                        }
                    }

                }

                4 -> {
                    var opcao: Int? = null

                    while (opcao == null) {
                        print("\nEscolha entre as Sub-Raças:" +
                                "1 - Halfling Pés-Leves e 2 - Halfling Robusto.\n")

                        val entrada = readLine()
                        opcao = entrada?.toIntOrNull()

                        if (opcao in 1..2) {
                            when(opcao) {
                                1 -> {this.EscolherRaça(HalflingLeve()); this.BonusRaça(HalflingLeve())}
                                2 -> {this.EscolherRaça(HalflingRobusto()); this.BonusRaça(HalflingRobusto())}
                            }
                        } else {
                            print("Por favor, escolha entre as duas raças.")
                            opcao = null
                        }
                    }
                }

                5 -> {
                    var opcao: Int? = null

                    while (opcao == null) {
                        print("\nEscolha entre as Sub-Raças:" +
                                "1 - Gnomo da Floresta e 2 - Gnomo das Rochas.\n")

                        val entrada = readLine()
                        opcao = entrada?.toIntOrNull()

                        if (opcao in 1..2) {
                            when(opcao) {
                                1 -> {this.EscolherRaça(GnomoFloresta()); this.BonusRaça(GnomoFloresta())}
                                2 -> {this.EscolherRaça(GnomoRochas()); this.BonusRaça(GnomoRochas())}
                            }
                        } else {
                            print("Por favor, escolha entre as duas raças.")
                            opcao = null
                        }
                    }
                }

                6 -> {
                    this.EscolherRaça(Draconato())
                    this.BonusRaça(Draconato())
                }

                7 -> {
                    this.EscolherRaça(MeioElfo())
                    this.BonusRaça(MeioElfo())
                }

                8 -> {
                    this.EscolherRaça(Orc())
                    this.BonusRaça(Orc())
                }

                9 -> {
                    this.EscolherRaça(Tiefling())
                    this.BonusRaça(Tiefling())
                }

            }

            print("\nÓtimo, ${this.nome} o ${this.raca}")

        }


        fun Interação3(){

            //Interação 3 - Escolha da classe
            var opcao: Int? = null

            while(opcao == null) {
                print("\nCerto, agora temos que escolher sua classe!\nEscolha entre as seguintes classe: ")
                print(
                    "\n   1 - Barbaro\n   2 - Bardo\n   3 - Bruxo\n   4 - Clérigo\n   5 - Druida\n   6 - Feiticeiro\n   7 - Guardião\n   8 - Guerreiro\n   9 - Ladino\n" +
                            "   10 - Mago\n   11 - Monge\n"
                )

                val entrada = readLine()

                opcao = entrada?.toIntOrNull()

                if (opcao == null || opcao !in 1..11) {
                    print("\nPor favor, digite um número válido entre 1 e 11.")
                    opcao = null
                }
            }

            when (opcao) {
                1 -> {
                    this.EscolherClasse(Barbaro())
                }

                2 -> {
                    this.EscolherClasse(Bardo())
                }

                3 -> {
                    this.EscolherClasse(Bruxo())
                }

                4 -> {
                    this.EscolherClasse(Clérigo())
                }

                5 -> {
                    this.EscolherClasse(Druida())
                }

                6 -> {
                    this.EscolherClasse(Feiticeiro())
                }
                7 ->{
                    this.EscolherClasse(Guardião())
                }
                8 ->{
                    this.EscolherClasse(Guerreiro())
                }
                9 ->{
                    this.EscolherClasse(Ladino())
                }
                10 ->{
                    this.EscolherClasse(Mago())
                }
                11 ->{
                    this.EscolherClasse(Monge())
                }
            }
        }

        fun Interação4() {
            //Interação 4 - Melhora do personagem
            print(
                "\nBom ${this.nome}, está na hora de melhorar as habilidades do seu personagem\n" +
                        "Você possui 6 habilidades (Força, Destreza, Inteligência, Constituição, Sabedoria e Carisma)" +
                        " das quais podem ser melhoradas até o nível 15, o nível mais baixo permitido é 8." +
                        "\nCada habilidade tem seu custo, você tem 27 pontos para gastar com a evolução de suas habilidades seguindo a tabela:\n" +
                        "Nível  |  Custo\n" +
                        "   8   |    0  \n" +
                        "   9   |    1  \n" +
                        "  10   |    2  \n" +
                        "  11   |    3  \n" +
                        "  12   |    4  \n" +
                        "  13   |    5  \n" +
                        "  14   |    7  \n" +
                        "  15   |    9  \n"
            )

            //Melhora de força
            print("\nQuantos níveis você gostaria de colocar em força?")
            this.MelhorarPersonagem(MelhorarForca())
            print("Pontos disponíveis: ${this.pontos}\n")

            //Melhora de destreza
            print("\nQuantos níveis você gostaria de colocar em destreza?")
            this.MelhorarPersonagem(MelhorarDestreza())
            print("Pontos disponíveis: ${this.pontos}\n")

            //Melhora de inteligência
            print("\nQuantos níveis você gostaria de colocar em inteligência?")
            this.MelhorarPersonagem(MelhorarInteligencia())
            print("Pontos disponíveis: ${this.pontos}\n")

            //Melhora de constituição
            print("\nQuantos níveis você gostaria de colocar em Constituição?")
            this.MelhorarPersonagem(MelhorarConstituicao())
            print("Pontos disponíveis: ${this.pontos}\n")

            //Melhora de sabedoria
            print("\nQuantos níveis você gostaria de colocar em sabedoria?")
            this.MelhorarPersonagem(MelhorarSabedoria())
            print("Pontos disponíveis: ${this.pontos}\n")

            //Melhora de carisma
            print("\nQuantos níveis você gostaria de colocar em carisma?")
            this.MelhorarPersonagem(MelhorarCarisma())
            print("Pontos disponíveis: ${this.pontos}\n")
        }

        Interação1()
        Interação2()
        Interação3()
        Interação4()

    }
}

