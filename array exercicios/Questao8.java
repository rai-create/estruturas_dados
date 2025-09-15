//. Faça um programa em Java que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
// Imprima a idade e a altura na ordem inversa a ordem lida.

import java.util.Scanner;


public class Questao8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []idade = new int[5];
        double[] altura = new double [5];
    
        for (int p = 0; p < idade.length; p++) {
        System.out.print("\nDigite a idade da pessoa " + (p + 1) + ": ");
            idade[p] = sc.nextInt();

            System.out.println("\nDigite a altura da pessoa: " );
            altura[p] = sc.nextDouble();
        }

        System.out.println("\n Dados invertidos: ");
        for (int p = idade.length -  1; p >= 0; p-- ){

System.out.println("Pessoa " + (p + 1) + " -> Idade: " + idade[p] + " anos, Altura: " + altura[p] + " m");
sc.close();

        }

    }
}
