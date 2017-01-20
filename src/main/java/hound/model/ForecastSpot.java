package hound.model;

import java.io.IOException;
import java.util.List;

import hound.services.DataGatherer;

public class ForecastSpot extends ForecastStation{

	private String spotName;
	private String spotId;
	private String coordinates;
	private List<WeatherSpotInfo> weatherInfoDetailList;

	public ForecastSpot() {
	}

	public ForecastSpot(String spotName, String spotId) {
		this.spotId = spotId;
		this.spotName = spotName;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public String getSpotId() {
		return spotId;
	}

	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public List<WeatherSpotInfo> getWeatherData(String link) {
		List<WeatherSpotInfo> val = null;
		try {
			return DataGatherer.getDataRequest(link.concat(spotId));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
	}

	public List<WeatherSpotInfo> getWeatherInfoDetailList() {
		return weatherInfoDetailList;
	}

	public void setWeatherInfoDetailList(List<WeatherSpotInfo> weatherInfoDetailList) {
		this.weatherInfoDetailList = weatherInfoDetailList;
	}

	@Override
	public String toString() {
		return String.format("Spot [Name: '%s', ID: '%s']", spotName, spotId);
	}
}
