package conversorJava;

import javax.swing.JOptionPane;

public class ConverterPeso {
	public void KGParaIMC(double peso, double altura) {
		double valorIMC = peso / (altura * altura);
		valorIMC = (double) Math.round(valorIMC * 100) / 100;
		JOptionPane.showMessageDialog(null,"O seu IMC é: " +  valorIMC);
	}
	public void LibrasParaIMC(double peso, double altura) {
		double valorIMC = (peso / (altura * altura)) * 703;
		valorIMC = (double) Math.round(valorIMC * 100) / 100;
		JOptionPane.showMessageDialog(null,"O seu IMC é: " +  valorIMC);
	}
}
