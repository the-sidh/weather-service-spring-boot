package br.com.sidh.weather.VO;

public class Temperature {

	private double temperature;
	private double apparentTemperature;

	public Temperature(double temperature, double apparentTemperature) {
		super();
		this.temperature = temperature;
		this.apparentTemperature = apparentTemperature;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getApparentTemperature() {
		return apparentTemperature;
	}

	public void setApparentTemperature(double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

}
