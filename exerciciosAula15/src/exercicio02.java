
import java.util.Scanner;


public class exercicio02 {
public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("entre com um numero: ");
    int numero = scan.nextInt();
    
    if (numero < 0){
        System.out.println("Numero negativo");
    }else if  (numero > 0){
    System.out.println("Numero positivo");
    }
} 
    
}    

