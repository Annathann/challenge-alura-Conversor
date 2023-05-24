package Monedas;

import javax.swing.JOptionPane;

public class OpcionesMonedas {
	

	ConversorMonedas monedas = new ConversorMonedas();
	
	public void ConversorMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije el tipo de cambio que desea convertir su dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					   {"De Soles a Dólar", 
						"De Soles a Euro", 
						"De Soles a Libras Esterlinas", 
						"De Soles a Yen Japonés", 
						"De Soles a Won sub-coreano", 
						"De Dólar a Soles", 
						"De Euro a Soles", 
						"De Libras Esterlinas a Soles", 
						"De Yen Japonés a Soles", 
						"De Won sur-coreano a Soles"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Soles a Dólar": 
		monedas.ConvertirSolPeruano_Dolares(valor);
		break;
	
	case "De Soles a Euro": 
		monedas.ConvertirSolPeruano_Euros(valor);
		break;
		
	case "De Soles a Libras Esterlinas":
		monedas.ConvertirSolPeruano_Libra(valor);
		break;
		
	case "De Soles a Yen Japonés":
		monedas.ConvertirSolPeruano_Yen(valor);
		break;
		
	case "De Soles a Won su-coreano":
		monedas.ConvertirSolPeruano_Won(valor);
		break;
	
	case "De Dólar a Soles":
		monedas.ConvertirSolPeruano_Dolares(valor);
		break;
		
	case "De Euro a Soles":
		monedas.ConvertirSolPeruano_Euros(valor);
		break;
		
	case "De Libras Esterlinas a Soles":
		monedas.ConvertirSolPeruano_Libra(valor);
		break;
	 
	case "De Yen Japonés a Soles":
		monedas.ConvertirSolPeruano_Yen(valor);
		break;
		
	case "De Won sur-coreano a Soles":
		monedas.ConvertirSolPeruano_Won(valor);
		break;
	}
	}

}
