//ler 5 numeros int , impirmir soma, mult e os numeros



import java.util.Scanner;


public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] Numero = new int[5];
        int soma = 0;
        int mult = 1;


        // entrada de dados

        System.out.println("Digite 5 números: ");
        for(int i = 0 ; i < Numero.length; i++){
            System.out.println("Número:" + (i + 1 ) + ":");
            Numero[i] = sc.nextInt();

            soma+= Numero[i];
            mult *= Numero[i];
        }

        // saída
    
        System.out.println("\n\nSoma dos números =" +   soma);
        System.out.println("\n\nMultiplicação dos números = " +   mult);


        sc.close();

    }
}
