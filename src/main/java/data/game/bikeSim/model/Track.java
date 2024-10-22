package data.game.bikeSim.model;

import java.io.Serializable;

import jakarta.persistence.*;

//Class that represents the tracks of the custom championship
@Entity
public class Track implements Serializable{
	//The id is set to generate automatically
	//Every other field is set to not null so it must has info in every field to add a track to the database
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(nullable = false, updatable = false)
	private String name;
	@Column(nullable = false, updatable = false)
	private int slowCorners;
	@Column(nullable = false, updatable = false)
	private int fastCorners;
	@Column(nullable = false, updatable = false)
	private int longStraights;
	@Column(nullable = false, updatable = false)
	private int shortStraights;
	
	public Track() {
		
	}

	//No id needed on the class constructor
	public Track(String name, int slowCorners, int fastCorners, int longStraights, int shortStraights) {
		this.name = name;
		this.slowCorners = slowCorners;
		this.fastCorners = fastCorners;
		this.longStraights = longStraights;
		this.shortStraights = shortStraights;
	}

	//Getters and setters of the class
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

	public int getSlowCorners() {
		return slowCorners;
	}

	public void setSlowCorners(int slowCorners) {
		this.slowCorners = slowCorners;
	}

	public int getFastCorners() {
		return fastCorners;
	}

	public void setFastCorners(int fastCorners) {
		this.fastCorners = fastCorners;
	}

	public int getLongStraights() {
		return longStraights;
	}

	public void setLongStraights(int longStraights) {
		this.longStraights = longStraights;
	}

	public int getShortStraights() {
		return shortStraights;
	}

	public void setShortStraights(int shortStraights) {
		this.shortStraights = shortStraights;
	}

	//toString method to show tracks information on console
	@Override
	public String toString() {
		return "Track [id=" + id + ", name=" + name + ", slowCorners=" + slowCorners + ", fastCorners=" + fastCorners
				+ ", longStraights=" + longStraights + ", shortStraights=" + shortStraights + "]";
	}
}