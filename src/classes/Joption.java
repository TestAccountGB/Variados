package classes;

import javax.swing.JOptionPane;

public class Joption {
	public static void main(String[] args) {
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Em que ano voc� nasceu?"));
		int idade = anoAtual-anoNascimento;
		JOptionPane.showMessageDialog(null,"Voce tem: " +idade+ " anos");
	}
}
