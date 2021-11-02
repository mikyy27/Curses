/**
 * @author Michal Sobczuk
 * @version v0.2 Classe Cotxe, hereta de Vehicle
 */
public class Cotxe extends Vehicle {
	private String Marca;
	private String Model;

	/**
	 * 
	 * @param vel
	 */
	public Cotxe(int vel) {
		super(vel);
	}

	/**
	 * @return String Retorna la marca
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * @param marca String Ajusta la marca
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * @return String Retorna el model
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * @param model String Ajusta el model
	 */
	public void setModel(String model) {
		Model = model;
	}

}
