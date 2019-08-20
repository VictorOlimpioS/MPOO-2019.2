package mpoo;

public class Helloworld {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void imprimir() {
		System.out.println("Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}

}
