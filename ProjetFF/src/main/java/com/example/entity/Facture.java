package com.example.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
public class Facture {
	@Id @GeneratedValue
	private int id;
	private String code;
    @Temporal(TemporalType.DATE)
	private Date dateFacture;
	@ManyToOne(cascade=CascadeType.ALL, optional=false)
	private Phase phase;
	public Facture() {
		super();
	}
	public Facture(int id, String code, Date dateFacture, Phase phase) {
		super();
		this.id = id;
		this.code = code;
		this.dateFacture = dateFacture;
		this.phase = phase;
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
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public Phase getPhase() {
		return phase;
	}
	public void setPhase(Phase phase) {
		this.phase = phase;
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
		Facture other = (Facture) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Facture [id=" + id + ", code=" + code + ", dateFacture=" + dateFacture + ", phase=" + phase + "]";
	}
	
	

}
