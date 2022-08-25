// Figura 8. Exemplo de código para leitura e escrita de dados.

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in); //Criando objeto da classe scanner: Leitor
		int x, y, z; //variáveis locais
		
		System.out.print("Entre com o valor de x (inteiro): ");
		x = leitor.nextInt();
		
		System.out.print("Entre com o valor de y (inteiro): ");
		y = leitor.nextInt();
		
		z = x + y;
		
		System.out.println("Soma de x + y = " + z);
		System.out.println("Fim");
		leitor.close();

	}

}
