
import java.util.Scanner;


public class exercicios11 {
 public static void main (String [] args ){
     Scanner scan = new Scanner (System.in);
     
     System.out.println("Digite o primeiro numero inteiro:");
     int numeroInt1 = scan.nextInt();
     System.out.println("Digite o segundo numero inteiro:");
     int numeroInt2 = scan.nextInt();
     System.out.println("Digite o numero real:");
     float numeroReal = scan.nextFloat();
     
   
      float resultado = (numeroInt1 * 2) * (numeroInt2/2);
      System.out.println("o valor da equação é:" + resultado  );
      
      double soma = (numeroInt1 * 3) + numeroReal;
      System.out.println("A soma da o resultado:" + soma);
      
      double cubo = numeroReal * numeroReal* numeroReal;
      System.out.println("O numero real elevado ao cubo é :" + cubo);
      
 }
}