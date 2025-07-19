
import java.util.Scanner;


public class exercicio03 {
public static void main (String [] args ){
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Entre com o genero:");
    String input = scan.toString();
        
    if (input.equalsIgnoreCase  ("M")){
        System.out.println("Genero Masculino");
    }else if (input.equalsIgnoreCase("F")){
        System.out.println("Genero Feminino");
    }else 
        System.out.println("Genero invalido");
    
    }
}    
