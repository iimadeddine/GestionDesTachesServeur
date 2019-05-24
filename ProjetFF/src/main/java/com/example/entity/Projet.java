package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Projet {
	
	@Id @GeneratedValue
	private int id;
    private String code ;
    private String nomProjet;
    private String description;
    @Temporal(TemporalType.DATE)
	private Date dateDebut;
    @Temporal(TemporalType.DATE)
   	private Date dateFin;
    private double montant;
    @ManyToOne
	private Employe employe;
    @ManyToOne
  	private Organisme organisme;
    @OneToMany(mappedBy="projet")
	private List<Document> documents;
    @OneToMany(mappedBy="projet")
	private List<Phase> phases;
	public Projet() {
		super();
	}
	public Projet(int id, String code, String nomProjet, String description, Date dateDebut, Date dateFin,
			double montant, Employe employe, Organisme organisme) {
		super();
		this.id = id;
		this.code = code;
		this.nomProjet = nomProjet;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montant = montant;
		this.employe = employe;
		this.organisme = organisme;
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
	public String getNomProjet() {
		return nomProjet;
	}
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Organisme getOrganisme() {
		return organisme;
	}
	public void setOrganisme(Organisme organisme) {
		this.organisme = organisme;
	}
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	

	public List<Phase> getPhases() {
		return phases;
	}
	public void setPhases(List<Phase> phases) {
		this.phases = phases;
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
		Projet other = (Projet) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Projet [id=" + id + ", code=" + code + ", nomProjet=" + nomProjet + ", description=" + description
				+ ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", montant=" + montant + ", employe=" + employe
				+ ", organisme=" + organisme + ", documents=" + documents + ", phases=" + phases + "]";
	}
	
    
    
    
    
    
}
