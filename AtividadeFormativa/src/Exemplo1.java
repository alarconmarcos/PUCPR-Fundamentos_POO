//Figura 7. Exemplo de c�digo para declara��o e atribui��o.

public class Exemplo1 {

	public static void main(String[] args) {

		int x, y;                                   // declara��o de vari�veis inteiras: x e y

		int X;                                      // declara��o de outra vari�vel inteira X (ex. de case sensitive)
		                                                      // n�o � boa pr�tica come�ar nome de vari�vel com mai�scula!   
		boolean p, q;                               // declara��o de vari�vel l�gica 
		float a = 10.5f;                            // declara��o de vari�vel do tipo float, que j� recebe valor;

		x = 10;                                     // atribui��o de valor � vari�vel
		y = x - 38;                                 // atribui��o do valor de - 28 para a vari�vel 

		X = 9 % 2;                                  // X recebe o resultado da opera��o, que � igual a 1.

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


