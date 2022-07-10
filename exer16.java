import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)){
            int contar_notas =0;
             double pega_nota=0;
              double nota=0;
             while (nota >= 0) {nota = leitor.nextDouble();
                 if (nota>=0){
                contar_notas++;
                pega_nota=+nota;
                }
            }

                

{               Double media=pega_nota/contar_notas;
                System.out.println("A média sera!"+ media);
                
                
                }

            }
    }
}
