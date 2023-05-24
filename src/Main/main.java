package Main;

import javax.swing.*;

import Monedas.OpcionesMonedas;
import Temperatura.OpcionesTemperatura;

public class main {
	
	public static void main(String[] args) {
		
		OpcionesMonedas monedas = new OpcionesMonedas();
		OpcionesTemperatura temperatura = new OpcionesTemperatura();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Seleccionar").toString();
			
			switch(opciones) {
			
				case "Conversor de Monedas":
						String input = JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir");
						double valorMoneda = Double.parseDouble(input);
						monedas.ConversorMonedas(valorMoneda);
						  
						int respMoneda = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
						if(JOptionPane.OK_OPTION == respMoneda) {
							break;
						}else {
							JOptionPane.showMessageDialog(null, "Adios");
							System.exit(0);
						}
					
				case "Conversor de Temperatura":
						String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir");
						double valorTemperatura = Double.parseDouble(input1);
						temperatura.ConversorTemperatura(valorTemperatura);
						
						int respTemperatura = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
						if(JOptionPane.OK_OPTION == respTemperatura) {
							break;
						}else { 
							JOptionPane.showMessageDialog(null, "Adios");
							System.exit(0);
						}
			}
		}
	}
}
