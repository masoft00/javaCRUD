package com.makarimal.akhlaq;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connexion {
	private String hostes="jdbc:mysql://localhost:3306/EntrepriseJDBC";
	private String user="root";
	private String password="eleves00";
	
	public static void main(String[] args) {
		  Connexion obj_DB_Connection=new Connexion();
		  JOptionPane.showInternalMessageDialog(null,"supert la connexion est établie avec succes");
		  //System.out.println(obj_DB_Connection.get_connection());
		  //System.out.println("==========<>supert la connexion est établie avec succes<>==========");
		}
	
	public Connection get_connection() {
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");              
			connection = DriverManager.getConnection(hostes,user,password);
		}catch(Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
