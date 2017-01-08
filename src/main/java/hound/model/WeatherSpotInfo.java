package hound.model;

public class WeatherSpotInfo {

	private int spotId;
	private final Integer day;
	private final Integer hour;
	private final String windDirection;
	private final Integer precipitation;
	private final Integer temperature;
	private final String nebulosityLevel;

	public WeatherSpotInfo(Integer day, Integer hour, String windDirection, Integer precipitation, Integer temperature,
			String nebulosityLevel) {
		this.day = day;
		this.hour = hour;
		this.windDirection = windDirection;
		this.precipitation = precipitation;
		this.temperature = temperature;
		this.nebulosityLevel = nebulosityLevel;
	}

	public WeatherSpotInfo(Integer day, Integer precipitation) {
		this.day = day;
		this.hour = null;
		this.windDirection = null;
		this.precipitation = precipitation;
		this.temperature = null;
		this.nebulosityLevel = null;
	}

}
