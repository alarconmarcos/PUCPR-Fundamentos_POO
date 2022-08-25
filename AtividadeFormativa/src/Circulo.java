//Figura 7. Exemplo de atributo constante definido como final static.

import java.util.Scanner;

public class Circulo {
// Atributo da classe -------- 
   float raio;
   final static float PI = 3.1415f; // Contante: final static
	
   public Circulo (float raio) {    // Construtor
   this.raio = raio;
   }

// M�todos da classe ---------
   float calcularPerimetro() {
      return 2 * PI * this.raio; 
   }
   void imprimirDados() {
      System.out.println("C�rculo: ");
      System.out.println("- raio     : " + raio);
      System.out.println("- per�metro: " + calcularPerimetro());
   }
   // M�todo principal -------------
   public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in); // leitor de teclado
      float raio;
      System.out.println("Mundo dos C�rculos");
      System.out.print  ("Entre o valor do raio: ");
      raio = leitor.nextFloat();          // recebe valor float em raio
      Circulo circ1 = new Circulo (raio); // instancia Circulo em circ1
      circ1.imprimirDados();              // invoca m�todo
      System.out.println("----------------------------");
	System.out.print  ("Entre o valor do raio: ");
      raio = leitor.nextFloat();          // recebe valor float em raio
      Circulo circ2 = new Circulo (raio); // instancia Circulo em circ2
      circ2.imprimirDados();              // invoca m�todo
   }
}