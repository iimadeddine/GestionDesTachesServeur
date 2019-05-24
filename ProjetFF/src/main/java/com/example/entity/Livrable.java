package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livrable {
	@Id @GeneratedValue
	private int id;
	private String libelle;
	private String description;
	private String chemin;
	@ManyToOne
	private Tache tache;
	public Livrable() {
		super();
	}
	public Livrable(int id, String libelle, String description, String chemin, Tache tache) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.chemin = chemin;
		this.tache = tache;
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
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
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
		Livrable other = (Livrable) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Livrable [id=" + id + ", libelle=" + libelle + ", description=" + description + ", chemin=" + chemin
				+ ", tache=" + tache + "]";
	}
	
	
	
	

}
