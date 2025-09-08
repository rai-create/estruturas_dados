// ler 20 numeros int em um  vetor impares em outro, pares em outro e imprimir os 3
import java.util.Scanner;


public class Questao5 {
    public static void main(String[] args) {
        int [] Numeros = new int[20];
        int [] impares = new int[20];
        int [] pares = new int[20];
        int qntPares = 0;
        int qntImpares = 0;


        
// ENTRADA DE 20 NUMEROS

Scanner sc = new Scanner (System.in);
System.out.println("Digite 20 inteiros ");

for (int i = 0; i < Numeros.length; i++){
    System.out.println("Número:" + (i + 1 ) + ":");
        Numeros[i] = sc.nextInt();
        
if (Numeros[i]% 2==0){
    pares[qntPares] = Numeros[i];
qntPares ++;

} else {

    impares[qntImpares] = Numeros[i];
    qntImpares ++;
}
}
// imprimir
System.out.println("Estes são os 20 números digitados");
for (int i = 0; i < 20; i++) {
    System.out.println(Numeros[i]+"");

}

System.out.println(" Números pares" + qntPares);
for(int i = 0 ; i < qntPares; i++){
System.out.println(pares[i] + "");

}
System.out.println("Números impares" + qntImpares);
for( int i = 0; i < qntImpares ; i++){
    System.out.println(impares[i] + "");
}

sc.close();







}

}