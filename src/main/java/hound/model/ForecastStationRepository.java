package hound.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastStationRepository extends MongoRepository<ForecastStation, String> {

	public ForecastStation findByStationName(String stationName);

}
