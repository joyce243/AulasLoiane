
import java.util.Scanner;


public class exercicio07 {
    public static void main (String []args){
        Scanner scan =  new Scanner (System.in);
    System.out.println("Entre com o primeiro valor:");
    float valor1 = scan.nextFloat();
    System.out.println("Entre com o segundo valor:");
    float valor2 = scan.nextFloat();
    System.out.println("Entre com o terceiro valor:");
    float valor3 = scan.nextFloat();
    
    if (valor1 < valor2 && valor1 < valor3){
        System.out.println("O primeiro valor é menor  compre esse :");
    }else if (valor2 < valor1 && valor2 < valor3){
        System.out.println(" O segundo valor é menor compre esse :");
    }else if (valor3 < valor1 && valor3 < valor2){
        System.out.println("O terceiro valor é menor compre esse:");
    }
}
}
    
    }
    
}
