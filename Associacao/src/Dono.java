public class Dono {
	private String nome;
	private Cao[]  pets;  // Dono est� associado a um vetor pets de c�es

	public Dono(String nome) {
		this.nome = nome;   // Cria uma inst�ncia do vetor;
		pets = new Cao[3];  // vetor preparado para receber at� 3 c�es
	}						
	public void addPet (int index, Cao pet) { // inclui um objeto de c�o
		this.pets[index] = pet;             // no vetor pets
	}
	public Cao getPet (int index) { // obt�m uma inst�ncia de Cao
		return this.pets[index];  // na posi��o index do vetor pets
	}
	public void alimentarCaes() {
		for(int i=0; i< 3; i++)            // Invoca realizarRefeicao
			pets[i].realizarRefeicao();  // de cada objeto de pets
	}
	public void receberFesta() {        // Invoca o m�todo receberFesta
		for(int i=0; i< 3; i++)       // de cada objeto de pets
			System.out.println(this.nome + " est� recebendo festa de " 
                                    + this.pets[i].getNomeCao());
	}
	public void listarCaes() {      // lista todos os c�es do vetor pets
		for(int i=0; i< 3; i++)
			this.getPet(i).printCao();
	}

	public static void main(String[] args) {
		Dono  maria  = new Dono ("Maria");
		Cao   pipoca = new Cao  ("Pipoca", "Beagle", "F�mea", 3, 
                                      "Enrolada", "P�lo curtinho");
		Cao   bruce  = new Cao  ("Bruce", "Pug", "Macho", 2, "Caracol", 
                                      "P�lo curtinho");
		Cao   jujuba = new Cao  ("Jujuba", "Malt�s", "F�mea", 1, 
                                      "Enrolada", "P�lo longo");

		maria.addPet   (0, pipoca); // Pipoca est� na posi��o 0 de pets
		maria.addPet   (1, bruce);  // Bruce  est� na posi��o 1 de pets
		maria.addPet   (2, jujuba); // jujuba est� na posi��o 2 de pets

		pipoca.setMeuDono (maria);     // associa Pipoca com Maria
		bruce.setMeuDono  (maria);     // associa Bruce com Maria
		jujuba.setMeuDono (maria);     // associa Jujuba com Maria

		//Lista todos os c�es de Maria
		System.out.println("C�ozinhos de " + maria.nome);
		maria.listarCaes();

		maria.alimentarCaes();  // Maria alimenta todos os  c�es 
		maria.receberFesta();   // Maria recebe festa de todos os c�es
		
		
		
		
		int[] meuVetor = new int [5]; 
		 
		meuVetor[0] = 33;
		meuVetor[1] = 47;
		meuVetor[2] = 78;
		meuVetor[3] = 5;
		meuVetor[4] = 18;
			
		for(int i=0; i< meuVetor.length; i++)
		System.out.println("meuVetor[" + i + "] = " + meuVetor[i]);

	// meuVetor.length = comprimento do vetor = 5 inteiros mantidos no vetor

	}
}
