package hound.model;

import java.util.List;
import hound.services.WeatherWGHttpReq;

public class ForecastSpot {
	
	private String spotName;
	private int spotId;
	private String coordinates;
	
	ForecastSpot(int spotId){
		this.spotId = spotId;		
	}
	
	public List<WeatherSpotInfo> getWeatherData(){
		return WeatherWGHttpReq.getWeatherData(spotId);
	}
}
