//questão 1
	
public class Teste {
	private int exp1;
	private int exp2;
	
	protected void calcular1(int x) {
		this.exp1 = x + 8*3+2-18/3+3*2;
	}
	protected void calcular2(int x) {
		this.exp2 = x + 8*(3+2)-18/(3+3)*2;
	}
	public static void main(String[] args) {
		Teste t = new Teste();
		t.calcular1(0);
		t.calcular2(4);
		System.out.println(t.exp1);
		System.out.println(t.exp2);

//==========================================================
//Questão 2
		System.out.println();
		System.out.println("==========================================================");
		System.out.println("Questão 2");
		System.out.println();
		
		int i = 10;
		do {
			i --;
			if (i == 6)
				break;
			System.out.println(i);
		}while (i > 1); 
		System.out.println("i = " +i);
				
		int k = 5;
		while (k > 1) {
			k--;
			if (k == 2)
				continue;
			System.out.println(k);
		}
		System.out.println("k = " + k);
		
//==========================================================
//Questão 3
		System.out.println();
		System.out.println("==========================================================");
		System.out.println("Questão 3");
		System.out.println();

		
		int opt = 3;
		
		switch (opt) {
		case 1: 
			System.out.println("Primeiro");
		case 2: 
			System.out.println("Segundo");
		case 3: 
			System.out.println("Terceiro");
		default:
			System.out.println("qualquer posição");
		}
		
		
//==========================================================
//Questão 7
		System.out.println();
		System.out.println("==========================================================");
		System.out.println("Questão 7");
		System.out.println();
		
		int x = -4;
		int y = -3;
		int z;
		
		if (x != y) {
			z = (x > y ? 2*x : -2*y);
		}else {
			z = x + y;
		}
		System.out.println("z = " + z);
	}
}