package conversorJava;

import javax.swing.JOptionPane;

public class ConverterTemperatura {
	public void ConverterCelciusParaFahrenheit(double temperatura) {
		double valorTemperaturaF = (1.8 * temperatura) + 32;
		valorTemperaturaF = (double) Math.round(valorTemperaturaF * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: " +  valorTemperaturaF);
	}
	public void ConverterCelciusParaKelvin(double temperatura) {
		double valorTemperaturaK = temperatura + 273;
		valorTemperaturaK = (double) Math.round(valorTemperaturaK * 100) / 100;
		JOptionPane.showMessageDialog(null,"O resultado da conversão é: " +  valorTemperaturaK);
	}
}
