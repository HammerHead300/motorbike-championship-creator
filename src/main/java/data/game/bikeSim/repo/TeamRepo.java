package data.game.bikeSim.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import data.game.bikeSim.model.Team;

//Class to create the methods that use specific fields of the Team Class so Spring recognize the call
public interface TeamRepo extends JpaRepository<Team, Long>{

	void deleteTeamById(Long id);

	Optional<Team> findTeamById(Long id);

}
