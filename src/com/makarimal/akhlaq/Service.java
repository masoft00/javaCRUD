package com.makarimal.akhlaq;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Service {
	
	//déclaration de mes propriétés
	public String libelle;
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public void ajouterService(String libelle) {
		Connexion Con=new Connexion();
		Connection connection=Con.get_connection();
		PreparedStatement ps=null;
		
		try {
			String query="INSERT INTO service(libelle) VALUES (?)";
			ps=connection.prepareStatement(query);
			ps.setString(1, libelle);
			System.out.println(ps);
			ps.executeUpdate();
			
		}catch(Exception e)  {
			System.out.println(e);
		}
	}
	
}
