import java.util.Scanner;
public class CalcularMediaNotas {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, n4;
        int soma;
        double media;

        System.out.println("Digite a primeira nota: ");
        n1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = scanner.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = scanner.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4 = scanner.nextInt();

        soma = n1 + n2 + n3 + n4;

        media = soma / 3;

        if (media <5) {
            System.out.println("O aluno foi reprovado.");
        } else if (media >=5 && media <7) {
            System.out.println("O aluno terá que fazer o exame de recuperação.");
        } else if (media>=7) {
            System.out.println("O aluno foi aprovado.");
        } scanner.close();
    }
}
    
