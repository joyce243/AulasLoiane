
import java.util.Scanner;


public class exercicio05 {
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o valor em metros:");
        float  metros  = scan.nextFloat();
        float cent = metros * 100; 
        System.out.println("O valor em centrimentos é:" + cent);
        
        
    }
    
}
