package br.com.sidh.weather.services.impl.darksky.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DSResponse {
	
	private Currently currently;
	
	public DSResponse() {
	}
		
	public DSResponse(Currently currently) {
		super();
		this.currently = currently;
	}

	public Currently getCurrently() {
		return currently;
	}

	public void setCurrently(Currently currently) {
		this.currently = currently;
	}
	
	

}
