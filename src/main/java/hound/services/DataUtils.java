package hound.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

public class DataUtils {

public <T> List<T> toArrayList(org.json.JSONArray dataColl) {
		
		List<T> list = new ArrayList();
		try {
			if (dataColl != null){
				for (int i=0; i<dataColl.length(); i++) {
				   
						if (dataColl.get(i) instanceof String){
							
						}else if ((dataColl.get(i) instanceof Float)){
							
						}
				}	
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}

