package JogoFute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroJogadores {
	private List<Jogador> jogadores;
	
	public CadastroJogadores() {
		jogadores = new ArrayList<>();
	}

	
	public void cadastrarJogador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do jogador:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a posição do jogador:");
        String posicao = scanner.nextLine();
        
        System.out.println("Digite numero camisa jogador: ");
        int numeroCamisa = scanner.nextInt();
        
        System.out.println("Digite total de gol feitos: ");
        int golFeitos = scanner.nextInt();

        Jogador jogador = new Jogador(nome, idade, posicao, numeroCamisa, golFeitos);
        jogadores.add(jogador);

        System.out.println("Jogador cadastrado com sucesso!");
    }
	
	public void exibirJogadores() {
		System.out.println("Lista de jogadores: ");
		
		for(Jogador jogador : jogadores) {
			System.out.println("Nome: " +  jogador.getNome());
			System.out.println("Idade: " + jogador.getIdade());
			System.out.println("Posição: " + jogador.getPosicao());
			System.out.println("Numero camisa: " + jogador.getNumeroCamisa());
			System.out.println("Gol feitos: " + jogador.getGolFeitos());
			System.out.println("-------------------------------------------");
			
		}
			
	}
	 public void deletarJogador() {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite o nome do jogador qual deseja deletar: ");
		 String nome = scanner.nextLine();
		 		
		 Jogador jogadorEncontrado = null;
				 
		 for(Jogador jogador : jogadores) {
			 if(jogador.getNome().equalsIgnoreCase(nome)) {
				 jogadorEncontrado = jogador;
				 break;
			 }
		 }
		 
		 if (jogadorEncontrado != null) {
			 jogadores.remove(jogadorEncontrado);
			 System.out.println("Jogador removido com sucesso");
		 }else {
			 System.out.println("Jogador não");
	 } 
		 
		 
		 
		 
	 }
	 
	 
}


