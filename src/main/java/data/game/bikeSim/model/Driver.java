package data.game.bikeSim.model;

import java.io.Serializable;

import jakarta.persistence.*;
//This class represents the different drivers of the custom championship
@Entity
public class Driver implements Serializable{
	//The id is configured to be generated automatically
	//Every field is set to not null so every driver needs to have all info to be able to save it to the database
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(nullable = false, updatable = false)
	private String name;
	@Column(nullable = false)
	private String shortName;
	@Column(nullable = false)
	private int number;
	@Column(nullable = false)
	private Long teamId;
	@Column(nullable = false)
	private float qualifyingPace;
	@Column(nullable = false)
	private float racePace;
	@Column(nullable = false)
	private int championshipPoints;
	@Column(nullable = false)
	private int championshipPosition;
	@Column(nullable = false)
	private float crashProbability;
	
	public Driver() {
	
	}
	
	//The main way of generating drivers will be this constructor with every field except the id
	public Driver(String name, String shortName, Long teamId, float qualifyingPace, float racePace, int championshipPoints, int championshipPosition) {
		this.name = name;
		this.shortName = shortName;
		this.teamId = teamId;
		this.qualifyingPace = qualifyingPace;
		this.racePace = racePace;
		this.championshipPoints = championshipPoints;
		this.championshipPosition = championshipPosition;
	}
	
	//Setters and getters of the different fields of the class
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public float getQualifyingPace() {
		return qualifyingPace;
	}
	public void setQualifyingPace(int qualifyingPace) {
		this.qualifyingPace = qualifyingPace;
	}
	public float getRacePace() {
		return racePace;
	}
	public void setRacePace(int racePace) {
		this.racePace = racePace;
	}
	public int getChampionshipPoints() {
		return championshipPoints;
	}
	public void setChampionshipPoints(int championshipPoints) {
		this.championshipPoints = championshipPoints;
	}
	public int getChampionshipPosition() {
		return championshipPosition;
	}
	public void setChampionshipPosition(int championshipPosition) {
		this.championshipPosition = championshipPosition;
	}
	
	//toString method to show a specific driver on console
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", shortName=" + shortName + ", teamId=" + teamId
				+ ", qualifyingPace=" + qualifyingPace + ", racePace=" + racePace + ", championshipPoints="
				+ championshipPoints + ", championshipPosition=" + championshipPosition + "]";
	}
}