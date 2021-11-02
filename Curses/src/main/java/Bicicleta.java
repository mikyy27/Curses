/**
 * @author Michal Sobczuk
 * @version v0.2 Classe Bicicleta, hereta de Vehicle
 */
public class Bicicleta extends Vehicle {

    /**
     * 
     * @param vel
     */
    public Bicicleta(int vel) {
        super(vel);
    }

    /**
     * @deprecated Variable tipus en desús
     * @param vel,tipus
     */
    public Bicicleta(int vel, int tipus) {
        super(vel);
    }
}
