
import java.util.Scanner;


public class exercico12 {
    public static void main (String [] args){
    Scanner scan = new Scanner (System.in);
     
    System.out.println("Qual a sua altura");
    float altura = scan.nextFloat();
    double pesoIdeal = (72.7 * altura) - 58;
    System.out.println("O peso ideal é:" + pesoIdeal);
    
    
    }
 }
