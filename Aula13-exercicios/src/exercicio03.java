
import java.util.Scanner;


public class exercicio03 {
    public static void  main (String [] args) { 
    
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o primeiro numero");
        int  numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int  numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("O numero informado foi:" + resultado);
        

    }
}
