
import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int a=leitor.nextInt();
            int b=leitor.nextInt();
            if (b==0) System.out.println("Invalida divisão com 0"); 
               
            else System.out.println((double) a/ b);
            }
            
    
    
    }


}
