package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Exercicios {
    public static Double execSoma(double num1, double num2) {
        double soma;

        soma = num1 + num2;

        return soma;
    }

    public static String execImpaPar(double num) {
        String par = "Par";
        String impar = "Ímpar";

        if (num % 2 == 0) {
            return par;
        } else {
            return impar;
        }
    }

    public static String execCalc(String operador, double num1, double num2) {
        Scanner inputCalc = new Scanner(System.in);
        String resutaldoFinal;


        return switch (operador) {

            case "+" -> {
                double soma = num1 + num2;
                resutaldoFinal = num1 + " + " + num2 + " = " + soma;
                yield resutaldoFinal;
            }
            case "-" -> {
                double menos = num1 - num2;
                resutaldoFinal = num1 + " - " + num2 + " = " + menos;
                yield resutaldoFinal;
            }
            case "/" -> {
                if (num1 == 0 || num2 == 0) {
                    yield resutaldoFinal = "Não é possível dividir por 0!";
                }
                double div = num1 / num2;
                resutaldoFinal = num1 + " / " + num2 + " = " + div;
                yield resutaldoFinal;
            }
            case "*" -> {
                double multi = num1 * num2;
                resutaldoFinal = num1 + " * " + num2 + " = " + multi;
                yield resutaldoFinal;
            }
            default -> {
                resutaldoFinal = "Operação inválida!";
                yield resutaldoFinal;
            }
        };


    }

    public static String execFat(int numFat) {
        String numOriginal = Integer.toString(numFat), resultadoFinal;
        long resultado;

        if (numFat < 0) {
            return resultadoFinal = "Não é possível fatorar número negativos!";
        } else if (numFat == 0 || numFat == 1) {
            return Integer.toString(1);
        }

        resultado = 1;
        for (long i = 2; i <= numFat; i++) {
            resultado *= i;
        }
        resultadoFinal = Long.toString(resultado);

        return resultadoFinal = "O fatorial de " + numOriginal + " é " + resultadoFinal;

    }

    public static void execContReg(int numContReg) {
        if (numContReg == 1) {
            System.out.println("Não é possível fazer uma contagem regressiva a partir do número 1!");
        } else {
            int i = 1;
            numContReg--;
            while (i <= numContReg) {
                System.out.println(numContReg--);
            }
        }
    }

    public static void execMedia(int serie) {
        Scanner inputmed = new Scanner(System.in);
        int contagem = 0;
        double numMedia;
        double media = 0;
        if (serie < 2) {
            System.out.print("Escolha pelo menos 2 valores/números!");
        }
        while (contagem < serie) {
            System.out.println("Digite o número que deseja adicionar ao calcúlo da média");
            numMedia = inputmed.nextDouble();
            media += numMedia;
            ++contagem;
        }

        System.out.println(media + " / " + contagem);
        media = media / contagem;
        System.out.printf("O resultado da média é %.2f%n", media);

    }

    public static List<String> execTab(int numTab) {
        List<String> tab = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tab.add(numTab + " x " + i + " = " + numTab * i);
        }
        return tab;
    }

    public static String execPali(String pali) {
        String paliOrginal = pali;
        String paliDoubt;
        if (pali.contains(" ")) {
            pali = pali.replace(" ", "");
        }
        pali = pali.toLowerCase();
        String revString = "";
        for (int i = 0; i < pali.length(); i++) {
            revString = pali.charAt(i) + revString;
        }
        if (pali.equals(revString)) {
            paliDoubt = "A palavra: " + paliOrginal + " é um palíndromo";
        } else {
            paliDoubt = "A palavra: " + paliOrginal + " não é um palíndromo";
        }

        return paliDoubt;
    }


    public static Double execTemp(double numTemp, int con) {
        double formulaC, formulaF, resultado;
        // Caso queira retornar uma String já formatada para imprimir no console.
        //String resultadoFinal;
        resultado = 0;
        // Temperatura em grau Fahrenheit (°F) = (Temperatura em grau Celsius (°C) * 9/5) + 32
        formulaF = (numTemp * ((double) 9 / 5) + 32);
        // Temperatura em grau Celsius (°C) = (Temperatura em grau Fahrenheit (°F) - 32) * 5/9
        formulaC = (numTemp - 32) * 5 / 9;
        if (con == 1) {
            resultado = formulaF;
            //resultadoFinal = "O resultado da conversão de °C para °F: " + resultado + "°F";
        } else if (con == 2) {
            resultado = formulaC;
            //resultadoFinal = "O resultado da conversão de °F para °C: " + resultado + "°C";
        }

        return resultado;
    }

    public static void execJogo(int chute) {
        Scanner inputChute = new Scanner(System.in);
        int contagem = 0;
        int opcao;
        Random Ale = new Random();
        int dif;
        int numAle;
        while (true) {
            numAle = Ale.nextInt(101);
            if (numAle != 0) break;
        }

        while (numAle != chute) {
            dif = (numAle - chute);
            dif = Math.abs(dif);
            // System.out.println(dif);
            ++contagem;
            if (dif > 50) {
                System.out.println("Muito longe! Você está a mais de 50 números do número correto! Tente novamente");
            } else if (dif < 50 && dif >= 25) {
                System.out.println("Humm... tente novamente! Você está a mais de 25 números do número correto");
            } else if (dif < 25 && dif >= 10) {
                System.out.println("Falta pouco! Você está a menos de 25 números do número correto");
            } else if (dif < 10) {
                System.out.println("Quase lá! Você está a menos de 10 números do número correto");
            }
            System.out.println("Dá um novo chute?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            System.out.print("Opção: ");
            opcao = inputChute.nextInt();
            System.out.println();
            if (opcao == 1) {
                System.out.print("Número: ");
                chute = inputChute.nextInt();
                System.out.println();

            } else if (opcao == 2) {
                System.out.printf("Número correto: %d%n", numAle);
                System.out.printf("Muito obrigado por jogar! Número de tentativas: %d%n", contagem);
                break;
            }
        }
        if (chute == numAle) {
            System.out.printf("Boa! Vocè acertou em %d tentativas!%n", contagem);
        }


    }

    public static void main(String[] args) {

    }
}
