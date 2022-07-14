import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int x=1;
            int y=60;
              while (y >= 0) {
                
            System.out.println("iterador= " + x + " varY= " + y);
            y-=5;
            x+=3;
            }
            }
    }
}
