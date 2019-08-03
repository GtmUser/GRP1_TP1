package model;
import org.apache.log4j.Logger;

public class ControleAccesBdd {
	/**
	 * Utilisation de log4j
	 */
	private static Logger logger = Logger.getLogger(model.ControleAccesBdd.class);
	
	/**
	 * Constructeur sans parametre
	 */
	public ControleAccesBdd(){
		
	}

	/**
	 * Methode pour demander l'authentification � la base de donn�es
	 */
	public void demanderAuthentification(){
		logger.debug("Je suis dans la m�thode demander authentification");	
	}
	
	/**
	 * Methode pour valider l'authentification � la base de donn�es
	 */
	public void validerAuthentification(){
		
	}
}
