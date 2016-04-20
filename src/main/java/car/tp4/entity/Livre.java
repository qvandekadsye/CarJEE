package car.tp4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String auteur,titre,annee;
	
	public Livre(String auteur, String titre, String annee)
	{
		this.auteur = auteur;
		this.titre = titre;
		this.annee = annee ;
	}
	
	public long getId()
	{
		return this.id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getAuteur(){
		return this.auteur ;
	}
	
	public void setAuteur(String auteur){
		this.auteur = auteur ;
	}
	
	public String getAnnee()
	{
		return this.annee ;
	}
	
	public void setAnnee(String annee)
	{
		this.annee = annee ;
	}
	
	public String getTitre(){
		return this.titre;
	}
	
	public void setTitre(String titre){
		this.titre = titre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
