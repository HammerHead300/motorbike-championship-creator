package data.game.bikeSim.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.game.bikeSim.exception.TeamNotFoundException;
import data.game.bikeSim.model.Team;
import data.game.bikeSim.repo.TeamRepo;

@Service
public class TeamService {
	private final TeamRepo teamRepo;
	
	@Autowired
	public TeamService(TeamRepo teamRepo) {
		this.teamRepo = teamRepo;
	}
	
	//Method that adds a team to the database
	public Team addTeam(Team team) {
		return teamRepo.save(team);
	}
	
	//Method that shows every team on the database
	public List<Team> findAllTeams() {
		return teamRepo.findAll();
	}
	
	//Method that modifies fields on a team
	public Team updateTeam(Team team) {
		return teamRepo.save(team);
	}
	
	//Method that shows a team by id
	public Team findTeamById(Long id) {
		return teamRepo.findTeamById(id).orElseThrow(() -> new TeamNotFoundException ("Team with id = " + id + " was not found"));
	}
	
	//Method that deletes a team by id
	public void deleteTeam(Long id) {
		teamRepo.deleteTeamById(id);
	}
}
