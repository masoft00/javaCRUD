package com.makarimal.akhlaq;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ListerEmploye {


	public void Listerservice() {
		Connexion Con=new Connexion();
		Connection connection=Con.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="SELECT * FROM employes";
			ps=connection.prepareStatement(query);
		
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
			System.out.println("id -"+rs.getInt("id"));
			System.out.println("Matricule -"+rs.getString("matricule"));
			System.out.println("Nom Complet -"+rs.getString("nom_complet"));
			System.out.println("Téléphone -"+rs.getString("telephone"));
			System.out.println("Date Naissance -"+rs.getString("date_naissance"));
			System.out.println("Salaire -"+rs.getFloat("salaire"));
			System.out.println("Matricule -"+rs.getInt("service"));
			System.out.println("--------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
