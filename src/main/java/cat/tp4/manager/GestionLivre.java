package cat.tp4.manager;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import car.tp4.entity.Livre;
import car.tp4.itf.GestionLivreItf;

@Local
public class GestionLivre implements GestionLivreItf {
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Premier service
	 */
	public void init()
	{
		Livre l1 = new Livre("Edouard Eric Java", "Le java, c'est la Java", "1974");
		Livre l2 = new Livre("Patrick Henry Parker", "How to PHP","1990");
		Livre l3 = new Livre("Christian Paul Picard","See plus plus, the C++","1989");
		
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
	}
	
	/**Deuxi�me service obtention des auteurs
	 * @return La liste des auteurs
	 */
	public List<String> getAuteurs()
	{
		Query q1= this.em.createQuery("SELECT auteur FROM Livre");
		return (List<String>) q1.getResultList();
	}
	
	public List<Livre> getLivres()
	{
		Query q1= this.em.createQuery("SELECT * FROM Livre");
		return (List<Livre>) q1.getResultList();
	}
	
	
	
	

}
