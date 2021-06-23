package Farmacia;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Mensagem {//Classe de mensagens utilizando JOptionPane 
	final static int IconError = 0; // Constantes com os tipos de icones de mensagem para facilitar
	final static int IconInfo = 1;
	final static int IconAlert = 2;
	final static int IconQuestion = 3;

	static Icon icon = new ImageIcon("farmacia.png"); // Icone usado tanto na tela quanto na barra de título das mensagens
	
	
	public static String input(String texto, String titulo) { //Método de mensagem com input
		if (titulo == null) {
			titulo = "Controle da Farmácia";
		}
        return JOptionPane.showInputDialog(null, texto, titulo, 0, new ImageIcon("farmacia.png"), null, null).toString();		
	
	}
	
	public static void mensagem(String texto, String titulo, int tipo) { //Método de mensagem com logo de farmácia no título e icone do tipo de mensagem
		if (titulo == null) {
			titulo = "Controle da Farmácia";
		}
	
		JOptionPane jp = new JOptionPane(texto, tipo, JOptionPane.DEFAULT_OPTION, null);
		
		JDialog dialog = jp.createDialog(null, titulo);
		
		dialog.setIconImage(((ImageIcon)icon).getImage()); //Seta o icone da barra de título
		
		dialog.setVisible(true); 
		
	}
	public static void mensagem(String texto, String titulo) { //Método de mensagem com logo de farmácia tanto no título quanto na tela
		if (titulo == null) {
			titulo = "Controle da Farmácia";
		}
	
		JOptionPane jp = new JOptionPane(texto, 0, JOptionPane.DEFAULT_OPTION, new ImageIcon("farmacia.png"));
		
		JDialog dialog = jp.createDialog(null, titulo);
		
		dialog.setIconImage(((ImageIcon)icon).getImage()); //Seta o icone da barra de título
		
		dialog.setVisible(true); 

	}

}
