package mpoo;


public class Application {
	public static void main(String[] args) {
		Helloworld helloworld = new Helloworld();
		helloworld.setNome("Victor");
		helloworld.imprimir();
		helloworld.setNome("Débora");
		helloworld.imprimir();	
		Helloworld h = new Helloworld();
		h.setNome("Gabriel");
		h.imprimir();
		
	}

}
