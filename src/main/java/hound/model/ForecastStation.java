package hound.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;

public class ForecastStation{
	
//	@Id
//	public int id;
	
	private String stationName;
	private String link;
	private int totalSpots;
	private List<ForecastSpot> spotsList;
	
	public ForecastStation(){}
	
	public ForecastStation(String stationName, String link){
		this.stationName = stationName;
		this.link = link;
	}
	
	public ForecastStation(String stationName, String link, List spotsList){
		this.stationName = stationName;
		this.link = link;
		this.spotsList = spotsList;
	}
	
	
	@Override
	public String toString(){
		return String.format("Forecast Station[Name: '%s', Link: '%s', Spots: '%s']", stationName, link, spotsList);
				}
}
