
import java.util.Scanner;



public class exercicio04 {
    
   public static void main (String [] args ){
       
       Scanner scan = new Scanner (System.in);
       System.out.println("Digite a primeira nota:");
       float nota1 = scan.nextFloat();
       System.out.print("Digite a segunda nota" );
       float nota2 = scan.nextFloat();
       System.out.print("Digite a terceira nota:");
       float nota3 = scan.nextFloat();
       System.out.println("Digite a quarta nota:");
       float nota4 = scan.nextFloat();
       Float media = (nota1 + nota2 + nota3 + nota4)/2;
       System.out.println("A sua Media é " + media );
       
       
   }
    
}
