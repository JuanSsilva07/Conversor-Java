package conversorJava;

import javax.swing.JOptionPane;

public class Principal {

	static FuncaoTemperaturas temperaturas = new FuncaoTemperaturas();
	static FuncaoMoedas moedas = new FuncaoMoedas();
	static FuncaoIMC pesos = new FuncaoIMC();

	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Conversor de Moedas", "Conversor de Temperatura", "Calcular IMC" }, "Escolha").toString();
		switch (opcoes) {
		case "Conversor de Moedas": {
			String input = JOptionPane.showInputDialog("Insira um valor abaixo:");
			double valorRecebido = Double.parseDouble(input);
			moedas.ConverterMoedas(valorRecebido);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (JOptionPane.OK_OPTION == resposta) {
				System.out.println("Escolha opção Afirmativa");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado.");
			}
			break;
		}
		case "Conversor de Temperatura": {
			String input = JOptionPane.showInputDialog("Insira a temperatura abaixo:");
			double temperaturaRecebida = Double.parseDouble(input);
			temperaturas.ConverterTemperaturas(temperaturaRecebida);

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (JOptionPane.OK_OPTION == resposta) {
				System.out.println("Escolha opção Afirmativa");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado.");
				break;
			}
		}
		case "Calcular IMC": {
			String inputPeso = JOptionPane.showInputDialog("Insira o seu peso:");
			double pesoRecebido = Double.parseDouble(inputPeso);
			String inputAltura = JOptionPane.showInputDialog("Insira a sua altura:");
			double alturaRecebida = Double.parseDouble(inputAltura);
			pesos.CalculaIMC(pesoRecebido, alturaRecebida);
			

			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (JOptionPane.OK_OPTION == resposta) {
				System.out.println("Escolha opção Afirmativa");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado.");
				break;
			}
		}
		}
	}
}
