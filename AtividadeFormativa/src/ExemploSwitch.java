//Figura 10. Exemplo de código de switch para desvio dependente de condição (decisão).

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
		      System.out.println("Escolha opção selecionada");
		      break;
		}
	}

}
