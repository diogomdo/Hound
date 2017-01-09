package hound.services;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import hound.model.WeatherSpotInfo;

public class DataParser {

	public static List<WeatherSpotInfo> getParsedData(Document weatherPageResponse) {
		List<WeatherSpotInfo> data = null;
		weatherPageResponse.toString();
		
		Element table = weatherPageResponse.select("table[class=tabulka]").first();
		table.toString();
		return data;
	}

}
