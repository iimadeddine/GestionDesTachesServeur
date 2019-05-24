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
public class Phase {
	
	@Id @GeneratedValue
	private int id;
	private String libelle;
	private String description;
    @Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private boolean etatrealisation;
	private boolean etatfacturation;
	private boolean etatPaiement;
	private double montant;
	@OneToMany(mappedBy="phase")
    private List<Tache> taches;
	@OneToMany(mappedBy="phase")
    private List<Facture>factures;
	public Phase() {
		super();
	}
	public Phase(int id, String libelle, String description, Date dateDebut, Date dateFin, boolean etatrealisation,
			boolean etatfacturation, boolean etatPaiement, double montant) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatrealisation = etatrealisation;
		this.etatfacturation = etatfacturation;
		this.etatPaiement = etatPaiement;
		this.montant = montant;
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
	public boolean isEtatrealisation() {
		return etatrealisation;
	}
	public void setEtatrealisation(boolean etatrealisation) {
		this.etatrealisation = etatrealisation;
	}
	public boolean isEtatfacturation() {
		return etatfacturation;
	}
	public void setEtatfacturation(boolean etatfacturation) {
		this.etatfacturation = etatfacturation;
	}
	public boolean isEtatPaiement() {
		return etatPaiement;
	}
	public void setEtatPaiement(boolean etatPaiement) {
		this.etatPaiement = etatPaiement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
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
		Phase other = (Phase) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Phase [id=" + id + ", libelle=" + libelle + ", description=" + description + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", etatrealisation=" + etatrealisation + ", etatfacturation="
				+ etatfacturation + ", etatPaiement=" + etatPaiement + ", montant=" + montant + ", taches=" + taches
				+ ", factures=" + factures + "]";
	}
	
	
	

}
