//Figura 12. Exemplo de c�digo de for para repeti��o dependente de condi��o (decis�o).

public class ExemploFor {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i <= 3; i++) {
		   soma = soma + i; // acumula o valor de i em soma
		}
		System.out.println("Soma = " + soma); // 6 = 1 + 2 + 3 
	}

}
