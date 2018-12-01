package br.com.sidh.weather.services.impl.darksky.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currently {

	private Double temperature;
	private Double apparentTemperature;

	public Currently() {
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getApparentTemperature() {
		return apparentTemperature;
	}

	public void setApparentTemperature(Double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	@Override
	public String toString() {
		return "currently" + "temperature='" + temperature + '\'' + ", apparentTemperature=" + apparentTemperature
				+ '}';
	}

}
