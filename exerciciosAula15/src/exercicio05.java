
import java.util.Scanner;


public class exercicio05 {
public static void main (String [] args ){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre com a primeira nota:");
    float nota1 = scan.nextFloat();
    
    System.out.println("Entre com a segunda nota ");
    float nota2 = scan.nextFloat();
    
   float media  = nota1 + nota2  / 2;
 
   if (media < 7 ){
       System.out.println("Aluno reprovado media:" + media );
   }else if (media >=7 ){
       System.out.println("Aluno aprovado media:" + media);
   } else if (media == 10 ){
       System.out.println("Aluno aprovado por Distinção media:" + media);
   }
    
    
}    
}
