public class Dono_old {
	private String nome;
	private Cao    pet;  // Dono est� associado com seu C�o
	
	public Dono_old(String nome) {
		this.nome = nome;
	}
	public void setPet (Cao pet) {
		this.pet = pet;
	}
	public Cao getPet () {
		return this.pet;
	}
	public void alimentarCao() {
		pet.realizarRefeicao();
	}
	public void receberFesta() {
		System.out.println(this.nome + " est� recebendo festa de " + 
            this.pet.getNomeCao());
	}

	public static void main(String[] args) {
		Dono_old  maria  = new Dono_old ("Maria");
		Cao   pipoca = new Cao  ("Pipoca", "Beagle", "F�mea", 3, 
                                      "Enrolada", "P�lo curtinho");
		maria.setPet        (pipoca); // associa Maria com Pipoca
		pipoca.setMeuDono   (maria);  // associa Pipoca com Maria
				
		System.out.println("C�ozinho de " + maria.nome);
		maria.getPet().printCao();
		
		maria.alimentarCao();  // Maria alimenta o seu c�o Pipoca
		pipoca.agradarDono();  // Pipoca agrada sua dona Maria	
	}
}