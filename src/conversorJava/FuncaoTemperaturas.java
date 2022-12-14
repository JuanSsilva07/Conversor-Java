package conversorJava;

import javax.swing.JOptionPane;

public class FuncaoTemperaturas {
	ConverterTemperatura temperatura = new ConverterTemperatura();
	
	public void ConverterTemperaturas(double temperaturaRecebida) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha a conversão que você deseja realizar: ", 
				"Opções", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celcius para Fahrenheit", "De Celcius para Kelvin"}, 
				"Escolha")).toString();
		
		switch(opcao) {
			case "De Celcius para Fahrenheit":
				temperatura.ConverterCelciusParaFahrenheit(temperaturaRecebida);
				break;
			case "De Celcius para Kelvin":
				temperatura.ConverterCelciusParaKelvin(temperaturaRecebida);
				break;
		}
	}
}