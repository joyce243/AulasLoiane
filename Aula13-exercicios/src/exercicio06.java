
import java.util.Scanner;

public class exercicio06 {
    public static void main (String [] args){
        
        Scanner scan =  new Scanner (System.in); 
        System.out.println("Digite o raio do circulo:");
        Double raio = scan.nextDouble();
        double  area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo é:" + area);
    }
}
