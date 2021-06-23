package Farmacia;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Farmacia {
	private ArrayList<Produto> produtos;

	public Farmacia() {
		this.produtos = new ArrayList<Produto>();
	}
	public String[] leValores (String [] dadosIn){
		String [] dadosOut = new String [dadosIn.length];

		for (int i = 0; i < dadosIn.length; i++)
		    dadosOut[i] = Mensagem.input("Entre com " + dadosIn[i]+ ": ", null);

		return dadosOut;
	}

	public Medicamento leMedicamento (){

		String [] valores = new String [4];
		String [] nomeVal = {"Nome", "Dose", "Laboratório", "Preço"};
		valores = leValores (nomeVal);

		int dose = this.retornaInteiro(valores[1]);
        int preco = this.retornaInteiro(valores[3]);

		Medicamento medicamento = new Medicamento (valores[0], dose, valores[2], preco);
		return medicamento;
	}

	public Cosmetico leCosmetico (){

		String [] valores = new String [4];
		String [] nomeVal = {"Nome", "Dose", "Laboratório", "Preço"};
		valores = leValores (nomeVal);

		int dose = this.retornaInteiro(valores[1]);
        int preco = this.retornaInteiro(valores[3]);

		Cosmetico cosmetico = new Cosmetico (valores[0], dose, valores[2], preco);
		return cosmetico;
	}

	private boolean intValido(String s) {
		try {
			Integer.parseInt(s); // Método estático, que tenta tranformar uma string em inteiro
			return true;
		} catch (NumberFormatException e) { // Não conseguiu tranformar em inteiro e gera erro
			return false;
		}
	}
	public int retornaInteiro(String entrada) { // retorna um valor inteiro

		//Enquanto não for possível converter o valor de entrada para inteiro, permanece no loop
		while (!this.intValido(entrada)) {
			entrada = Mensagem.input("Valor incorreto!\n\nDigite um número inteiro.", null);

		}
		return Integer.parseInt(entrada);
	}

	public void salvaProdutos (ArrayList<Produto> produtos){
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream 
					(new FileOutputStream("c:\\temp\\Farmacia.dat"));
			for (int i=0; i < produtos.size(); i++)
				outputStream.writeObject(produtos.get(i));
		} catch (FileNotFoundException ex) {
			Mensagem.mensagem("Impossível criar arquivo!", null, Mensagem.IconError);
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {  
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	@SuppressWarnings("finally")
	public ArrayList<Produto> recuperaProdutos (){
		ArrayList<Produto> produtosTemp = new ArrayList<Produto>();

		ObjectInputStream inputStream = null;

		try {	
			inputStream = new ObjectInputStream
					(new FileInputStream("c:\\temp\\Farmacia.dat"));
			Object obj = null;
			while ((obj = inputStream.readObject()) != null) {
				if (obj instanceof Produto) {
					produtosTemp.add((Produto) obj);
				}   
			}          
		} catch (EOFException ex) { 
			System.out.println("Fim de arquivo.");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			Mensagem.mensagem("Arquivo com produtos não existe!", null, Mensagem.IconError);
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {  
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
			return produtosTemp;
		}
	}

	public void menuFarmacia (){

		String menu = "";
		String entrada;
		int    opc1, opc2;

		do {
			menu = "Opções:\n\n" + 
					"1. Entrar Produtos\n" +
					"2. Exibir Produtos\n" +
					"3. Limpar Produtos\n" +
					"4. Gravar Produtos\n" +
					"5. Recuperar Produtos\n" +
					"9. Sair";
			entrada = Mensagem.input(menu + "\n\n", null);
			opc1 = this.retornaInteiro(entrada);

			switch (opc1) {
			case 1:// Entrar dados
				menu = "Opções disponíveis:\n\n" + 
						"1. Medicamento\n" +
						"2. Cosmético\n";

				entrada = Mensagem.input(menu + "\n\n","Entrada de Produtos na Farmácia\n");
				opc2 = this.retornaInteiro(entrada);

				switch (opc2){
				case 1: produtos.add((Produto)leMedicamento());
				break;
				case 2: produtos.add((Produto)leCosmetico());
				break;
				default: 
					Mensagem.mensagem("Produto para entrada não escolhido!", "Alerta", Mensagem.IconAlert);
				}

				break;
			case 2: // Exibir dados
				if (produtos.size() == 0) {
					Mensagem.mensagem("Primeiramente, entre com os produtos!", null, Mensagem.IconAlert);
					break;
				}
				String dados = "";
				for (int i=0; i < produtos.size(); i++)	{
					dados += produtos.get(i).toString() + "---------------\n";
				}
				Mensagem.mensagem(dados, null);
				break;
			case 3: // Limpar Dados
				if (produtos.size() == 0) {
					Mensagem.mensagem("Primeiramente, entre com os produtos!", null, Mensagem.IconAlert);
					break;
				}
				produtos.clear();
				Mensagem.mensagem("Dados LIMPOS com sucesso!", null, Mensagem.IconInfo);
			break;
			case 4: // Grava Dados
				if (produtos.size() == 0) {
					Mensagem.mensagem("Primeiramente, entre com os produtos!", null, Mensagem.IconAlert);
					break;
				}
				salvaProdutos(produtos);
				Mensagem.mensagem("Dados SALVOS com sucesso!", null, Mensagem.IconInfo);
				break;
			case 5: // Recupera Dados
				produtos = recuperaProdutos();
				if (produtos.size() == 0) {
					Mensagem.mensagem("Sem dados para apresentar.", null, Mensagem.IconAlert);
					break;
				}
				Mensagem.mensagem("Dados RECUPERADOS com sucesso!", null, Mensagem.IconInfo);
				break;
			case 9:
				Mensagem.mensagem("Fim do aplicativo FARMÁCIA", null, Mensagem.IconInfo);
				break;
			}
		} while (opc1 != 9);
	}

	
	public static void main (String [] args){

		Farmacia farmacia = new Farmacia ();
		farmacia.menuFarmacia();

	}

}