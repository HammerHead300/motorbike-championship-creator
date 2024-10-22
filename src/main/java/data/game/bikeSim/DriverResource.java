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

import data.game.bikeSim.model.Driver;
import data.game.bikeSim.service.DriverService;

//Class that creates the mapping of the driver class
@RestController
@RequestMapping("/driver")
public class DriverResource {
	private final DriverService driverService;

	public DriverResource(DriverService driverService) {
		this.driverService = driverService;
	}
	
	//Mapping that shows every driver of the database
	@GetMapping("/find/all")
	public ResponseEntity<List<Driver>> getAllDrivers (){
		List<Driver> drivers = driverService.findAllDrivers();
		return new ResponseEntity<>(drivers, HttpStatus.OK);
	}
	
	//Mapping that shows the driver of a specific id
	@GetMapping("/find/{id}")
	public ResponseEntity<Driver> getDriverById (@PathVariable("id") Long id){
		Driver driver= driverService.findDriverById(id);
		return new ResponseEntity<>(driver, HttpStatus.OK);
	}
	
	//Mapping that adds a driver
	@PostMapping("/add")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
		Driver newDriver = driverService.addDriver(driver);
		return new ResponseEntity<>(newDriver, HttpStatus.CREATED);
	}
	
	//Mapping that allows to change a driver info
	@PutMapping("/update")
	public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver) {
		Driver updatedDriver = driverService.updateDriver(driver);
		return new ResponseEntity<>(updatedDriver, HttpStatus.OK);
	}
	
	//Mapping that allows you to delete a driver of a specific id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDriver(@PathVariable("id") Long id) {
		driverService.deleteDriver(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
