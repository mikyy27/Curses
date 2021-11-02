/**
 * @author Michal Sobczuk
 * @version v0.2
 * Classe pilot amb els seus mètodes.
 */ 
import java.util.Date;

public class Pilot {
	private String nom;
	private int nivell;
	private int punts;
/**
 * 
 * @param nom
 */
	public Pilot(String nom) {
		this.nom = nom;
	}

	/**
	 * @deprecated Ara utilitzem els punts d'una altre manera
	 * @param punts
	 */
	//public Pilot(String punts) {
	//	this.punts = punts;
	//}


	/** 
	 * @return String
	 * Retorna el nom
	 */
	public String getNom() {
		return nom;
	}

	
	/** 
	 * @return int
	 * Retorna els punts
	 */
	public int getPunts() {
		return punts;
	}

	
	/** 
	 * @param punts int
	 * Ajusta els punts
	 */
	public void setPunts(int punts) {
		this.punts = punts;
	}

	
	/** 
	 * @param p int
	 * Afegeix punts
	 */
	public void addPunts(int p) {
		punts += p;
	}

	
	/** 
	 * @return String
	 * sobrecàrrega que hereta de la classe Object
	 */
	
	public String toString() {
		return "Pilot{" +
				"nom='" + nom + '\'' +
				", punts=" + punts +
				'}';
	}
}
