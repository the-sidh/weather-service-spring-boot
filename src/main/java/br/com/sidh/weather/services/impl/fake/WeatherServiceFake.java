package br.com.sidh.weather.services.impl.fake;

import br.com.sidh.weather.VO.Coordinate;
import br.com.sidh.weather.services.WeatherService;

public class WeatherServiceFake implements WeatherService {

	@Override
	public Double getTemperature(Coordinate coordinate) {
		return 25d;
	}

	@Override
	public Double getApparentTemperature(Coordinate coordinate) {
		return 18d;
	}

}
