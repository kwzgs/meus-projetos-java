import java.util.Scanner;
public class ContagemNumerosPares {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;

        for (i=2; i<=20; i=i+2){
	    	System.out.println(i);
        }

        scanner.close();
    } 
}