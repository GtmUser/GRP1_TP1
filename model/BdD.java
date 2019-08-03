package model;

import java.sql.*;
import org.apache.log4j.Logger;

/**
 * Classe de gestion de l'acces à une base MySQL
 * 
 * @author David et Cyril
 * @version 1.0
 *
 */

public class BdD {
	/**
	 * Utilisation de log4j
	 */
	private static Logger logger = Logger.getLogger(controller.Audit.class);
	/**
	 * Propriete pour la connection a la base de donnees
	 */
	private Connection connecte;
	/**
	 * Adresse de la BdD
	 */
	private String adresse_bdd;
	/**
	 * identifiant pour acceder à la base de données
	 */
	private String user_bdd;
	/**
	 * Mot de passe pour accèder à la base de données
	 */
	private String password_bdd;
	/**
	 * Pour initialiser les requetes dans la base de données
	 */
	private Statement stmt;
	/**
	 * Driver correspondant à la base de données (dans ce cas MySQL)
	 */
	private String driver;
	
	/**
	 * Constructeur sans parametre de la classe base de données
	 */
	public BdD(){
		
	}
	/**
	 * Constructeur avec 4 parametres
	 * @param adresse_bdd
	 * 			adresse de la base de données
	 * @param user_bdd
	 * 			identifiant pour se connecter à la base de données
	 * @param password_bdd
	 * 			mot de passe pour se connecter à la base de données
	 * @param driver
	 * 			driver pour la communication entre la base de données MySQL et le langage JAVA
	 */
	public BdD(String adresse_bdd, String user_bdd, String password_bdd, String driver) {
		this.adresse_bdd = adresse_bdd;
		this.user_bdd = user_bdd;
		this.password_bdd = password_bdd;
		this.driver = driver;
	}
	
	/**
	 * Methode de connexion à la base de données
	 * @return connecte
	 */
	public Connection connexion(){
		logger.debug("Je suis dans la méthode connexion");
		
		return this.connecte;
	}
	
	/**
	 * Méthode pour la deconnexion à la base de données
	 */
	public void deconnecte(){
		
	}
	/**
	 * Methode pour lire dans la base de données. ATTENTION, cette methode doit renvoyer quelque chose (changer le void)
	 */
	public void lire_donnee(){
		
	}
	/**
	 * Méthode pour insérer une donnée dans la base de données
	 */
	public void creer_donnee(){
		
	}
	/**
	 * Méthode pour modifier des données dans la base de données
	 */
	public void modifier_donnee(){
		
	}
	/**
	 * Méthode pour supprimer des données dans la base de données
	 */
	public void supprimer_donnee(){
		
	}
	/**
	 * @return the connecte
	 */
	public Connection getConnecte() {
		return connecte;
	}
	/**
	 * @param connecte the connecte to set
	 */
	public void setConnecte(Connection connecte) {
		this.connecte = connecte;
	}
	/**
	 * @return the adresse_bdd
	 */
	public String getAdresse_bdd() {
		return adresse_bdd;
	}
	/**
	 * @param adresse_bdd the adresse_bdd to set
	 */
	public void setAdresse_bdd(String adresse_bdd) {
		this.adresse_bdd = adresse_bdd;
	}
	/**
	 * @return the user_bdd
	 */
	public String getUser_bdd() {
		return user_bdd;
	}
	/**
	 * @param user_bdd the user_bdd to set
	 */
	public void setUser_bdd(String user_bdd) {
		this.user_bdd = user_bdd;
	}
	/**
	 * @return the password_bdd
	 */
	public String getPassword_bdd() {
		return password_bdd;
	}
	/**
	 * @param password_bdd the password_bdd to set
	 */
	public void setPassword_bdd(String password_bdd) {
		this.password_bdd = password_bdd;
	}
	/**
	 * @return the stmt
	 */
	public Statement getStmt() {
		return stmt;
	}
	/**
	 * @param stmt the stmt to set
	 */
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}


	
}
