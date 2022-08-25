//Figura 7. Exemplo de código para declaração e atribuição.

public class Exemplo1 {

	public static void main(String[] args) {

		int x, y;                                   // declaração de variáveis inteiras: x e y

		int X;                                      // declaração de outra variável inteira X (ex. de case sensitive)
		                                                      // não é boa prática começar nome de variável com maiúscula!   
		boolean p, q;                               // declaração de variável lógica 
		float a = 10.5f;                            // declaração de variável do tipo float, que já recebe valor;

		x = 10;                                     // atribuição de valor à variável
		y = x - 38;                                 // atribuição do valor de - 28 para a variável 

		X = 9 % 2;                                  // X recebe o resultado da operação, que é igual a 1.

		p = (3 >= 5);                               // p recebe o valor de false 
		q = (true || false);                        // q recebe o valor de true

		System.out.println("x = " + x);             // imprime x = 10 na console 
		System.out.println("y = " + y);             // imprime y = -28 na console 
		System.out.println("X = "+ X);              // imprime X = 1 na console  
		System.out.println("p = " + p);             // imprime p = false na console 
		System.out.println("q = " + q);             // imprime q = true na console 
		System.out.printf ("a = %.2f", a*3);       // imprime a = 31,5 na console
		}

}


