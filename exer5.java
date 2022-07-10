import java.util.Scanner;

public class exer5  {
    public static void main(String[] args) throws Exception {
        try (Scanner entradaUsuario = new Scanner(System.in)){
            System.out.println("Coloque alguma quantia :");
            int quantia = entradaUsuario.nextInt();
            
            int nota1= 0;
            int nota2 = 0;
            int nota5= 0;
            int nota10 = 0;
            int nota20 = 0;
            int nota50 = 0;
            int nota100 = 0;
           
            
           
            
           
            
            
                while(quantia > 0){
                    if(quantia >= 100)
                    {
                        nota100++;
                        quantia -= 100;
                    }
                    else if(quantia >= 50)
                    {
                        nota50++;
                        quantia -= 50;
                    }
                    else if(quantia >= 20)
                    {
                        nota20++;
                        quantia -= 20;
                    }
                    else if(quantia >= 10)
                    {
                        nota10++;
                        quantia -= 10;
                    }
                    else if(quantia >= 5)
                    {
                        nota5++;
                        quantia -= 5;
                    }
                    else if(quantia >= 2)
                    {
                        nota2++;
                        quantia -= 2;
                    }
                    else if(quantia >= 1)
                    {
                        nota1++;
                        quantia -= 1;
                    }
                }
                
                System.out.println(nota100 + " nota de R$ 100,00");
                System.out.println(nota50 + " nota de R$ 50,00");
                System.out.println(nota20 + " nota de R$ 20,00");
                System.out.println(nota10 + " nota de R$ 10,00");
                System.out.println(nota5 + " nota de R$ 5,00");
                System.out.println(nota2 + " nota de R$ 2,00");
                System.out.println(nota1 + " nota de R$ 1,00");

            }
        }
    }
