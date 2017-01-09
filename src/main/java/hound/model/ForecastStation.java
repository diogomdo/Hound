package hound.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;

public class ForecastStation {

	// @Id
	// public int id;

	private String stationName;
	private String link;
	private int totalSpots;
	private List<ForecastSpot> spotsList;

	public ForecastStation() {
	}

	public ForecastStation(String stationName, String link) {
		this.stationName = stationName;
		this.link = link;
	}

	public ForecastStation(String stationName, String link, List spotsList) {
		this.stationName = stationName;
		this.link = link;
		this.spotsList = spotsList;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getTotalSpots() {
		return totalSpots;
	}

	public void setTotalSpots(int totalSpots) {
		this.totalSpots = totalSpots;
	}

	public List<ForecastSpot> getSpotsList() {
		return spotsList;
	}

	public void setSpotsList(List<ForecastSpot> spotsList) {
		this.spotsList = spotsList;
	}

	@Override
	public String toString() {
		return String.format("Forecast Station[Name: '%s', Link: '%s', Spots: '%s']", stationName, link, spotsList);
	}
}
