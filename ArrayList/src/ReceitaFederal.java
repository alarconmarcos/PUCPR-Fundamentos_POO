public class ReceitaFederal {

	public static void main(String[] args) {
		Contribuinte julia = new Contribuinte ( "Julia");
		Dependente jorge = new Dependente ( "Jorge");
		Dependente sandra = new Dependente ( "Sandra");
		
		julia.ligarDependente(jorge);
		julia.ligarDependente(sandra);
		julia.imprimir();
		System.out.println("Numero de dependentes : " + 
                                julia.numeroDependentes ( ) + "\n");
		
		Contribuinte leonardo = new Contribuinte ("Leonardo");
		Dependente marta = new Dependente ("Marta");
		Dependente diego = new Dependente ("Diego");
		Dependente claudia = new Dependente ("Claudia");
		leonardo.ligarDependente(marta);
		leonardo.ligarDependente(diego);
		leonardo.ligarDependente(claudia);
		leonardo.imprimir();
		System.out.println ("Numero de dependentes: " +     
                                 leonardo.numeroDependentes ( ) + "\n");
	}
}