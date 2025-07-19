
import java.util.Scanner;


public class exercicio09 {
    public static void main (String [] args ){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual a temperatura em ºFahrenheit");
        double F = scan.nextFloat();
        double C = 32 * 5/9;
        
        System.out.println("A temperatura " + F + "F é igual a" + C + "C");
    }
}
