
public class banco {
	public static void main(String[] args) {
		//Cria objetos da Classe Conta
		conta cta1 = new conta();
		conta cta2 = new conta();
		
		cta1.setDono("Maria");
		cta1.setSaldo(150.3);
		
		cta2.setDono("José");
		cta2.setSaldo(128.57);
		
		System.out.println("Cta1 - Correntista: " + cta1.getDono());
		System.out.println("Cta1 - Saldo:       " + cta1.getSaldo());

		System.out.println("Cta2 - Correntista: " + cta2.getDono());
		System.out.println("Cta2 - Saldo:       " + cta2.getSaldo());
	}

}
