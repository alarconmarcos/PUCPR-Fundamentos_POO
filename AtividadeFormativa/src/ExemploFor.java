//Figura 12. Exemplo de código de for para repetição dependente de condição (decisão).

public class ExemploFor {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i <= 3; i++) {
		   soma = soma + i; // acumula o valor de i em soma
		}
		System.out.println("Soma = " + soma); // 6 = 1 + 2 + 3 
	}

}
