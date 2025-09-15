//Faça um programa em Java que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
// tendo a idade e altura de 30 alunos
import java.util.Scanner;

public class Questao12 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double somaAlturas = 0;
    int[] idade = new int[30];
    double[] altura = new double[30];

// leitura

for( int i = 0; i< idade.length; i++){
System.out.println("\n Digite a idade da pessoa: " + (i + 1) + ": ");
idade[i]  += sc.nextInt();

System.out.println("Digite a altura da pessoa  * em metros * : " + (i + 1) + ": ");
altura[i]= sc.nextDouble();


somaAlturas += altura[i];
}
// processamento
double media = somaAlturas/30;

int contador =0;
for (int i = 0; i < 10; i++) {
    if (idade[i] > 13 && altura[i] < media){
contador ++;
    }
}

System.out.println( "\n Alunos com mais de 13 anos e abaixo da média de altura:" + contador);

}

















}
