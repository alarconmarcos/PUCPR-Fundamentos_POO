package P1;

class A {
	static int k; // valor default = zero
	

	protected static void g() {
		System.out.println("------------------");
		System.out.println("... M�todo A.g (sem modificador)");
		System.out.println("... Valor de A.k = " + k);
		System.out.println("------------------");
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