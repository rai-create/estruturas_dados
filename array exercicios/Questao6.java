// quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno,
// imprima o número de alunos com média maior ou igual a 7.0

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] Notas = new double[10];
        int aprovados = 0;

        for (int i = 0; i < Notas.length; i++) {
            double soma = 0;

            System.out.println("\nDigite as 4 notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                soma += sc.nextDouble();
            }

            Notas[i] = soma / 4;

            if (Notas[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média >= 7.0: " + aprovados);

        sc.close();
    }
}
