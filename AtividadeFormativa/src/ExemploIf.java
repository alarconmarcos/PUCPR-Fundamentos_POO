//Figura 9. Exemplo de c�digo de if para desvio dependente de condi��o (decis�o).

public class ExemploIf {

	public static void main(String[] args) {
		int idade = 15;
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
	
		System.out.println(idade < 18 ? "Menor de idade" : "Maior de idade");
	}	

}
