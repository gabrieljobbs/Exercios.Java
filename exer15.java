import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) throws Exception {
                try (Scanner leitor = new Scanner(System.in)) {
                int sua_senha = leitor.nextInt();
            while (sua_senha != 2002) {
            System.out.println("Senha errada,Tente novamante");
            sua_senha = leitor.nextInt();
        }
        System.out.println("Bem-Vindo!");
        }
    }
}
