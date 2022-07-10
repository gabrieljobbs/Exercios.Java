import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
             int a=1;
                int b=60;
                    while (b >= 0) {
                
            System.out.println("interador A=" + a + " varB=" +b);
            b-=5;
            a+=3;
            }
            }
    }
}
