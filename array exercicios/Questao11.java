//  Altere o programa anterior (qeustao 10), intercalando 3 vetores de 10 elementos cada.
import  java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor1 = new int[10];
        int [] vetor2 = new int[10];
        int [] vetor3 = new int[10];
        int [] vetor4 = new int[30];

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
    // entrada de dados vetor 3
    System.out.println("\n Digite 10 valores para armazenar no terceiro vetor");
        for(int i= 0; i < vetor3.length; i++){
            System.out.println("\n Número:" + (i + 1 ) +":");
            vetor3[i] = sc.nextInt();
    }


// processamento dos dados

for( int i = 0; i<10 ; i++){
    vetor4 [i*3] = vetor1[i];               // combinando os tres vetores
    vetor4 [i*3 + 1] = vetor2[i];
    vetor4 [i*3 + 2] = vetor3[i];
}

//saída

System.out.println("\nVetor 4 intercalando o vetor 1,2 e 3: ");
for (int i = 0; i< vetor4.length; i++){
System.out.println(vetor4[i] + " ");

}

sc.close();


}

}

