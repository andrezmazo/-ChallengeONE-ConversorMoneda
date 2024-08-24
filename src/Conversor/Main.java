package Conversor;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String monedaString = "";
		double monedaConvertir = 0;
		String temperaturaString = "";
		double temperaturaConvertir = 0;

                Map<String, Monedas> monedaMap = crearMonedaMap();
                Map<String, Temperaturas> temperaturaMap = crearTemperaturaMap();

	
		
		Object[] opMenu = { "Conversor de Moneda", "Conversor de Temperatura" };
		Object[] opMonedas = { "De COP a Dolares", "De COP a Euros", "De COP a Libras Esterlinas",
				"De COP a Yen Japonés", "De COP a Won sul-coreano", "De Dolares a COP", "De Euros a COP",
				"De Libras Esterlinas a COP", "De Yen Japonés COP", "De Won sul-coreano a COP" };
		Object[] opTemperaturas = {"Celsios a Fahrenheit","Fahrenheit a Celsios","Kelvin a Celsios","Celsios a Kelvin","Fahrenheit a Kelvin","Kelvin a Fahrenheit"};

		boolean flag = true;
                
		while (flag) {
			String option = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, opMenu, opMenu[0]);

			switch (option) {
			case "Conversor de Moneda":
				String optionMonedas = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión",
						"Menu", JOptionPane.INFORMATION_MESSAGE, null, opMonedas, opMonedas[0]);

				monedaString = (String) JOptionPane.showInputDialog("Ingrese valor de moneda que desee convertir");
				monedaConvertir = Double.parseDouble(monedaString);

				JOptionPane.showMessageDialog(null, monedaMap.get(optionMonedas).getConvert(monedaConvertir));
				
			case "Conversor de Temperatura":
				String optionTemperaturas = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión",
						"Menu", JOptionPane.INFORMATION_MESSAGE, null, opTemperaturas, opTemperaturas[0]);

				temperaturaString = (String) JOptionPane.showInputDialog("Ingrese valor de temperatura que desee convertir");
				temperaturaConvertir = Double.parseDouble(temperaturaString);

				JOptionPane.showMessageDialog(null, temperaturaMap.get(optionTemperaturas).getConvert(temperaturaConvertir));
			}

			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion?",
					option, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (JOptionPane.OK_OPTION == respuesta) {
			} else {
				flag = false;
			}
		}
    }
    
     private static Map<String, Monedas> crearMonedaMap() {
        Map<String, Monedas> monedaMap = new HashMap<>();
        monedaMap.put("De COP a Dolares", new Monedas("De COP a Dolares", 0.00021, "COP", "Dolares"));
        monedaMap.put("De COP a Euros", new Monedas("De COP a Euros", 0.00020, "COP", "Euros"));
        monedaMap.put("De COP a Libras Esterlinas", new Monedas("De COP a Libras Esterlinas", 0.00017, "COP", "Libras"));
        monedaMap.put("De COP a Yen Japonés", new Monedas("De COP a Yen Japonés", 0.028, "COP", "Yen Japonés"));
        monedaMap.put("De COP a Won sul-coreano", new Monedas("De COP a Won sul-coreano", 0.27, "COP", "Won sul-coreano"));
        monedaMap.put("De Dolares a COP", new Monedas("De Dolares a COP", 4764.71, "Dolares", "COP"));
        monedaMap.put("De Euros a COP", new Monedas("De Euros a COP", 5134.22, "Euros", "COP"));
        monedaMap.put("De Libras Esterlinas a COP", new Monedas("De Libras Esterlinas a COP", 5802.23, "Libras Esterlinas", "COP"));
        monedaMap.put("De Yen Japonés COP", new Monedas("De Yen Japonés COP", 36.15, "Yen Japonés", "COP"));
        monedaMap.put("De Won sul-coreano a COP", new Monedas("De Won sul-coreano a COP", 3.70, "Won sul-coreano", "COP"));
        return monedaMap;
    }

    private static Map<String, Temperaturas> crearTemperaturaMap() {
        Map<String, Temperaturas> temperaturaMap = new HashMap<>();
        temperaturaMap.put("Celsios a Fahrenheit", new Temperaturas("Celsios a Fahrenheit", new CelsiosAFahrenheit(), "ºC", "ºF"));
        temperaturaMap.put("Fahrenheit a Celsios", new Temperaturas("Fahrenheit a Celsios", new FahrenheitACelsios(), "ºF", "ºC"));
        temperaturaMap.put("Kelvin a Celsios", new Temperaturas("Kelvin a Celsios", new KelvinACelsios(), "ºK", "ºC"));
        temperaturaMap.put("Celsios a Kelvin", new Temperaturas("Celsios a Kelvin", new CelsiosAKelvin(), "ºC", "ºK"));
        temperaturaMap.put("Fahrenheit a Kelvin", new Temperaturas("Fahrenheit a Kelvin", new FahrenheitAKelvin(), "ºF", "ºK"));
        temperaturaMap.put("Kelvin a Fahrenheit", new Temperaturas("Kelvin a Fahrenheit", new KelvinAFahrenheit(), "ºK", "ºF"));
    
        return temperaturaMap;
    }
}
