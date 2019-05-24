package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tache {
	@Id @GeneratedValue
	private int id;
	private String libelle;
	private String description;
	@OneToMany(mappedBy="tache")
	private List<Livrable> livrables;
	@ManyToOne
	private Phase phase;
	@ManyToOne(cascade=CascadeType.ALL, optional=false)
	private Employe employe;
	public Tache(int id, String libelle, String description, Phase phase, Employe employe) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.phase = phase;
		this.employe = employe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Phase getPhase() {
		return phase;
	}
	public void setPhase(Phase phase) {
		this.phase = phase;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tache other = (Tache) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tache [id=" + id + ", libelle=" + libelle + ", description=" + description + ", livrables=" + livrables
				+ ", phase=" + phase + ", employe=" + employe + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
