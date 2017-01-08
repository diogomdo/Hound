package hound.services;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import hound.model.ForecastStation;
import hound.model.WeatherSpotInfo;

public class DataGatherer {

	public static List<WeatherSpotInfo> getDataRequest(String link) {
		Document pageResponse = null;
		final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36";
		final String url = link;
		try {
			pageResponse = Jsoup.connect(url).userAgent(USER_AGENT).get();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return DataParser.getParsedData(pageResponse);
	}

}
