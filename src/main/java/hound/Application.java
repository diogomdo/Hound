package hound;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import hound.model.ForecastSpot;
import hound.model.ForecastSpotRepository;
import hound.model.ForecastStation;
import hound.model.ForecastStationRepository;
import hound.services.DataGatherer;

@ComponentScan
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ForecastStationRepository stationRepo;
	@Autowired
	private ForecastSpotRepository spotRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... args) throws Exception {

		// repo.deleteAll();
		//
		// repo.save(new ForecastStation("windguru", "https://www.windguru.cz/",
		// new ArrayList<ForecastSpot>() {
		// {
		// add(new ForecastSpot("Loures - Ikea", "294783"));
		// }
		// }));
		//
		// repo.save(new ForecastStation("meteoblue",
		// "https://www.meteoblue.com/en/weather/forecast/week"));

		System.out.println("All Forecast stations on db");
		System.out.println("-----------------------------");

		for (ForecastStation station : stationRepo.findAll()) {
			System.out.println(station);
			if (station.getSpotsList() != null) {
				for (ForecastSpot spot : station.getSpotsList())
					spot.getWeatherData(station.getLink());
			}
		}
	}
}
