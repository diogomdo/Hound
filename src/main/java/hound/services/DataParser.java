package hound.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import hound.model.WeatherSpotInfo;

public class DataParser {

	public enum StatusType {
		RH, SMERN, LCDC, initdate, id_model, model_name, hr_d, init_h, HCDC, SLP, hr_h, GUST, init_dm, update_last, FLHGT, 
		init_d, APCP, TMP, hours, initstr, WINDSPD, TCDC, TMPE, img_param, initstamp, img_var_map, PCPT, MCDC, update_next,
		WINDDIR, hr_weekday;
	}

	public static List<WeatherSpotInfo> getParsedData(Document weatherPageResponse) {
		List<WeatherSpotInfo> data = null;
		JSONObject obj = null;
		Elements scriptElements = weatherPageResponse.getElementsByTag("script");
		for (Element element : scriptElements) {
			for (DataNode dataNode : element.dataNodes()) {
				if (dataNode.toString().startsWith("var wg_fcst_tab_data_1")) {
					List<String> jsonObjList = Arrays.asList(dataNode.getWholeData().split(";"));
					String weatherDataString = jsonObjList.get(0).replaceFirst("^[^{]+", "");
					System.out.println(weatherDataString);
					obj = new JSONObject(weatherDataString);
				}
			}
		}

		HashMap<String, ArrayList<Object>> parsableMap = JsonObjtToMap(obj);
		int cycleSize = parsableMap.get("RH").toString().length();
		for (int i = 0; i < cycleSize; i++) {
			for (StatusType s : StatusType.values()) {
				List<Object> statusColl = (List<Object>) parsableMap.get(s);
			}
		}

		return data;
	}

	public static HashMap<String, ArrayList<Object>> JsonObjtToMap(JSONObject obj) {

		// http://stackoverflow.com/questions/14898768/how-to-access-nested-elements-of-json-object-using-getjsonarray-method
		HashMap<String, ArrayList<Object>> map = new HashMap<String, ArrayList<Object>>();
		try {

			JSONObject accessWF = obj.getJSONObject("fcst");
			JSONObject weatherFactors = accessWF.getJSONObject("3");

			Iterator iterator = weatherFactors.keys();
			String key = null;

			while (iterator.hasNext()) {
				key = (String) iterator.next();
				if (key != null)
					map.put(key, (ArrayList<Object>) weatherFactors.get(key));
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

}
