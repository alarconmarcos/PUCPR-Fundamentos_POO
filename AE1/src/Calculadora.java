public class Calculadora {
	static int contAdicao;
	static int contSubtracao;
	
	static int soma(int a, int b) {
		contAdicao ++;
		return a+b;
	}
	static int subtrai(int a, int b) {
		contSubtracao += 1;
		return a-b;
	}
	
	
}
