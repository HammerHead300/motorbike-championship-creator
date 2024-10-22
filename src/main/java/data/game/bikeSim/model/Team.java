package data.game.bikeSim.model;

import java.io.Serializable;

import jakarta.persistence.*;

//This class represents the teams of the custom championship
@Entity
public class Team implements Serializable{
	//The id is configured to be automatically generated
	//Every field is set to not null
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private float slowCornerProficiency;
	@Column(nullable = false)
	private float fastCornerProficiency;
	@Column(nullable = false)
	private float longStraightProficiency;
	@Column(nullable = false)
	private float shortStraightProficiency;
	
	public Team(){
		
	}

	//As the id is automatically generated is not included in the class constructor
	public Team(String name, float slowCornerProficiency, float fastCornerProficiency, float longStraightProficiency, float shortStraightProficiency) {
		this.name = name;
		this.slowCornerProficiency = slowCornerProficiency;
		this.fastCornerProficiency = fastCornerProficiency;
		this.longStraightProficiency = longStraightProficiency;
		this.shortStraightProficiency = shortStraightProficiency;
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

	public float getSlowCornerProficiency() {
		return slowCornerProficiency;
	}

	public void setSlowCornerProficiency(int slowCornerProficiency) {
		this.slowCornerProficiency = slowCornerProficiency;
	}

	public float getFastCornerProficiency() {
		return fastCornerProficiency;
	}

	public void setFastCornerProficiency(int fastCornerProficiency) {
		this.fastCornerProficiency = fastCornerProficiency;
	}

	public float getLongStraightProficiency() {
		return longStraightProficiency;
	}

	public void setLongStraightProficiency(int longStraightProficiency) {
		this.longStraightProficiency = longStraightProficiency;
	}

	public float getShortStraightProficiency() {
		return shortStraightProficiency;
	}

	public void setShortStraightProficiency(int shortStraightProficiency) {
		this.shortStraightProficiency = shortStraightProficiency;
	}

	//toString method to show the teams on console
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", slowCornerProficiency=" + slowCornerProficiency
				+ ", fastCornerProficiency=" + fastCornerProficiency + ", longStraightProficiency="
				+ longStraightProficiency + ", shortStraightProficiency=" + shortStraightProficiency + "]";
	}
}