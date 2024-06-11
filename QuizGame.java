import java.util.Scanner;
public class QuizGame {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeUsuario;
        int opcaoUsuario, posicao=0, limiteRespostas=0, pontuacao=0;

        //vetor contendo as respostas corretas das perguntas 
        char[] gabarito = {'C', 'B', 'A', 'B', 'C', 'A', 'D', 'C', 'D', 'C'}; 
          
        //vetor contendo as respostas que o usuário enviar
        char[] respostas = new char[10];
        
        //vetor de perguntas - já preenchido 
        String[] perguntas = {
            "QUIZ 1. Qual é a capital do Brasil?\nA) São Paulo\nB) Rio de Janeiro\nC) Brasília\nD) Salvador",
            "QUIZ 2. Qual é o maior planeta do sistema solar?\nA) Terra\nB) Júpiter\nC) Saturno\nD) Marte",
            "QUIZ 3. Quem escreveu 'Dom Casmurro'?\nA) Machado de Assis\nB) José de Alencar\nC) Clarice Lispector\nD) Graciliano Ramos",
            "QUIZ 4. Qual é o elemento químico representado pelo símbolo 'O'?\nA) Ouro\nB) Oxigênio\nC) Osso\nD) Ósmio",
            "QUIZ 5. Em que ano o homem pisou na Lua pela primeira vez?\nA) 1959\nB) 1965\nC) 1969\nD) 1971",
            "QUIZ 6. Qual é o animal mais rápido do mundo?\nA) Guepardo\nB) Leopardo\nC) Cavalo\nD) Águia",
            "QUIZ 7. Qual é o maior oceano da Terra?\nA) Atlântico\nB) Índico\nC) Ártico\nD) Pacífico",
            "QUIZ 8. Qual é a língua mais falada no mundo?\nA) Espanhol\nB) Inglês\nC) Mandarim\nD) Hindi",
            "QUIZ 9. Qual é o país mais populoso do mundo?\nA) Índia\nB) Estados Unidos\nC) Indonésia\nD) China",
            "QUIZ 10. Quem pintou a Mona Lisa?\nA) Vincent van Gogh\nB) Pablo Picasso\nC) Leonardo da Vinci\nD) Michelangelo"
        };

        System.out.println("CARREGANDO O QUIZ GAME >>>>>");
        System.out.print("Digite o seu nome: ");
        nomeUsuario=scanner.nextLine();

        System.out.println("-------------------------------");
        System.out.println("***** BEM VINDO AO QUIZ GAME - " + nomeUsuario + "*****");
        System.out.println(">>>>> DICA: Utilize letra maiúscula em cada resposta das perguntas.");
        System.out.println("Deseja jogar?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        System.out.print("Digite uma opção: ");
        opcaoUsuario = scanner.nextInt();

        while(opcaoUsuario == 1 ) {
            System.out.println("-------------------------------");
            System.out.println(perguntas[posicao]);
            System.out.println("Sua resposta é: ");
            respostas[posicao] = scanner.next().charAt(index:0);
            posicao++; //pulando para a próxima posição do vetor
            limiteRespostas++; //garantindo o limite de 10 respostas do usuário

        }

        if (opcaoUsuario == 2) {
            System.out.println("-------------------------------");
            System.out.println("Saindo do QUIZ GAME em 3...2...1... - Até a próxima!");
        }
        

    }
}
