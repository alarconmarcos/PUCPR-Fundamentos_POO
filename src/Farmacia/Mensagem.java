package Farmacia;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Mensagem {
	static int IconError = 0;
	static int IconInfo = 1;
	static int IconAlert = 2;
	static int IconQuestion = 3;

	static Icon icon = new ImageIcon("farmacia.png");
	
	
	public static String input(String texto, String titulo) {
		if (titulo == null) {
			titulo = "Controle da Farmácia";
		}
        return JOptionPane.showInputDialog(null, texto, titulo, 0, new ImageIcon("farmacia.png"), null, null).toString();		
	
	}
	
	public static void mensagem(String texto, String titulo, int tipo) {
		if (titulo == null) {
			titulo = "Controle da Farmácia";
		}
//		JOptionPane.showMessageDialog(null, texto, titulo, tipo,new ImageIcon("farmacia.png"));		
//		JOptionPane.showMessageDialog(null, texto, titulo, tipo,null);		
	
		JOptionPane jp = new JOptionPane(texto, tipo, JOptionPane.DEFAULT_OPTION, null);
		
		JDialog dialog = jp.createDialog(null, titulo);
		
		dialog.setIconImage(((ImageIcon)icon).getImage());
		
		dialog.setVisible(true); 
		
	}
	public static void mensagem(String texto, String titulo) {
		if (titulo == null) {
			titulo = "Controle da Farmácia";
		}
//		JOptionPane.showMessageDialog(null, texto, titulo, tipo,new ImageIcon("farmacia.png"));		
//		JOptionPane.showMessageDialog(null, texto, titulo, 0,new ImageIcon("farmacia.png"));		
	
		JOptionPane jp = new JOptionPane(texto, 0, JOptionPane.DEFAULT_OPTION, new ImageIcon("farmacia.png"));
		
		JDialog dialog = jp.createDialog(null, titulo);
		
		dialog.setIconImage(((ImageIcon)icon).getImage());
		
		dialog.setVisible(true); 

	}
	

	
	
}
