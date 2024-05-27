import java.util.Scanner;
public class CompararNumeros {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        if (num1 == num2){
            System.out.print("Os números são iguais.");
        } else if (num1 < num2) {
            System.out.print("O segundo número é maior que o primeiro.");
        } else if (num1 > num2) {
            System.out.print("O primeiro número é maior que o segundo.");
        } scanner.close();
    }
}