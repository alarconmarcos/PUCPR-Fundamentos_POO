package P1;

class B {
	protected static void f() {
		System.out.println("M�todo f (sem modificador)");
		A.g();
		int x = A.k;
		System.out.println("Valor de x = " + x);
		A.k = 10;
		System.out.println("Valor de k = " + A.k);
	}
	
}

/*

Perguntas:

a) � poss�vel usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B? O que acontece?
b) � poss�vel usar o modificador private nos m�todos A.g () e B.f ()? Justifique.
c) � poss�vel usar o modificador protected nos m�todos A.g () e B.f ()? Justifique.

Respostas: 

a) N�o � poss�vel. Gera erro de compila��o, pois a classe precisa ser p�blica ou default (vazio).
b)O m�todo A.g () n�o pode ter modificador private porque ele � utilizado nos objetos da classe B . O m�todo B.f () poderia ter modificador private porque apenas � utilizado dentro da pr�pria classe B.
c) Poder�amos utilizar o modificador protected em ambos os m�todos A.g () e B.f (), pois s�o classes que est�o no mesmo pacote e, com esse modificador, os m�todos estariam acess�veis entre as classes.

*/