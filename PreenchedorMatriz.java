import java.security.SecureRandom; 
public class PreenchedorMatriz {
    public static void main (String [] args){

    SecureRandom rd = new SecureRandom();

    int[][] aleatorios = new int[5][5];

    for (int linha = 0; linha < 5; linha++) {
        for (int coluna = 0; coluna < 5; coluna++){
            aleatorios[linha][coluna] = rd.nextInt(100);
        }
    } 

    for (int linha = 0; linha < 5; linha ++) {
        for (int coluna = 0; coluna < 5; coluna++){
            System.out.println(aleatorios[linha][coluna] + "-");
        }
    }
    System.out.print("\n");
    }
}