package data.game.bikeSim;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.game.bikeSim.model.Track;
import data.game.bikeSim.service.TrackService;

//Class that creates the mapping for the Track class
@RestController
@RequestMapping("/track")
public class TrackResource {
	private final TrackService trackService;
	
	public TrackResource(TrackService trackService) {
		this.trackService = trackService;
	}
	
	//Mapping that shows every track of the championship
	@GetMapping("/find/all")
	public ResponseEntity<List<Track>> getAllTracks (){
		List<Track> tracks = trackService.findAllTracks();
		return new ResponseEntity<>(tracks, HttpStatus.OK);
	}
	//Mapping that shows the track of a specific id
	@GetMapping("/find/{id}")
	public ResponseEntity<Track> getTrackById (@PathVariable("id") Long id){
		Track track= trackService.findTrackById(id);
		return new ResponseEntity<>(track, HttpStatus.OK);
	}
	
	//Mapping that adds a Track
	@PostMapping("/add")
	public ResponseEntity<Track> addTrack(@RequestBody Track track) {
		Track newTrack = trackService.addTrack(track);
		return new ResponseEntity<>(newTrack, HttpStatus.CREATED);
	}
	
	//Mapping that allows to change a track info
	@PutMapping("/update")
	public ResponseEntity<Track> updateTrack(@RequestBody Track track) {
		Track updatedTrack = trackService.updateTrack(track);
		return new ResponseEntity<>(updatedTrack, HttpStatus.OK);
	}
	
	//Mapping that allows you to delete a track of a specific id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTrack(@PathVariable("id") Long id) {
		trackService.deleteTrack(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
