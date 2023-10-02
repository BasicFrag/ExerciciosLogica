package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolhaMenu = 1;
        while (escolhaMenu == 1) {




            System.out.println("Bem-vindo! Escolha a sua opção:");
            System.out.println("Opção 1: Soma");
            System.out.println("Opção 2: Ímpar ou Par");
            System.out.println("Opção 3: Calculadora Simples");
            System.out.println("Opção 4: Fatorial");
            System.out.println("Opção 5: Contagem Regressiva");
            System.out.println("Opção 6: Média de Números");
            System.out.println("Opção 7: Tabuada");
            System.out.println("Opção 8: Palíndromos");
            System.out.println("Opção 9: Conversor de Temperatura");
            System.out.println("Opção 10: Advinhação de Números\n");

            System.out.print("Opção: ");
            int opcao = input.nextInt();
            System.out.println();
            System.out.printf("Opção %d escolhida\n", opcao);
            switch (opcao) {
                case 1:
                    double x, y;
                    System.out.print("Bem-vindo! Digite o primeiro número para inicar a soma: ");
                    x = input.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    y = input.nextDouble();

                    Double soma = Exercicios.execSoma(x, y);


                    System.out.printf("O resultado da soma: %.2f%n", soma);
                    break;
                case 2:
                    int num;
                    System.out.println("Bem-vindo! Digite o número que quer verificar se é par ou ímpar:");
                    System.out.print("Número: ");
                    num = input.nextInt();
                    System.out.printf("O número %d é %s%n", num, Exercicios.execImpaPar(num));
                    break;
                case 3:
                    double numCalc1, numCalc2, resultado;
                    int operador;


                    System.out.println("Bem-vindo! Para iniciar a calculadora é necessário que digite os números e operação desejada.");
                    System.out.print("Digite o primeiro número: ");
                    numCalc1 = input.nextDouble();
                    System.out.println();
                    System.out.print("Digite o segundo número: ");
                    numCalc2 = input.nextDouble();
                    System.out.println();
                    System.out.println("Escolha a operação desejada");
                    System.out.println("1. Adição");
                    System.out.println("2. Subtração");
                    System.out.println("3. Multiplicação");
                    System.out.println("4. Divisão");
                    operador = input.nextInt();
                    System.out.println("Opção: " + operador);
                    if (operador == 1) {
                        System.out.println(Exercicios.execCalc("+", numCalc1, numCalc2));
                        break;
                    } else if (operador == 2) {
                        System.out.println(Exercicios.execCalc("-", numCalc1, numCalc2));
                        break;
                    } else if (operador == 3) {
                        System.out.println(Exercicios.execCalc("*", numCalc1, numCalc2));
                        break;
                    } else if (operador == 4) {
                        System.out.println(Exercicios.execCalc("/", numCalc1, numCalc2));
                        break;
                    } else {
                        System.out.println("Opção inválida");
                        break;
                    }
                case 4:
                    int numFat;
                    System.out.println("Bem-vindo! Digite o número que deseja saber o fatorial ");
                    numFat = input.nextInt();
                    System.out.println(Exercicios.execFat(numFat));
                    break;
                case 5:
                    System.out.println("Bem-vindo! Digite o número que deseja fazer a contagem regressiva");
                    Exercicios.execContReg(input.nextInt());
                    break;
                case 6:
                    System.out.println("Bem-vindo! Digite quantos valores gostaria de calcular a média");
                    int numSerie = input.nextInt();
                    Exercicios.execMedia(numSerie);
                    break;
                case 7:
                    int numTab;
                    System.out.println("Bem-vindo! Digite o número que deseja saber a tabuada");
                    System.out.printf("Número: %d%n",numTab = input.nextInt());
                    System.out.println(Exercicios.execTab(numTab));
                    break;
                case 8:
                    System.out.println("Bem-vindo! Digite a palavra que deseja deseja saber se é um palíndromo");
                    String pali = input.next();
                    System.out.println(Exercicios.execPali(pali));
                    break;
                case 9:
                    System.out.println("Bem-vindo! Digite que tipo de conversão gostaria de realizar");
                    System.out.println("1. Temperatura em grau °C para Temperatura em grau °F");
                    System.out.println("2. Temperatura em grau °F para Temperatura em grau °C");
                    int con = input.nextInt();
                    System.out.printf("Opção %d escolhida!%n",con);
                    if (con == 1){
                        System.out.println("Temperatura em grau °C para Temperatura em grau °F");
                        System.out.println("Digite a temperatura");
                        double numTemp = input.nextDouble();
                        System.out.printf("O resultado da conversão de °C para °F: %.1f%n",Exercicios.execTemp(numTemp,con));
                        break;
                    }else if (con == 2) {
                        System.out.println("Temperatura em grau °F para Temperatura em grau °C");
                        System.out.println("Digite a temperatura");
                        double numTemp = input.nextDouble();
                        System.out.printf("O resultado da conversão de °F para °C: %.1f%n",Exercicios.execTemp(numTemp,con));
                        break;
                    }else {
                        System.out.print("Opção inválida!");
                        break;
                    }

                case 10:
                    System.out.println("Bem-vindo! Gostaria de inicar o jogo de advinhação?");
                    System.out.println("1. Sim");
                    System.out.println("2. Não");
                    System.out.print("Opção ");
                    int escolhaJogo = input.nextInt();
                    System.out.printf("Opção: %d escolhida %n", escolhaJogo);

                    if (escolhaJogo == 1){
                        int chute;
                        System.out.print("Número: ");
                        chute = input.nextInt();
                        Exercicios.execJogo(chute);
                        break;
                    }else if (escolhaJogo == 2) {
                        System.out.println("Áte mais!");
                        break;
                    }
                default:

                    System.out.println("Opção inválida!");
                    break;

            }
            System.out.println("Gostaria de voltar ao menu principal e tentar novamente?");
            System.out.println("Digite 1 para Sim");
            System.out.println("Digite 2 para Não");
            escolhaMenu = input.nextInt();

        }
        input.close();

    }


}