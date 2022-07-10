   import java.util.Scanner;
   public class exer2 {

    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int num1 =leitor.nextInt();
            int num2 =leitor.nextInt();
            int produto =num1*num2;
            System.out.println("Produto:"+produto);
        }


    }
}

    

