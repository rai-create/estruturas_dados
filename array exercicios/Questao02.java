// 2. Faça um programa em Java que leia um vetor de 10 números reais e mostre-os na ordem inversa.


import java.util.Scanner;

public class Questao2 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double [] numero = new double[10];

        System.out.println("Digite 10 números: ");
        for(int i = 0; i< numero.length; i++){

        System.out.println("numero: " + (i + 1)+ ":");
        numero[i] = sc.nextDouble();
        }
System.out.println("numeros digitados: ");
for (int i = numero.length - 1; i >=0; i--){

    System.out.println(numero[i] );
}

sc.close();

}
}
