import java.util.Scanner;

public class Questao1 {
public static void main(String[] args) {


    int [] Numeros = new int[5];
    Scanner sc = new Scanner(System.in);
    
    
    // para ler os numeros

    System.out.println("Digite 5 numeros inteiro");
    for (int i = 0; i < Numeros.length; i++){
        System.out.println("Número:" + (i + 1 ) + ":");
        Numeros[i] = sc.nextInt();

}

// para imprimir os numeros
System.out.println(" Você digitou os números: ");
for (int i = 0 ; i < Numeros.length; i++){

    System.out.println("posição: " + i + " -> " + Numeros[i] );
}

sc.close();
}
}
