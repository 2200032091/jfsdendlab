package com.klef.jfsd.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue
    int id;
    
    public Project() {
		super();
	}

	@Column(name = "name")
    String name;
    
    @Column(name="duration")
    int duration;
    
    @Column(name = "budget")
    int budget;
    
    @Column(name="teamlead")
    String teamlead;

	public Project(int id, String name, int duration, int budget, String teamlead) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.budget = budget;
		this.teamlead = teamlead;
	}

	public Project(String name, int duration, int budget, String teamlead) {
		super();
		
		this.name = name;
		this.duration = duration;
		this.budget = budget;
		this.teamlead = teamlead;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getTeamlead() {
		return teamlead;
	}

	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
}
