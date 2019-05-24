package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Document {
	
	@Id @GeneratedValue
	private int id;
	private String code;
	private String libelle;
	private String description;
	private String chemin;
	@ManyToOne
	private Projet projet;
	public Document() {
		super();
	}
	public Document(int id, String code, String libelle, String description, String chemin, Projet projet) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.description = description;
		this.chemin = chemin;
		this.projet = projet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
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
		Document other = (Document) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", code=" + code + ", libelle=" + libelle + ", description=" + description
				+ ", chemin=" + chemin + ", projet=" + projet + "]";
	}
	
	
	
}
