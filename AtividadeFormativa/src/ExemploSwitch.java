//Figura 10. Exemplo de c�digo de switch para desvio dependente de condi��o (decis�o).

public class ExemploSwitch {

	public static void main(String[] args) {
		int escolha = 1;
		   switch (escolha) {
		   case 1:
		      System.out.println("Escolha 1 selecionada");
		      break;
		   case 2:
		      System.out.println("Escolha 2 selecionada");
		   case 3:
		      System.out.println("Escolha 3 selecionada");
		      break;
		   default:
		      System.out.println("Escolha op��o selecionada");
		      break;
		}
	}

}
