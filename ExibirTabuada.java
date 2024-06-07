import java.util.Scanner;
public class ExibirTabuada {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num; 

        System.out.print("Digite um número para calcularmos a tabuada: ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        scanner.close();
    }
}

