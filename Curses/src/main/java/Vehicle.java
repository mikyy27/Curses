/**
 * @author Michal Sobczuk
 * @version v0.2
 * 
 * Classe publica abstracta Vehicle, Vehicle es la classe pare de Cotxe
 */ 
public abstract class Vehicle {
	private int velocitatMAX;
	private Pilot pilot;

	public Vehicle(int vel) {
		velocitatMAX = vel;
	}

	
	/**
	 * @deprecated El parametre tipus esta en desus
	 * @param vel
	 * @param tipus
	 */
	public Vehicle(int vel, int tipus) {
		velocitatMAX = vel;
	}

	/** 
	 * @return Pilot
	 * Retorna el pilot
	 */
	public Pilot getPilot() {
		return pilot;
	}

	
	/** 
	 * @param pilot
	 * Ajusta el pilot
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	
	/** 
	 * @return int
	 * Retorna la velocitat maxima
	 */
	public int getVelocitatMAX() {
		return velocitatMAX;
	}

	
	/** 
	 * @param velocitatMAX int
	 * Ajusta la velocitat maxima
	 */
	public void setVelocitatMAX(int velocitatMAX) {
		this.velocitatMAX = velocitatMAX;
	}
}
