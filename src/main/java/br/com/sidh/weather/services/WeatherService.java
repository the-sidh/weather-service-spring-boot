package br.com.sidh.weather.services;

import br.com.sidh.weather.VO.Coordinate;

public interface WeatherService {

	public Double getTemperature(Coordinate coordinate);
	public Double getApparentTemperature(Coordinate coordinate);
	
}
