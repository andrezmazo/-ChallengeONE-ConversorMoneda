package Conversor;

public class Temperaturas {
	private String temperaturaDe;
	private String nombre;
	private int cambio;
	private String temperaturaFinal;

	public Temperaturas(String nombre, int cambio, String temperaturaDe, String temperaturaFinal) {
		this.nombre = nombre;
		this.cambio = cambio;
		this.temperaturaFinal = temperaturaFinal;
		this.temperaturaDe = temperaturaDe;
	}

	public String getTemperaturaDe() {
		return temperaturaDe;
	}

	public void setTemperaturaDe(String temperaturaDe) {
		this.temperaturaDe = temperaturaDe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public String getTemperaturaFinal() {
		return temperaturaFinal;
	}

	public void setTemperaturaFinal(String temperaturaFinal) {
		this.temperaturaFinal = temperaturaFinal;
	}

	public String getConvert(double valor) {
		double resultado = 0;
		switch (this.cambio) {
		case 1:
			resultado = (valor * 1.8 + 32);
			break;
		case 2:
			resultado = ((valor - 32)/1.8 );
			break;
		case 3:
			resultado = (valor -273.15);
			break;
		case 4:
			resultado = (valor + 273.15);
			break;
		case 5:
			resultado = ((5/9)*(valor - 32) + 273.15);
			break;
		case 6:
			resultado = (1.8*(valor -273.15)+ 32);
			break;
		}
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " " + this.temperaturaDe + " equivalen a " + resultado + " " + this.temperaturaFinal;
	}

}