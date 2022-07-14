import java.util.Scanner;


public class exer4 {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            System.out.println("Coloque os valores para começar a fórmúla:");
            int X = entradaUsuario.nextInt();
            int Y = entradaUsuario.nextInt();
            int Z = entradaUsuario.nextInt();
            
            double delta = Math.sqrt((Y * Y) - (4 * X * Z));
            if(X <= 0 || delta <= 0)
            {
             System.out.println("Digite algum valor valido:");
            }
            else
            {
                double x1 = (-Y + delta)/(2*X);
                double x2 = (-Y- delta)/(2*X);
                 
                System.out.println("Valor de x1 : " + x1 );
                System.out.println("Valor de x2 : " + x2 );
            }
         }


    }
}
