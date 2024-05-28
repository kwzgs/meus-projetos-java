import java.util.Random; // classe responsável por gerar número aleatório
import java.util.Scanner; // classe que lê dados do teclado 
public class AdivinharNumero {
    public static void main (String [] args){
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio, numeroUsuario = 100;
        numeroAleatorio = rd.nextInt(11); // inserindo número aleatório de 0 10

        while (numeroAleatorio!=numeroUsuario){
            System.out.print("Tente acertar o número de 0 a 10: ");
            numeroUsuario = scanner.nextInt();

            if (numeroAleatorio == numeroUsuario) {
                System.out.println("Você acertou!");
            }else{
                System.out.println("Você errou!");
            }
        }

        scanner.close();
    } 
} 
