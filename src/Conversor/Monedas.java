package Conversor;

public class Monedas {

	private String monedaDe;
	private String nombre;
	private double cambio;
	private String moneda;

	public Monedas(String nombre, double cambio, String monedaDe, String moneda) {
		this.nombre = nombre;
		this.cambio = cambio;
		this.moneda = moneda;
		this.monedaDe = monedaDe;
	}

	public String getMonedaDe() {
		return monedaDe;
	}

	public void setMonedaDe(String monedaDe) {
		this.monedaDe = monedaDe;
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

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getConvert(double valor) {
		double resultado = (valor * this.cambio);
		resultado = (double) Math.round(resultado * 100d) / 100;
		return valor + " " + this.monedaDe + " equivalen a " + resultado + " " + this.moneda;
	}

}