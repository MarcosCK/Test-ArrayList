package JogoFute;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CadastroJogadores cadastro = new CadastroJogadores();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
		    System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar jogador");
            System.out.println("2 - Exibir jogadores");
            System.out.println("3 - Deletar jogador");
            System.out.println("0 - Sair");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
            case 1:
                cadastro.cadastrarJogador();
                break;
            case 2:
                cadastro.exibirJogadores();
                break;
            case 3:
                cadastro.deletarJogador();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
            }
            
		
		
	     }while (opcao !=0);

}
}