package hound.model;

import java.util.List;

import hound.services.DataGatherer;

public class ForecastSpot {
	
	private String spotName;
	private String spotId;
	private String coordinates;
	
	public ForecastSpot() {}
	
	public ForecastSpot(String spotName, String spotId){
		this.spotId = spotId;
		this.spotName = spotName;
	}
	
	public List<WeatherSpotInfo> getWeatherData(){
		return DataGatherer.getDataRequest(spotId);
	}
	
	@Override
	public String toString(){
		return String.format("Spot [Name: '%s', ID: '%s']", spotName, spotId);
	}
}
