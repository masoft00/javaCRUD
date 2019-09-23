package com.makarimal.akhlaq;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ServiceUpdate extends Service{

		//déclaration de mes propriétés
		public int id;
		public String libelle1;
		
		public String getLibelle() {
			return libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		

	
	public void modifService(int id,String libelle){
		Connexion Con=new Connexion();
		Connection connection=Con.get_connection();
		PreparedStatement ps=null;
	
		try {
			String query="UPDATE service SET libelle=? where id=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, libelle);
			ps.setInt(2, id);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
