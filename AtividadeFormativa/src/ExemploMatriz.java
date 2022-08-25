//Figura 16. Exemplo de código para manipular matriz.

public class ExemploMatriz {

	public static void main(String[] args) {
		final int LIN = 3; // Constante para número de linhas 
		   final int COL = 4; // Constante para número de colunas 

		   int [][] mat = new int[LIN][COL];
		   int valor;

		   for (int i = 0; i < LIN; i++) {
		      for (int j = 0; j < COL; j++) {
		         valor = i + j;
		         mat[i][j] = valor;
		         System.out.print(mat[i][j] + " ");
		      }
		      System.out.println();
		   }

	}
	
}