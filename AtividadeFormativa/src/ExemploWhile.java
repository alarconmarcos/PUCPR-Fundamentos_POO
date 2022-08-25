//Figura 11. Exemplo de código de while e do-while para repetição dependente de condição (decisão).

public class ExemploWhile {

	public static void main(String[] args) {
		// -- exemplo WHILE -------------------
		   int i    = 1;
		   int soma = 0;
		   while (i <= 3) {
		      soma = soma + i;// acumula o valor de i em soma
		      i++;            // aumenta o valor de i de 1 em 1
		   }
		   System.out.println("Soma = " + soma); // 6 = 1 + 2 + 3

		// -- mesmo exemplo anterior com DO-WHILE ----------------
		   i    = 1;
		   soma = 0;
		   do {
		      soma = soma + i;// acumula o valor de i em soma
		      i++;            // aumenta o valor de i de 1 em 1
		   }while (i <= 3);
		   System.out.println("Soma = " + soma); // 6 = 1 + 2 + 3

	}

}
