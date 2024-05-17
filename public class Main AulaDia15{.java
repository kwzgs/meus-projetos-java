public class AulaDia15 {
	public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n1, n2; 

    System.out.println("Digite o primeiro número inteiro:");
    n1 = scanner.nextInt();

    System.out.println("Digite o segundo número inteiro:");
    n2 = scanner.nextInt();

    System.out.print("RESULTADOS:");
    System.out.println("A soma dos números é:" + (n1 + n2));
    System.out.println("A subtração dos números é:" + (n1 - n2));
    System.out.println("A multiplicação dos números é:" + (n1 * n2));
    System.out.println("A divisão dos números é:" + (n1 / n2));

    scanner.close();

    }
}



