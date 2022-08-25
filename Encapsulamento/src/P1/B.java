package P1;

class B {
	protected static void f() {
		System.out.println("Método f (sem modificador)");
		A.g();
		int x = A.k;
		System.out.println("Valor de x = " + x);
		A.k = 10;
		System.out.println("Valor de k = " + A.k);
	}
	
}

/*

Perguntas:

a) É possível usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B? O que acontece?
b) É possível usar o modificador private nos métodos A.g () e B.f ()? Justifique.
c) É possível usar o modificador protected nos métodos A.g () e B.f ()? Justifique.

Respostas: 

a) Não é possível. Gera erro de compilação, pois a classe precisa ser pública ou default (vazio).
b)O método A.g () não pode ter modificador private porque ele é utilizado nos objetos da classe B . O método B.f () poderia ter modificador private porque apenas é utilizado dentro da própria classe B.
c) Poderíamos utilizar o modificador protected em ambos os métodos A.g () e B.f (), pois são classes que estão no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.

*/