//Figura 5. Exemplo de m�todos static.

import java.util.Scanner;

public class Calculadora {
   // m�todos static s�o invocados diretamente da sua classe 
   static float somar (float a, float b) {
      return a + b;
   }
   static float multiplicar (float a, float b) {
      return a * b;
   }

   public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in); // leitor de teclado
      float x, y, z; // vari�veis locais
		
      System.out.print("Entre o valor de x: ");
      x = leitor.nextFloat();
		
      System.out.print("Entre o valor de y: ");
      y = leitor.nextFloat();
		
      z = Calculadora.somar(x, y);        // M�todo static: invocado diretamente 
      System.out.println("x + y = " + z); // da classe Calculadora
		
      z = Calculadora.multiplicar(x, y);  // M�todo static: invocado diretamente
      System.out.println("x * y = " + z); // da classe Calculadora
   }
}