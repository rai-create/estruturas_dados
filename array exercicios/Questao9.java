//Faça um programa em Java que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
import java.util.Scanner;


public class Questao9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int [] numeros = new int[10];
    int soma = 0;

        //ENTRADA

    System.out.println("\n Digite 10 números inteiros");
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Número:" + (i + 1 ) + ":");
        numeros[i] = sc.nextInt();

         soma += (numeros[i] * numeros[i]) ;                // acumulando e somando

        }
    
        // Saída
        System.out.print("\n Soma do Quadrado dos elementos: " + soma);


        sc.close();
    }
}
