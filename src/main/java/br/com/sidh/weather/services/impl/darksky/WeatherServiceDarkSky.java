package br.com.sidh.weather.services.impl.darksky;

import org.springframework.web.client.RestTemplate;

import br.com.sidh.weather.VO.Coordinate;
import br.com.sidh.weather.VO.Temperature;
import br.com.sidh.weather.services.WeatherService;
import br.com.sidh.weather.services.impl.darksky.request.Currently;
import br.com.sidh.weather.services.impl.darksky.request.DSResponse;

public class WeatherServiceDarkSky implements WeatherService {

	@Override
	public Double getTemperature(Coordinate coordinate) {
		Currently cur = queryDarkSky();
		return cur.getTemperature();
	}

	@Override
	public Double getApparentTemperature(Coordinate coordinate) {
		Currently cur = queryDarkSky();
		return cur.getApparentTemperature();
	}

	private Currently queryDarkSky() {
		RestTemplate restTemplate = new RestTemplate();
		DSResponse response = restTemplate.getForObject(
				"https://api.darksky.net/forecast/c2c92ee18c05ee06c78e98ab6ad0eadf/-23.533773,-46.62529",
				DSResponse.class);
		Currently cur = response.getCurrently();
		return cur;
	}

}
