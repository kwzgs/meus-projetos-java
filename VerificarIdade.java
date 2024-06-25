import java.util.Scanner;
public class VerificarIdade {
    public static void main (String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade:");
        idade = scanner.nextInt();

        if(idade <=12){
            System.out.println("Você ainda é uma criança!");
        } else if (idade >=13 && idade <=17) {
            System.out.println("Você é um(a) adolescente!");
        } else if (idade >=18) {
            System.out.println("Você já é um(a) adulto(a)!");
        }
        
        scanner.close();
    
    }
}
