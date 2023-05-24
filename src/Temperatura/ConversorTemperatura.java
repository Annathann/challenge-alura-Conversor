package Temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	
	public void ConvertirCelsius_Fahrenheit(double valor) {
		double CFahrenheit = (valor * 1.8) + 32;
		CFahrenheit = (double)Math.round(CFahrenheit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + CFahrenheit + "°F Fahrenheit");
	}
	public void ConvertirCelisus_Kelvin(double valor) {
		double CKelvin = valor + 273.15;
		CKelvin = (double)Math.round(CKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + CKelvin + "°K  Kelvin");
	}
	public void ConvertirCelsius_Rankine(double valor) {
		double CRankine = (valor * 1.8) + 491.67;
		CRankine = (double)Math.round(CRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + CRankine + "°R Rankine");
	}
	
	
	
	public void ConvertirFahrenheit_Celsius(double valor) {
		double FCelsius = (valor - 32) * ( 0.556 );
		FCelsius = (double)Math.round(FCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + FCelsius + "°C Celsius");
	}
	public void ConvertirFahrenheit_Kelvin(double valor) {
		double FKelvin = (valor + 459.67)*(0.556);
		FKelvin = (double)Math.round(FKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + FKelvin + "°K Kelvin");
	}
	public void ConvertirFahrenheit_Rankine(double valor) {
		double FRankine = valor + 459.67;
		FRankine = (double)Math.round(FRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + FRankine + "°R Rankine");
	}
	
	
	public void ConvertirKelvin_Celsius(double valor) {
		double KCelsius = valor - 273.15;
		KCelsius = (double)Math.round(KCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + KCelsius + "°C Celsius");
	}
	public void ConvertirKelvin_Fahrenheit(double valor) {
		double KFahrenhit = ((valor - 273.15) * (1.8)) + 32;
		KFahrenhit = (double)Math.round(KFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + KFahrenhit + "°F Fahrenheit");
	}
	public void ConvertirKelvin_Rankine(double valor) {
		double KRankine = valor * 1.8 ;
		KRankine = (double)Math.round(KRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + KRankine + "°R Rankine");
	}
	
	
	public void ConvertirRankine_Celsius(double valor) {
		double RCelsius = (valor - 491.67) * (0.556);
		RCelsius = (double)Math.round(RCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + RCelsius + "°C Celsius");
	}
	public void ConvertirRankine_Fahrenheit(double valor) {
		double RFahrenhit = valor - 459.67;
		RFahrenhit = (double)Math.round(RFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + RFahrenhit + "°F Fahrenheit");
	}
	public void ConvertirRankine_Kelvin(double valor) {
		double RKelvin = valor * (0.556);
		RKelvin = (double)Math.round(RKelvin* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Resultado : " + RKelvin + "°K Kelvin");
	}
}
