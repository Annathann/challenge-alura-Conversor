package Monedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	public void ConvertirSolPeruano_Dolares(double valor) {
		double monedaDolar = valor / 3.67;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirSolPeruano_Euros(double valor) {
		double monedaEuro = valor / 3.96;	
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes € " + monedaEuro + " Euros");
	}
	public void ConvertirSolPeruano_Libra(double valor) {
		double monedaLibra = valor / 4.56;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes £ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirSolPeruano_Yen(double valor) {
		double monedaYen = valor / 0.027;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes ¥ " + monedaYen + " Yens Japonés");
	}
	public void ConvertirSolPeruano_Won(double valor) {
		double monedaWon = valor / 0.0028;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes  " + monedaWon + " Wons sur-coreano");
	}
	
	
	public void ConvertirDolares_SolPeruano(double valor) {
		double monedaDolar = 3.67 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en soles");
	}
	public void ConvertirEuros_SolPeruano(double valor) {
		double monedaEuro = valor * 3.96;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en soles");
	}
	public void ConvertirLibra_SolPeruano(double valor) {
		double monedaLibra = valor * 4.56;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en soles");
	}
	public void ConvertirYen_SolPeruano(double valor) {
		double monedaYen = valor * 0.027;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en soles");
	}
	public void ConvertirWon_SolPeruano(double valor) {
		double monedaWon = valor * 0.0028;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sur-coreano " + monedaWon + " en soles");
	}
}
