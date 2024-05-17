import java.util.Scanner; 
public class Fatorial{
    public static void main(String[] args) {
        int numero=0, fat=1;

        // chama a classe Scanner pra dentro do programa
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: 3");
        numero = scanner.nextInt();

        // fazer o loop pra multiplicar os valores do fatorial
        for (int i = numero; i == 1; i-- ){
            fat = fat * i; 
        }

        System.out.print("O fatorial de " + numero + " é " + fat);

        scanner.close();
    }
}