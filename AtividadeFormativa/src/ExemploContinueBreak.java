//Figura 13. Exemplo de c�digo com interrup��o de repeti��o. 

public class ExemploContinueBreak {

	public static void main(String[] args) {
		// i come�a em 1 e aumenta de 3 em 3 at� <= 20
		for (int i = 1; i <= 20; i+=3) { // 1, 4, 7, 10, 13, 16, 19	
		   if (i % 2 == 1) { // se � n�mero �mpar: resto de i por 2 = 1    
		         continue;      // interrompe e vai para a condi��o 
		   }
		   System.out.println(i + " ");
		}
		System.out.println("Fim 1\n\n");
		    
		// i come�a em 1 e aumenta de 3 em 3 at� <= 20
		for (int i = 1; i <= 20; i+=3) { // 1, 4, 7, 10, 13, 16, 19	
		   if (i % 5 == 0) { // se m�ltiplo de 5: resto de i por 5 = 0	
		      break;         // interrompe e sai da repeti��o
		   }
		   System.out.println(i + " ");
		}
		System.out.println("Fim 2");  

	}

}
