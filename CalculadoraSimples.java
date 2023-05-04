import java.util.Scanner;

public class CalculadoraSimples{

    public static void main(String[] args) {
        
        //Declaração de Variante 
        int n1, n2, total, op;

        //Criação e intância de objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{

                System.out.println("\n\t\t\t -- Calculadora Simples -- \n");

                System.out.println("1- Soma");
                System.out.println("2- Subtração");
                System.out.println("\n3- Sair");

                System.out.print("\t\t\t Opção:");

                op = entrada.nextInt();

                if(op == 1){
                        System.out.println("\n\t\t\t -- Soma --\n");
                        //Credendio

                        //entrada
                        System.out.print("Informe N1:");
                        n1 = entrada.nextInt();
                        System.out.print("Informe N2");
                        n2 = entrada.nextInt();
                        
                        //processamento
                        total = n1 + n2;

                        //saída
                        System.out.printf("%d + %d + %d", n1, n2, total);
                }

                else if(op == 2){
                    System.out.println("\n\t\t\t -- Subtração --\n");
                }

                else if(op == 3){
                    System.out.println("\n\t\t\t -- Forte Abraço --\n");
                }

                else{
                    System.out.println("\n\n\t\t\t -- Opção "+op+" incorreta --\n");
                }
        }while(op!=3);

    }
}