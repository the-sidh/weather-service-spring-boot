package br.com.sidh.weather.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sidh.weather.VO.Coordinate;
import br.com.sidh.weather.VO.Temperature;
import br.com.sidh.weather.services.WeatherService;
import br.com.sidh.weather.services.impl.darksky.WeatherServiceDarkSky;
import br.com.sidh.weather.services.impl.fake.WeatherServiceFake;

@RestController
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class WeatherController {

	public WeatherController() {
	}

	@GetMapping("/weather")
	Temperature getWeather(HttpServletRequest requestO) {
		String role = (String) requestO.getAttribute("role");
		if (role != null) {
			WeatherService service = role.equals("creator") ? new WeatherServiceDarkSky() : new WeatherServiceFake();
			Double temperature = service.getTemperature(new Coordinate(22, 22));
			Double apparentTemperature = service.getApparentTemperature(new Coordinate(22, 22));

			return new Temperature(temperature, apparentTemperature);
		}
		return null;
	}

}
