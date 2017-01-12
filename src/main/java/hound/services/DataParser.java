package hound.services;

import java.util.Arrays;
import java.util.List;

import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import hound.model.WeatherSpotInfo;

public class DataParser {

	public static List<WeatherSpotInfo> getParsedData(Document weatherPageResponse) {
		List<WeatherSpotInfo> data = null;

		Elements scriptElements = weatherPageResponse.getElementsByTag("script");
		for (Element element : scriptElements) {
			for (DataNode dataNode : element.dataNodes()) {
				if (dataNode.toString().startsWith("var wg_fcst_tab_data_1")) {
					List<String> jsonObjList = Arrays.asList(dataNode.getWholeData().split(";"));
					String weatherDataString = jsonObjList.get(0).replaceFirst("^[^{]+", "");
					System.out.println(weatherDataString);
				}
			}
		}
		return data;
	}

}
