// 3. Faça um programa em Java que leia 4 notas, mostre as notas e a média na tela

import java.util.Scanner;

public class Questao3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double [] nota = new double[4];
    double soma = 0;

    // ler os numeros
    System.out.println("Digite as 4 notas: ");
        for (int i = 0; i < nota.length; i++){
        System.out.println("Número:" + (i + 1 ) + ":");
        nota[i] = sc.nextDouble();
        soma += nota[i];

}
// para calcular
double media = soma / nota.length;
    System.out.println("A média é de: " + media );

    sc.close();

}



}
