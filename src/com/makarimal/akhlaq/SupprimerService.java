package com.makarimal.akhlaq;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SupprimerService {


	//déclaration de mes propriétés
	public int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public void SupService(int id){
		Connexion Con=new Connexion();
		Connection connection=Con.get_connection();
		PreparedStatement ps=null;
		try {
			String query="DELETE FROM service where id=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, id);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
