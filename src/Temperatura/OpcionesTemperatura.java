package Temperatura;

import javax.swing.JOptionPane;


public class OpcionesTemperatura {


	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	
	public void ConversorTemperatura(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije a que temperatura desea convertir",  "Temperaturas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{	"De Celsius a Fahrenheit", 
						"De Celsius a Kelvin", 
						"De Celsius a Rankine", 
						"De Fahrenheit a Celsius", 
						"De Fahrenheit a Kelvin", 
						"De Fahrenheit a Rankine",
						"De Kelvin a Celsius", 
						"De Kelvin a Fahrenheit", 
						"De Kelvin a Rankine", 
						"De Rankine a Celsius", 
						"De Rankine a Fahrenheit", 
						"De Rankine a Kelvin"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Celsius a Fahrenheit":
		temperatura.ConvertirCelsius_Fahrenheit(valor);
		break;
	
	case "De Celsius a Kelvin": 
		temperatura.ConvertirCelisus_Kelvin(valor);
		break;
		
	case "De Celsius a Rankine":
		temperatura.ConvertirCelsius_Rankine(valor);
		break;
		
	case "De Fahrenheit a Celsius":
		temperatura.ConvertirFahrenheit_Celsius(valor);
		break;
		
	case "De Fahrenheit a Kelvin":
		temperatura.ConvertirFahrenheit_Kelvin(valor);
		break;
	
	case "De Fahrenheit a Rankine":
		temperatura.ConvertirFahrenheit_Rankine(valor);
		break;
		
	case "De Kelvin a Celsius":
		temperatura.ConvertirKelvin_Celsius(valor);
		break;
		
	case "De Kelvin a Fahrenheit":
		temperatura.ConvertirKelvin_Fahrenheit(valor);
		break;
	 
	case "De Kelvin a Rankine":
		temperatura.ConvertirKelvin_Rankine(valor);
		break;
		
	case "De Rankine a Celsius":
		temperatura.ConvertirRankine_Celsius(valor);
		break;
		
	case "De Rankine a Fahrenheit":
		temperatura.ConvertirRankine_Fahrenheit(valor);
		break;
		
	case "De Rankine a Kelvin":
		temperatura.ConvertirRankine_Kelvin(valor);
		break;
	}
	}
	
}
