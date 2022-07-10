import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) throws Exception {
  
        Scanner leitor = new Scanner(System.in);
 
        int tempo =  leitor.nextInt();
        int distancia =  leitor.nextInt();
        
        double media1= tempo*distancia;
        double media2 = media1/12;

        System.out.println(media2);




    }
}  
    

