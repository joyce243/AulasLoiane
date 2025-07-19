
import java.util.Scanner;


public class exercicio07 {
    public static void main (String [] args ){
    
     Scanner scan = new Scanner (System.in);
     
     System.out.println("Digite o lado1:");
     int lado1 = scan.nextInt();
     System.out.println("Digite o lado2:");
     int lado2 = scan.nextInt();
     int area = lado1 * lado2;
     System.out.println("A sua area é:" + area );
     System.out.println("O dobro da area do quadrado é" + area *2  );
    }
 }
