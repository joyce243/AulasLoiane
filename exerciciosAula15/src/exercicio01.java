
import java.util.Scanner;


public class exercicio01 {
    public static void main (String []args ){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com o primeiro numero:");
        int numero1 = scan.nextInt();
        System.out.println("Entre como segundo numero:");
        int numero2 = scan.nextInt();
        
        if  (numero1 > numero2){
            System.out.println("O primeiro numero é maior");
        }else if (numero2 > numero1){
            System.out.println("O segundo numero é maior: ");
        }            
     }
}

