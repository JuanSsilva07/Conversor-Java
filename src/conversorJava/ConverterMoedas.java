package conversorJava;

import javax.swing.JOptionPane;

public class ConverterMoedas {
	public void ConverteReaisParaDolar(double quantia) {
		double valorDolar = quantia / 5.31;
		valorDolar = (double) Math.round(valorDolar * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: $" +  valorDolar + " Dólares");
	}
	public void ConverteReaisParaEuro(double quantia) {
		double valorEuro = quantia / 5.66;
		valorEuro = (double) Math.round(valorEuro * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: €" +  valorEuro + " Euros");
	}
	public void ConverteReaisParaLibras(double quantia) {
		double valorLibras = quantia / 6.57;
		valorLibras = (double) Math.round(valorLibras * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: $" +  valorLibras + " Libras");
	}
	public void ConverteReaisParaIenes(double quantia) {
		double valorIenes = quantia / 0.03;
		valorIenes = (double) Math.round(valorIenes * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: $" +  valorIenes + " Ienes");
	}
	public void ConverteReaisParaWon(double quantia) {
		double valorWon = quantia / 0.004;
		valorWon = (double) Math.round(valorWon * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: $" +  valorWon + " Won Coreanos");
	}
	public void ConverteReaisParaPesoArgentinos(double quantia) {
		double valorPesoArgentinos = quantia / 0.03;
		valorPesoArgentinos = (double) Math.round(valorPesoArgentinos * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: $" +  valorPesoArgentinos + " Peso Argentinos");
	}
}
