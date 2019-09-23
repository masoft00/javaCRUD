package com.makarimal.akhlaq;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ListerService {
	
	public void Listerservice() {
		Connexion Con=new Connexion();
		Connection connection=Con.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="SELECT * FROM service";
			ps=connection.prepareStatement(query);
		
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
			System.out.println("id -"+rs.getInt("id"));
			System.out.println("libelle -"+rs.getString("libelle"));
			System.out.println("--------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
