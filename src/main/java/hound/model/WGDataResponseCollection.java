package hound.model;

import java.util.List;

import org.json.simple.JSONArray;
import hound.services.DataUtils;

public class WGDataResponseCollection {
	
		private String spot;
		private String md5chk;
		private String sunrise;
		private String sunset;
		
		private org.json.JSONArray rh;
		private org.json.JSONArray smern;
		private org.json.JSONArray lcdc;
		private Integer id_model;
		private String initdate;
		private String modelName;
		private org.json.JSONArray hr_d;
		private org.json.JSONArray hcdc;
		private String init_h;
		private org.json.JSONArray slp;
		private org.json.JSONArray hr_h;
		private org.json.JSONArray gust;
		private String init_dm;
		private String updateLast;
		private org.json.JSONArray flhgt;
		private String initD;
		private org.json.JSONArray apcp;
		private org.json.JSONArray tmp;
		private org.json.JSONArray hours;
		private String initstr;
		private org.json.JSONArray windSpd;
		private org.json.JSONArray tcdc;
		private org.json.JSONArray tmpe;
		private org.json.JSONArray mcdc;
		private org.json.JSONArray pcpt;
		private org.json.JSONArray windDir;
		private String updateNext;
		private org.json.JSONArray hourWeekday;
		
		
		public String getSpot() {
			return spot;
		}
		public void setSpot(String spot) {
			this.spot = spot;
		}
		public String getMd5chk() {
			return md5chk;
		}
		public void setMd5chk(String md5chk) {
			this.md5chk = md5chk;
		}
		public String getSunrise() {
			return sunrise;
		}
		public void setSunrise(String sunrise) {
			this.sunrise = sunrise;
		}
		public String getSunset() {
			return sunset;
		}
		public void setSunset(String sunset) {
			this.sunset = sunset;
		}
		
		public org.json.JSONArray getRh() {
			return rh;
		}
		
		public List<Integer> getRhFormated() {
			return new DataUtils().toArrayList(getRh());
		}
		
		public void setRh(org.json.JSONArray rh) {
				this.rh = rh;
		}
		
		
		public org.json.JSONArray getSmern() {
			return smern;
		}
		public void setSmern(org.json.JSONArray smern) {
			this.smern = smern;
		}
		public List<Integer> getSmernFormated() {
			return new DataUtils().toArrayList(getSmern());
		}
		
		public org.json.JSONArray getLcdc() {
			return lcdc;
		}
		public void setLcdc(org.json.JSONArray lcdc) {
			this.lcdc = lcdc;
		}
		public List<Integer> getLcdcFormated() {
			return new DataUtils().toArrayList(getLcdc());
		}
		public Integer getId_model() {
			return id_model;
		}
		public void setId_model(Integer id_model) {
			this.id_model = id_model;
		}
		public String getInitdate() {
			return initdate;
		}
		public void setInitdate(String initdate) {
			this.initdate = initdate;
		}
		public String getModel_name() {
			return modelName;
		}
		public void setModel_name(String modelName) {
			this.modelName = modelName;
		}
		public org.json.JSONArray getHr_d() {
			return hr_d;
		}
		public void setHr_d(org.json.JSONArray hr_d) {
			this.hr_d = hr_d;
		}
		public List<Integer> getHr_dFormated() {
			return new DataUtils().toArrayList(getHr_d());
		}
		
		public org.json.JSONArray getHcdc() {
			return hcdc;
		}
		public void setHcdc(org.json.JSONArray hcdc) {
			this.hcdc = hcdc;
		}
		public List<Integer> getHcdcFormated() {
			return new DataUtils().toArrayList(getHcdc());
		}
		
		public String getInit_h() {
			return init_h;
		}
		public void setInit_h(String init_h) {
			this.init_h = init_h;
		}
		public org.json.JSONArray getSlp() {
			return slp;
		}
		public void setSlp(org.json.JSONArray slp) {
			this.slp = slp;
		}
		public List<Integer> getSlpFormated() {
			return new DataUtils().toArrayList(getSlp());
		}
		
		public org.json.JSONArray  getHr_h() {
			return hr_h;
		}
		public void setHr_h(org.json.JSONArray hr_h) {
			this.hr_h = hr_h;
		}
		public List<Integer> getHr_hFormated() {
			return new DataUtils().toArrayList(getHr_h());
		}
		
		public org.json.JSONArray getGust() {
			return gust;
		}
		public void setGust(org.json.JSONArray gust) {
			this.gust = gust;
		}
		public List<Float> getGustFormated() {
			return new DataUtils().toArrayList(getGust());
		}
		
		public String getInit_dm() {
			return init_dm;
		}
		public void setInit_dm(String init_dm) {
			this.init_dm = init_dm;
		}
		public String Update_last() {
			return updateLast;
		}
		public void setUpdate_last(String updateLast) {
			this.updateLast = updateLast;
		}
		public org.json.JSONArray getFlhgt() {
			return flhgt;
		}
		public void setFlhgt(org.json.JSONArray flhgt) {
			this.flhgt = flhgt;
		}
		public List<Integer> getRFlhgtFormated() {
			return new DataUtils().toArrayList(getFlhgt());
		}
		
		public String getInit_d() {
			return initD;
		}
		public void setInit_d(String initD) {
			this.initD = initD;
		}
		public org.json.JSONArray getApcp() {
			return apcp;
		}
		public void setApcp(org.json.JSONArray apcp) {
			this.apcp = apcp;
		}
		public List<Float> getAPCPFormated() {
			return new DataUtils().toArrayList(getApcp());
		}
		
		
		public org.json.JSONArray getTmp() {
			return tmp;
		}
		public void setTmp(org.json.JSONArray tmp) {
			this.tmp = tmp;
		}
		public List<Float> getTmpFormated() {
			return new DataUtils().toArrayList(getTmp());
		}
		
		
		public org.json.JSONArray getHours() {
			return hours;
		}
		public void setHours(org.json.JSONArray hours) {
			this.hours = hours;
		}
		public List<Integer> getHoursFormated() {
			return new DataUtils().toArrayList(getHours());
		}
		
		public String getInitstr() {
			return initstr;
		}
		public void setInitstr(String initstr) {
			this.initstr = initstr;
		}

		public org.json.JSONArray getwindspd() {
			return windSpd;
		}
		public void setwindspd(org.json.JSONArray windSpd) {
			this.windSpd = windSpd;
		}
		public List<Float> getWindSpdFormated() {
			return new DataUtils().toArrayList(getwindspd());
		}
		
		public org.json.JSONArray getTcdc() {
			return tcdc;
		}
		public void setTcdc(org.json.JSONArray tcdc) {
			this.tcdc = tcdc;
		}
		public List<Integer> getTcdcFormated() {
			return new DataUtils().toArrayList(getTcdc());
		}
		
		public org.json.JSONArray getTmpe() {
			return tmpe;
		}
		public void setTmpe(org.json.JSONArray tmpe) {
			this.tmpe = tmpe;
		}
		public List<Float> getTmpeFormated() {
			return new DataUtils().toArrayList(getTmpe());
		}
		
		public org.json.JSONArray getMcdc() {
			return mcdc;
		}
		public void setMcdc(org.json.JSONArray mcdc) {
			this.mcdc = mcdc;
		}
		public List<Integer> getMcdcFormated() {
			return new DataUtils().toArrayList(getMcdc());
		}
		
		public org.json.JSONArray getPcpt() {
			return pcpt;
		}
		public void setPcpt(org.json.JSONArray pcpt) {
			this.pcpt = pcpt;
		}
		public List<Integer> getPcptFormated() {
			return new DataUtils().toArrayList(getPcpt());
		}
		
		public org.json.JSONArray getwinddir() {
			return windDir;
		}
		public void setwinddir(org.json.JSONArray windDir) {
			this.windDir = windDir;
		}
		public List<Integer> getWindDirFormated() {
			return new DataUtils().toArrayList(getwinddir());
		}
		
		public String getupdate_next() {
			return updateNext;
		}
		public void setupdate_next(String updateNext) {
			this.updateNext = updateNext;
		}
		public org.json.JSONArray gethr_weekday() {
			return hourWeekday;
		}
		public void sethr_weekday(org.json.JSONArray hourWeekday) {
			this.hourWeekday = hourWeekday;
		}
		public List<Integer> getHourWeekdayFormated() {
			return new DataUtils().toArrayList(gethr_weekday());
		}
		

}
