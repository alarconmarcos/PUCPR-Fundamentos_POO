public class Cao {             // Associa��o: meuDono � uma refer�ncia da 
	private Dono   meuDono;  // classe Dono e tamb�m atributo da classe C�o
	private String nomeCao;   
	private String raca;
	private String genero;
	private int    idade;
	private Cauda  minhaCauda; // Composi��o: C�o possui Cauda

	public Cao(String nome, String raca, String genero, int idade, 
                 String forma, String tipoPelo) {
		this.nomeCao = nome;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;     // Composi��o: a cauda faz parte do c�o
		this.minhaCauda = new Cauda (forma, tipoPelo); 
	}                          
	public void setMeuDono(Dono meuDono) {
		this.meuDono = meuDono;
	}
	public String getNomeCao() {
		return nomeCao;
	}
	public void printCao() {
		System.out.println("  Nome:   " + this.nomeCao);
		System.out.println("  Ra�a:   " + this.raca);
		System.out.println("  G�nero: " + this.genero);
		System.out.println("  Idade:  " + this.idade);
		minhaCauda.printCauda();
		System.out.println();
	}
	public void realizarRefeicao() {
		System.out.println(this.nomeCao + " fazendo sua refei��o.");
	}
	public void agradarDono() {
		this.meuDono.receberFesta(); // Invoca m�todo da classe Dono
	}
}