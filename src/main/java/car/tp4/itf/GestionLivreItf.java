package car.tp4.itf;

import java.util.List;

import javax.ejb.Local;

import car.tp4.entity.Livre;

@Local
public interface GestionLivreItf {
	public void init();
	public List<String> getAuteurs();
	public List<Livre> getLivres();

}
