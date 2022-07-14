import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) throws Exception {
            try (Scanner leitor = new Scanner(System.in)) {
            int valor =0;
            for (int i=0;i< 6; i++){
                double num=leitor.nextDouble();
                
                    if(num>0) valor ++;

            }
            
            System.out.println(" numeros " + valor);
        }
    }
}
