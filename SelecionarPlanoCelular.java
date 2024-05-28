import java.util.Scanner;
public class SelecionarPlanoCelular {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println("Selecione o plano de celular que você deseja:");
        System.out.println("1 - Plano Básico (5Gb Youtube)");
        System.out.println("2 - Plano Plus (Adição de WhatsApp e Instagram grátis)");
        System.out.println("3 - Plano Premium (Adição de 100 minutos de ligação)");

        System.out.println("OPÇÃO");

        opcao = scanner.nextInt();

        switch(opcao) {
            case 1: System.out.println("Parabéns! O plano selecionado foi: \n Plano Básico (5GB YouTube)");
               break;
            case 2: System.out.println("Parabéns! O plano selecionado foi: \n Plano Plus (Adição de WhatsApp e Instagram grátis)");
               break;
            case 3: System.out.println("Parabéns! O plano selecionado foi: \n Plano Premium (Adição de 100 minutos de ligação)");
               break;
               default: System.out.println("Opção inválida! Por favor, selecione um plano válido.");
            }

        scanner.close();

    }
}
