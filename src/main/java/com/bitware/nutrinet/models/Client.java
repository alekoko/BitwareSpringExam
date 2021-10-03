package com.bitware.nutrinet.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "Cliente")
public class Client {
	
	@Id
	@Column(name = "Cliente_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	
	@Column(name = "Contraseña")
	private String pass;
	
	@Column(name = "Nombre_Usuario")
	private String clientUser;

	@Column(name = "Nombre")
	private String clientName;
	
	@Column(name = "Apellidos")
	private String clientLast;
	
	@Column(name = "Correo_Electronico")
	private String email;
	
	@Column(name = "Edad")
	private int age;
	
	@Column(name = "Peso")
	private float weight;
	
	@Column(name = "Estatura")
	private float height;
	
	@Column(name = "IMC")
	private float BMI;
	
	@Column(name = "GEB")
	private float GEB;
	
	@Column(name = "ETA")
	private float ETA;
	
	@Column(name = "Fecha_Creacion")
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private Date creationDate;
	
	@Column(name = "Fecha_Actualizacion")
	@UpdateTimestamp
	private Date updateDay;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientLast() {
		return clientLast;
	}
	public void setClientLast(String clientLast) {
		this.clientLast = clientLast;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getBMI() {
		return BMI;
	}
	public void setBMI(float bMI) {
		BMI = bMI;
	}
	public float getGEB() {
		return GEB;
	}
	public void setGEB(float gEB) {
		GEB = gEB;
	}
	public float getETA() {
		return ETA;
	}
	public void setETA(float eTA) {
		ETA = eTA;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Date getUpdateDay() {
		return updateDay;
	}
	public void setUpdateDay(Date updateDay) {
		this.updateDay = updateDay;
	}
	public void setClientUser(String clientUser) {
		this.clientUser = clientUser;
	}
	public String getClientUser() {
		return this.clientUser;
	}
	
	
	public Client(int clientId, String pass, String clientName, String clientUser, String clientLast, String email, int age, float weight,
			float height, float bMI, float gEB, float eTA) {
		super();
		this.clientId = clientId;
		this.pass = pass;
		this.clientName = clientName;
		this.clientLast = clientLast;
		this.email = email;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.clientUser = clientUser;
		BMI = bMI;
		GEB = gEB;
		ETA = eTA;
	}
	
	public Client() {
		super();
	}
}
