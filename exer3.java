 import java.util.Scanner;
 public class exer3 {


    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            String name=leitor.next();
            double valor_das_vendas =leitor.nextDouble();
            double comissao =15;
            double porcentagem =(valor_das_vendas*comissao)/100;
            double total= porcentagem+valor_das_vendas;
            
            System.out.println("Valor total:"+total);
        }


    }
}