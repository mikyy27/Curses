/**
 * @author Michal Sobczuk
 * @version v0.2
 * 
 *          Classe ConfigGame encarregada de la configuració
 */
public class ConfigGame {
    private String username;
    private int numRunners;
    private int numTracks;

    /**
     * @return int Retorna el numero de tracks
     */
    public int getNumTracks() {
        return numTracks;
    }

    /**
     * @param numTracks int Ajusta el numero de tracks
     */
    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    public ConfigGame() {
        numRunners = 5;
        numTracks = 3;
        username = "player";
    }

    /**
     * @param username String Ajusta el nom d'usuari
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String Retorna el nom d'usuari
     */
    public String getUserName() {
        return username;
    }

    /**
     * @return int Retorna el numero de runners
     */
    public int getNumRunners() {
        return numRunners;
    }

    /**
     * @param numRunners int Ajusta el numero de runners
     */
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    /**
     * @return String Hereta de la classe Object
     */
    public String toString() {
        return "ConfigGame{" + "username='" + username + '\'' + ", numRunners=" + numRunners + ", numTracks="
                + numTracks + '}';
    }
}
