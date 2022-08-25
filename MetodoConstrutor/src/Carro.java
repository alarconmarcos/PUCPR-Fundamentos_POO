public class Carro {
	private String  marca;  // atributo oculto (encapsulamento / privado)
	
	public Carro(String marca) { // M�todo construtor
		this.marca = marca;
	}
  	public void imprimir() { // M�todo que exibe o valor do atributo na tela
		System.out.println("Marca:  " + this.marca);
	}
	public static void main(String[] args) {
		Carro meuCarro = new Carro("Ford"); // instancia Carro
		meuCarro.imprimir();    // m�todo p�blico para exibir dados 
                                     // privados / encapsulados de carro 
	}
}
