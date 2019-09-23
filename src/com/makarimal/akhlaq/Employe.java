package com.makarimal.akhlaq;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
public class Employe {

	//déclaration de mes propriétés
	public int id;
	public String matricule;
	public String nom_complet;
	public String telephone;
	public String date_naissance;
	public float salaire;
	public int service;
	
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}


	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom_complet() {
		return nom_complet;
	}
	public void setNom_complet(String nom_complet) {
		this.nom_complet = nom_complet;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	
	public void ajouterEmploye(String matricule,String nom_complet,String telephone,String date_naissance,float salaire,int service) {
		Connexion Con=new Connexion();
		Connection connection=Con.get_connection();
		PreparedStatement ps=null;
		
		try {
			String query="INSERT INTO employes(matricule,nom_complet,telephone,date_naissance,salaire,service) VALUES (?,?,?,?,?,?)";
			ps=connection.prepareStatement(query);
			ps.setString(1, matricule);
			ps.setString(2, nom_complet);
			ps.setString(3, telephone);
			ps.setString(4, date_naissance);
			ps.setFloat(5, salaire);
			ps.setInt(6, service);
			System.out.println(ps);
			ps.executeUpdate();
			
		}catch(Exception e)  {
			System.out.println(e);
		}
	}
	
}
