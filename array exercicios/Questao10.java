//Faça um programa em Java que leia dois vetores com 10 elementos cada. 
//Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos
//intercalados dos dois outros vetores.

import  java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor1 = new int[10];
        int [] vetor2 = new int[10];
        int [] vetor3 = new int[20];

        // entrada de dados vetor 1

        System.out.println("\n Digite 10 valores para armazenar no primeiro vetor");
        for(int i = 0; i < vetor1.length; i++){
            System.out.println("\n Número:" + (i + 1 ) +":");
            vetor1[i] = sc.nextInt();
            
        }

        // entrada de dados vetor 2
        System.out.println("\n Digite 10 valores para armazenar no segundo vetor");
        for(int i= 0; i < vetor2.length; i++){
            System.out.println("\n Número:" + (i + 1 ) +":");
            vetor2[i] = sc.nextInt();
    }

// processamento dos dados

for( int i = 0; i<10 ; i++){
    vetor3 [i*2] = vetor1[i];       // espaços pares no vetor 3 recebem o vetor 1
    vetor3 [i*2 + 1] = vetor2[i];   // espaços impares no vetor 3 recebem o vetor 2
}

System.out.println("\nVetor 3 intercalando o vetor 1 e 2: ");
for (int i = 0; i< vetor3.length; i++){
System.out.println(vetor3[i] + " ");

}

sc.close();


}

}

