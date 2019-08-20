package mpoo;


public class Application {
	public static void main(String[] args) {
		Helloworld helloworld1 = new Helloworld();
		helloworld1.setNome("Victor");
		helloworld1.imprimir();

		helloworld1.setNome("Victor Olimpio");
		helloworld1.imprimir();

		Helloworld helloworld2 = new Helloworld();
		helloworld2.imprimir();
		
	}

}
