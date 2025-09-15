// 4. Faça um programa em Java que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
import java.util.Scanner;

public class Questao4{
public static void main (String[]args){
Scanner sc = new Scanner (System.in);
int consoantes = 0;
char [] caracteres = new char[10];


System.out.println("digite as letras: ");

for ( int i = 0; caracteres.length <=0 ; i ++) {
caracteres[i] = sc.nextLine().charAt(0);
}

System.out.println("Consoantes que foram digitadas: ");
for (int i = 0 ; i < caracteres.length; i++){

char c = Character.toLowerCase(caracteres[i]);

if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(consoantes);
                consoantes++;
            }
    }
sc.close();
}

}



