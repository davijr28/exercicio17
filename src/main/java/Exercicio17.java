
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        char profissao;
        System.out.println("Informe a profissão de Tibúrcio:\n [e] - Engenheiro\n [m] - Médico\n [d] - Designer\n [p] - Programador\n [a] - Advogado");
        profissao = leitor.next().charAt(0);
        switch (profissao) {
            case 'e':
                System.out.println("Tibúrcio é engenheiro");
                break;
            case 'm':
                System.out.println("Tibúrcio é médico");
                break;
            case 'd':
                System.out.println("Tibúrcio é designer");
                break;
            case 'p':
                System.out.println("Tibúrcio é programador");
                break;
            case 'a':
                System.out.println("Tibúrcio é advogado");
                break;  
            default:
                System.out.println("Tibúrcio está DESEMPREGADO!");
                break;

        }
    }
}
