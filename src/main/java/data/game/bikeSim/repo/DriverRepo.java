package data.game.bikeSim.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import data.game.bikeSim.model.Driver;

//Class to create the methods that use specific fields of the Driver Class so Spring recognize the call
public interface DriverRepo extends JpaRepository<Driver, Long>{
	
	void deleteDriverById(Long id);
	
	Optional<Driver> findDriverById(Long id);
	
}