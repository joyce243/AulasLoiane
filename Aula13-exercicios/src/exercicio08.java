
import java.util.Scanner;


public class exercicio08 {
    public static void main (String [] args ){
    
        Scanner scan = new Scanner (System.in);
        System.out.println("Quanto voce ganha por hora:");
        Float SalarioHoras = scan.nextFloat();
        System.out.println("Quantas horas trabalhadas:");
        Float HorasTrab = scan.nextFloat();
        float Resultado = SalarioHoras * HorasTrab;
        System.out.println("O seu salario esse mes foi: " + Resultado);
        
    }
    
}
