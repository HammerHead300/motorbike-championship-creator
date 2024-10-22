package data.game.bikeSim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.game.bikeSim.exception.TrackNotFoundException;
import data.game.bikeSim.model.Track;
import data.game.bikeSim.repo.TrackRepo;

@Service
public class TrackService {
	
private final TrackRepo trackRepo;
	
	@Autowired
	public TrackService(TrackRepo trackRepo) {
		this.trackRepo = trackRepo;
	}
	
	//Method that adds a track to the database
	public Track addTrack(Track track) {
		return trackRepo.save(track);
	}
	
	//Method that shows every track on the database
	public List<Track> findAllTracks() {
		return trackRepo.findAll();
	}
	
	//Method that modifies fields of a track
	public Track updateTrack(Track track) {
		return trackRepo.save(track);
	}
	
	//Method that shows a track by id
	public Track findTrackById(Long id) {
		return trackRepo.findTrackById(id).orElseThrow(() -> new TrackNotFoundException ("Track with id = " + id + " was not found"));
	}
	
	//Method that deletes a track by id
	public void deleteTrack(Long id) {
		trackRepo.deleteTrackById(id);
	}
}