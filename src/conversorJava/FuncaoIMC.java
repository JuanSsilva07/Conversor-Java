package conversorJava;

import javax.swing.JOptionPane;

public class FuncaoIMC {
	ConverterPeso imc = new ConverterPeso();
	
	public void CalculaIMC(double pesoRecebido, double alturaRecebida) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha a opção de peso a ser calculado: ", 
				"Opções", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Calcular IMC a partir de KG", "Calcular IMC a partir de Libras"}, 
				"Escolha")).toString();
		
		switch(opcao) {
			case "Calcular IMC a partir de KG":
				imc.KGParaIMC(pesoRecebido, alturaRecebida);
				break;
			case "Calcular IMC a partir de Libras":
				imc.LibrasParaIMC(pesoRecebido, alturaRecebida);
				break;
		}
	}
}