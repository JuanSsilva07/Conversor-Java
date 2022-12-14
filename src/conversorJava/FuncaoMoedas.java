package conversorJava;

import javax.swing.JOptionPane;

public class FuncaoMoedas {
	ConverterMoedas moedas = new ConverterMoedas();
	
	public void ConverterMoedas(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha a cotação para qual você deseja converter o seu dinheiro ", 
				"Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais para Dólares", "De Reais para Euros",
						"De Reais para Libras", "De Reais para Ienes","De Reais para Won Coreano", "De Reais para Peso Argentino"}, 
				"Escolha")).toString();
		
		switch(opcao) {
			case "De Reais para Dólares":
				moedas.ConverteReaisParaDolar(valorRecebido);
				break;
			case "De Reais para Euros":
				moedas.ConverteReaisParaEuro(valorRecebido);
				break;
			case "De Reais para Libras":
				moedas.ConverteReaisParaLibras(valorRecebido);
				break;
			case "De Reais para Ienes":
				moedas.ConverteReaisParaIenes(valorRecebido);
				break;
			case "De Reais para Won Coreano":
				moedas.ConverteReaisParaWon(valorRecebido);
				break;
			case "De Reais para Peso Argentino":
				moedas.ConverteReaisParaPesoArgentinos(valorRecebido);
				break;
		}
	}
}
