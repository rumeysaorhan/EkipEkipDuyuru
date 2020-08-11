package com.example.springboot.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EkipDuyuru")
public class EkipDuyuru {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="ekip")
	private String ekip;
	
	@Column(name="duyuru")
	private String duyuru;
	
	@Column(name="tarih")
	private Date tarih;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEkip() {
		return ekip;
	}
	public void setEkip(String ekip) {
		this.ekip = ekip;
	}
	public String getDuyuru() {
		return duyuru;
	}
	public void setDuyuru(String duyuru) {
		this.duyuru = duyuru;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	
}
