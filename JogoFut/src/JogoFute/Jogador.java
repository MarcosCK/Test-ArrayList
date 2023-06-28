package JogoFute;


public class Jogador {

	private String nome;
	private int idade;
	private String posicao;
	private int numeroCamisa;
	private int golFeitos;

	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public String getPosicao() {
		return posicao;
	}




	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}




	public int getNumeroCamisa() {
		return numeroCamisa;
	}




	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}




	public int getGolFeitos() {
		return golFeitos;
	}




	public void setGolFeitos(int golFeitos) {
		this.golFeitos = golFeitos;
	}




	public Jogador(String nome, int idade, String posicao, int numeroCamisa, int golFeitos) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
		this.golFeitos = golFeitos;
	}
	
	
	
	
    
	

	
}
	
	
	
