package com.starter.heroes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heroes_table")
public class Hero {
	
	@Id
	private String name;
	private String publisher;
	private String intellegence;
	private String strength;
	private String image;
	
	public Hero() {
		
	}
	
	public Hero(String name, String publisher, String intellegence, String strength, String image) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.intellegence = intellegence;
		this.strength = strength;
		this.image = image;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIntellegence() {
		return intellegence;
	}
	
	public void setIntellegence(String intellegence) {
		this.intellegence = intellegence;
	}
	
	public String getStrength() {
		return strength;
	}
	
	public void setStrength(String strength) {
		this.strength = strength;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
