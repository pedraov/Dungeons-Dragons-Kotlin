import Personagem.Personagem
import Personagem.Classes.*
import Personagem.Melhora.*
import Personagem.Raças.*


fun main() {
    // Interações para criação do personagem
    val p : Personagem = Personagem()

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

        p.nome = nome

        print("\nMuito prazer ${p.nome}, eu sou seu mestre e irei te guiar na criação do seu personagem!")
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
                p.raca = "Humano"
                p.BonusRaça(Humano())
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
                            1 -> {p.raca = "Alto Elfo"; p.BonusRaça(ElfoAlto())}
                            2 -> {p.raca = "Elfo da Floresta"; p.BonusRaça(ElfoFloresta())}
                            3 -> {p.raca = "Drow"; p.BonusRaça(ElfoDrow())}
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
                            1 -> {p.raca = "Anão da Colina"; p.BonusRaça(AnãoColina())}
                            2 -> {p.raca = "Anão da Montanha"; p.BonusRaça(AnãoMontanha())}
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
                            1 -> {p.raca = "Halfling Pés-Leves"; p.BonusRaça(HalflingLeve())}
                            2 -> {p.raca = "Halfling Robusto"; p.BonusRaça(HalflingRobusto())}
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
                            1 -> {p.raca = "Gnomo da Floresta"; p.BonusRaça(GnomoFloresta())}
                            2 -> {p.raca = "Gnomo das Rochas"; p.BonusRaça(GnomoRochas())}
                        }
                    } else {
                        print("Por favor, escolha entre as duas raças.")
                        opcao = null
                    }
                }
            }

            6 -> {
                p.raca = "Draconato"
                p.BonusRaça(Draconato())
            }

            7 -> {
                p.raca = "Meio-Elfo"
                p.BonusRaça(MeioElfo())
            }

            8 -> {
                p.raca = "Meio-Orc"
                p.BonusRaça(Orc())
            }

            9 -> {
                p.raca = "Tiefling"
                p.BonusRaça(Tiefling())
            }

        }

        print("\nÓtimo, ${p.nome} o ${p.raca}")

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
                p.EscolherClasse(Barbaro())
            }

            2 -> {
                p.EscolherClasse(Bardo())
            }

            3 -> {
                p.EscolherClasse(Bruxo())
            }

            4 -> {
                p.EscolherClasse(Clérigo())
            }

            5 -> {
                p.EscolherClasse(Druida())
            }

            6 -> {
                p.EscolherClasse(Feiticeiro())
            }
            7 ->{
                p.EscolherClasse(Guardião())
            }
            8 ->{
                p.EscolherClasse(Guerreiro())
            }
            9 ->{
                p.EscolherClasse(Ladino())
            }
            10 ->{
                p.EscolherClasse(Mago())
            }
            11 ->{
                p.EscolherClasse(Monge())
            }
        }
    }

    fun Interação4() {
        //Interação 4 - Melhora do personagem
        print(
            "\nBom ${p.nome}, está na hora de melhorar as habilidades do seu personagem\n" +
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
        p.MelhorarPersonagem(MelhorarForca())
        print("Pontos disponíveis: ${p.pontos}\n")

        //Melhora de destreza
        print("\nQuantos níveis você gostaria de colocar em destreza?")
        p.MelhorarPersonagem(MelhorarDestreza())
        print("Pontos disponíveis: ${p.pontos}\n")

        //Melhora de inteligência
        print("\nQuantos níveis você gostaria de colocar em inteligência?")
        p.MelhorarPersonagem(MelhorarInteligencia())
        print("Pontos disponíveis: ${p.pontos}\n")

        //Melhora de constituição
        print("\nQuantos níveis você gostaria de colocar em Constituição?")
        p.MelhorarPersonagem(MelhorarConstituicao())
        print("Pontos disponíveis: ${p.pontos}\n")

        //Melhora de sabedoria
        print("\nQuantos níveis você gostaria de colocar em sabedoria?")
        p.MelhorarPersonagem(MelhorarSabedoria())
        print("Pontos disponíveis: ${p.pontos}\n")

        //Melhora de carisma
        print("\nQuantos níveis você gostaria de colocar em carisma?")
        p.MelhorarPersonagem(MelhorarCarisma())
        print("Pontos disponíveis: ${p.pontos}\n")
    }

    Interação1()
    Interação2()
    Interação3()
    Interação4()
    p.CalcularPV()
    p.MostrarPersonagem()
}

