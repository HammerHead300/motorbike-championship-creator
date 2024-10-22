package data.game.bikeSim.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import data.game.bikeSim.model.Track;

//Class to create the methods that use specific fields of the Track Class so Spring recognize the call
public interface TrackRepo extends JpaRepository<Track, Long> {
	
	void deleteTrackById(Long id);
	
	Optional<Track> findTrackById(Long id);
}
