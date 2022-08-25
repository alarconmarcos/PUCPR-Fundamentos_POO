package Farmacia;

import java.awt.TrayIcon.MessageType;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagem {
	
	public static String input(String texto, String titulo, int tipo) {
		return JOptionPane.showInputDialog(null, texto, titulo, tipo, new ImageIcon("farmacia.png"), null, null).toString();		
	}
	
	public static void mensagem(String texto, String titulo, int tipo) {
		JOptionPane.showMessageDialog(null, texto, titulo, tipo,new ImageIcon("farmacia.ico"));		
		
	}
	
	
}
