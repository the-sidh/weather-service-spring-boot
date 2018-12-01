package br.com.sidh.weather.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	public WebSecurity() {
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/*").addFilter(new JWTAuthorizationFilter(authenticationManager()));
	}
}