package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Employe {
	@Id @GeneratedValue
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String login;
	private String passeword;
	@ManyToOne(cascade=CascadeType.ALL, optional=false)
	private Profil profil;
	@Transient
	@OneToMany(mappedBy="employe")
	private List<Projet> projets;
	@OneToMany(mappedBy="employe")
	private List<Tache> taches;
	
	public Employe() {
		super();
	}

	public Employe(int id, String matricule, String nom, String prenom, String email, String telephone, String login,
			String passeword, Profil profil) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.login = login;
		this.passeword = passeword;
		this.profil = profil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasseword() {
		return passeword;
	}

	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}


	public Employe(List<Tache> taches) {
		super();
		this.taches = taches;
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
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
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", telephone=" + telephone + ", login=" + login + ", passeword=" + passeword + ", profil="
				+ profil + ", projets=" + projets + ", taches=" + taches + "]";
	}

	
	
	
	
	
	

}
