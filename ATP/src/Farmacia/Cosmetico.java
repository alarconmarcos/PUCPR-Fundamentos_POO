package Farmacia;

public class Cosmetico extends Produto {
    
	private static final long serialVersionUID = 1L;

	public String precisaPrescricao() {
		return "N�o � necess�ria prescri��o m�dica, produto de venda livre!";
	}
	public Cosmetico(String nome, int dose, String laboratorio, int valor) {
		super(nome, dose, laboratorio, valor);
		this.categoria = "Beleza";
	}
}