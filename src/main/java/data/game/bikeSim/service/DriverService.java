package data.game.bikeSim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.game.bikeSim.exception.DriverNotFoundException;
import data.game.bikeSim.model.Driver;
import data.game.bikeSim.repo.DriverRepo;

@Service
public class DriverService {
	
private final DriverRepo driverRepo;
	
	@Autowired
	public DriverService(DriverRepo driverRepo) {
		this.driverRepo = driverRepo;
	}
	
	//Method that adds a driver to the database
	public Driver addDriver(Driver driver) {
		return driverRepo.save(driver);
	}
	
	//Method that shows every driver on the database
	public List<Driver> findAllDrivers() {
		return driverRepo.findAll();
	}
	
	//Method that modifies fields on a driver
	public Driver updateDriver(Driver driver) {
		return driverRepo.save(driver);
	}
	
	//Method that shows a driver by id
	public Driver findDriverById(Long id) {
		return driverRepo.findDriverById(id).orElseThrow(() -> new DriverNotFoundException ("Driver with id = " + id + " was not found"));
	}
	
	//Method that deletes a driver by id
	public void deleteDriver(Long id) {
		driverRepo.deleteDriverById(id);
	}

}
