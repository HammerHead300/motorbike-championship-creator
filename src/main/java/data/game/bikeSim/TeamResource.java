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

import data.game.bikeSim.service.TeamService;
import data.game.bikeSim.model.Team;

//Class that creates the mapping for the Team class
@RestController
@RequestMapping("/team")
public class TeamResource {
	private final TeamService teamService;

	public TeamResource(TeamService teamService) {
		this.teamService = teamService;
	}
	
	//Mapping that shows every team of the championship
	@GetMapping("/find/all")
	public ResponseEntity<List<Team>> getAllTeams (){
		List<Team> teams = teamService.findAllTeams();
		return new ResponseEntity<>(teams, HttpStatus.OK);
	}
	
	//Mapping that shows the team of a specific id
	@GetMapping("/find/{id}")
	public ResponseEntity<Team> getTeamById (@PathVariable("id") Long id){
		Team team= teamService.findTeamById(id);
		return new ResponseEntity<>(team, HttpStatus.OK);
	}
	
	//Mapping that adds a Team
	@PostMapping("/add")
	public ResponseEntity<Team> addTeam(@RequestBody Team team) {
		Team newTeam = teamService.addTeam(team);
		return new ResponseEntity<>(newTeam, HttpStatus.CREATED);
	}
	
	//Mapping that allows to change a team info
	@PutMapping("/update")
	public ResponseEntity<Team> updateTeam(@RequestBody Team team) {
		Team updatedTeam = teamService.updateTeam(team);
		return new ResponseEntity<>(updatedTeam, HttpStatus.OK);
	}
	
	//Mapping that allows you to delete a team of a specific id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTeam(@PathVariable("id") Long id) {
		teamService.deleteTeam(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
