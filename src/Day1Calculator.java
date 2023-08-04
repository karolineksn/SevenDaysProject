import java.util.Scanner;

public class Day1Calculator {
    public static void main(String[] args) {

        Scanner valor1Scanner = new Scanner(System.in); //entrada de valores
    //  Classe  nomeDaClasse  é = uma nova Classe (aqui vai o parâmetro/argumento, que no caso é o in)
        System.out.print("Digite o valor 1: ");
        int valor1 = valor1Scanner.nextInt(); //armazena o valor digitado
    //aqui eu pego o dado que vem do Scanner valor1Scanner do tipo int e guardo na variável, que é a valor1

        Scanner valor2Scanner = new Scanner(System.in);
        System.out.print("Digite o valor 2: ");
        int valor2 = valor2Scanner.nextInt();

        System.out.print("A soma dos valores é igual a: " + (valor1 + valor2));



    }
}
