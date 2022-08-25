
public class Lampada {
	private boolean acesa; //atributo
	
	public void acender() { //metodo publico
		this.acesa = true;
	}
	public void apagar() {  //m�todo p�blico
		this.acesa = false;
	}
	public Lampada(boolean acesa) { //	m�todo construtor da classe
		this.acesa = acesa;
	}
	public boolean isAcesa() { //"getter" � is para boolean
		return acesa;
	}
	public void setAcesa(boolean acesa) {  //setter
		this.acesa = acesa;
	}
	public static void main(String[] args) {
		int cont = 1; //vari�vel local
		Lampada lamp1 = new Lampada(true);  //instanciando objeto
		Lampada lamp2 = new Lampada(false); //instanciando objeto
		
		while (cont < 5) {
			System.out.println("-- Intera��o (repeti��o): " + cont);
			System.out.println("L�mpada [lamp1] = " +(lamp1.isAcesa()?"acesa":"apagada"));
			System.out.println("L�mpada [lamp2] = " +(lamp2.isAcesa()?"acesa":"apagada"));
			System.out.println();
			lamp1.setAcesa(!(lamp1.isAcesa())); //troca o estado de lamp1
			lamp2.setAcesa(!(lamp2.isAcesa())); //troca o estado de lamp2
			cont++;
		}
	}
}
