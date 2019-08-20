package mpoo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Helloworld {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimir() {
		Date horaAtual = new Date();
		SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println( horaFormat.format(horaAtual.getTime()) + " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}

}
