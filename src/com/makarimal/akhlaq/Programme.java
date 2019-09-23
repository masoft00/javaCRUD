package com.makarimal.akhlaq;
import java.util.Scanner;

public class Programme {
	public int choix;
	public static int choix2;
	public static int choix3;
	public static void main(String[] args){
		//déclaration de la methode Scanner
		Scanner clavier=new Scanner(System.in);
		
		System.out.println("================================================================");
		System.out.println("	                       MENU                                 ");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("FAITES VOTRE CHOIX EN TAPANT 1 OU 2");
		System.out.println("");
		System.out.println("1===========>SERVICE");
		System.out.println("");
		System.out.println("2===========>EMPLOYÉ");
		int choix=clavier.nextInt();
		
		switch(choix) {
		case 1:
			System.out.println("================================================================");
			System.out.println("	                       MENU SERVICE                         ");
			System.out.println("================================================================");
			System.out.println("");
			System.out.println("FAITES VOTRE CHOIX EN TAPANT 1 / 2 / 3 / 4");
			System.out.println("");
			System.out.println("1===========>AJOUTER UN SERVICE");
			System.out.println("");
			System.out.println("2===========>MODIFIER UN SERVICE");
			System.out.println("");
			System.out.println("3===========>SUPPRIMER UN SERVICE");
			System.out.println("");
			System.out.println("4===========>LISTER SERVICES");
			int choix2=clavier.nextInt();
				switch(choix2) {
				case 1:
					System.out.println("================================================================");
					System.out.println("	                       AJOUTER SERVICE                      ");
					System.out.println("================================================================");
					//création d'un nouveau service
					Service service=new Service();

					System.out.println("Veuillez saisir le libelle");
					String libelle = clavier.next();
					service.setLibelle(libelle);
					service.ajouterService(libelle);
					System.out.println("=========================================================");
					System.out.println("             Enregistrement effectué avec succes         ");
					System.out.println("=========================================================");
				break;
				case 2:
					System.out.println("================================================================");
					System.out.println("	                       MODIFIER SERVICE                     ");
					System.out.println("================================================================");
					
					 //update data
					ServiceUpdate modifuser = new ServiceUpdate();
					System.out.println("Veuillez saisir l'identifiant du produitd à modifier");
					int id = clavier.nextInt();
					
					System.out.println("Veuillez saisir le nouveau libellé");
					String libelle1 = clavier.next();
					modifuser.modifService(id,libelle1);
					System.out.println("=========================================================");
					System.out.println("    Modification du service "+id+" effectué avec succes  ");
					System.out.println("=========================================================");
				break;
				case 3:
					SupprimerService SupService = new SupprimerService();
					System.out.println("================================================================");
					System.out.println("	                       SUPPRIMER SERVICE                    ");
					System.out.println("================================================================");
					System.out.println("Veuillez saisir l'identifiant du service à supprimer");
					int id1 = clavier.nextInt();
					System.out.println("");
					 //Suppression de l'enregistrement
					SupService.SupService(id1);
					System.out.println("=========================================================");
					System.out.println("               service "+id1+" effectué avec succes      ");
					System.out.println("=========================================================");
				break;
				case 4:
					System.out.println("================================================================");
					System.out.println("	                       LISTER SERVICES                      ");
					System.out.println("================================================================");
					ListerService listeruser = new ListerService();
					//lister les données
					listeruser.Listerservice();
				break;
				}
			break;
		case 2:
			System.out.println("================================================================");
			System.out.println("	                       MENU EMPLOYÉ                         ");
			System.out.println("================================================================");
			System.out.println("");
			System.out.println("FAITES VOTRE CHOIX EN TAPANT 1 / 2 / 3 / 4");
			System.out.println("");
			System.out.println("1===========>AJOUTER UN EMPLOYÉ");
			System.out.println("");
			System.out.println("2===========>MODIFIER UN EMPLOYÉ");
			System.out.println("");
			System.out.println("3===========>SUPPRIMER UN EMPLOYÉ");
			System.out.println("");
			System.out.println("4===========>LISTER EMPLOYÉ");
			int choix3=clavier.nextInt();
				switch(choix3) {
				case 1:
					System.out.println("================================================================");
					System.out.println("	                       AJOUTER EMPLOYÉ                      ");
					System.out.println("================================================================");
					//création d'un nouveau employé
					Employe employe=new Employe();
					System.out.println("Veuillez saisir le matricule");
					String matricule = clavier.next();
					employe.setMatricule(matricule);
					
					System.out.println("Veuillez saisir le Nom complet de l'Employe");
					String nom_complet = clavier.next();
					employe.setNom_complet(nom_complet);
					
					System.out.println("Veuillez saisir le Numéro de téléphone de l'Employe");
					String telephone = clavier.next();
					employe.setTelephone(telephone);
					
					System.out.println("Veuillez saisir la date de naissance de l'Employe");
					String date_naissance = clavier.next();
					employe.setDate_naissance(date_naissance);
					
					System.out.println("Veuillez saisir le Salaire de l'Employe");
					float salaire = clavier.nextFloat();
					employe.setSalaire(salaire);
					
					System.out.println("Veuillez indiquer le service de l'Employe");
					int service = clavier.nextInt();
					employe.setService(service);
					
					employe.ajouterEmploye(matricule,nom_complet,telephone,date_naissance,salaire,service);
					System.out.println("=========================================================");
					System.out.println("             Enregistrement effectué avec succes         ");
					System.out.println("=========================================================");
				break;
				case 2:
					System.out.println("================================================================");
					System.out.println("	                       MODIFIER EMPLOYÉ                     ");
					System.out.println("================================================================");
				break;
				case 3:
					SupprimerService SupEpml = new SupprimerService();
					System.out.println("================================================================");
					System.out.println("	                       SUPPRIMER EMPLOYÉ                    ");
					System.out.println("================================================================");
					System.out.println("Veuillez saisir l'identifiant du service à supprimer");
					int id1 = clavier.nextInt();
					System.out.println("");
					 //Suppression de l'enregistrement
					
					System.out.println("=========================================================");
					System.out.println("               service "+id1+" effectué avec succes      ");
					System.out.println("=========================================================");
				break;
				case 4:
					System.out.println("================================================================");
					System.out.println("	                       LISTER EMPLOYÉS                      ");
					System.out.println("================================================================");
					ListerEmploye listeremploye = new ListerEmploye();
					//lister les données
					listeremploye.Listerservice();
				break;
				}
			break;
		}	
		clavier.close();
	}
}
