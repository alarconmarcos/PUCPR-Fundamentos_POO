import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in); //Criando objeto da classe scanner: Leitor
		int x, y, z; //variáveis locais
		
		System.out.println("Olá mundo da soma!");
		System.out.print("Entre com o valor de x: ");
		x = leitor.nextInt();
		System.out.print("Entre com o valor de y: ");
		y = leitor.nextInt();
		z = x + y;
		System.out.println("A soma de x e y = " + z);
		leitor.close();
		

	}

}
