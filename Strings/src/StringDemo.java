public class StringDemo {
	
	public static void main(String[] args) {
		String ola = "Ol�"; // Declara e instancia diretamente
		
		String nome1 = new String("Maria"); // Instancia com new
		String nome2 = new String("Jo�o");  // Instancia com new
		
		// Declara e instancia com a concatena��o de strings 
		String saudacao = ola + ", " + nome1 + "!\n\n"; 
		System.out.println(saudacao);
		
		// Altera o valor de saudacao pela atribui��o do valor de ola
		// N�o � preciso declarar saudacao novamente 
		saudacao = ola;
		
		// Altera o calor de saudacao, que recebe 
		// o resultado da concatenacao de mais strings
		// � uma alternativa que utiliza o m�todo 
             // String.concat(String s):
		saudacao = saudacao.concat(", " + nome2);
		saudacao = saudacao.concat("!\n\n");
		
		//Mais uma alternativa de concatena��o
		System.out.println(saudacao + "fim");
	}
}