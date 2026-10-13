package Singleton;

public class ConexioBD {
    private String nomBD;

    private static ConexioBD instance;

    private ConexioBD(){}
    public ConexioBD(String nomBD) {
        this.nomBD = nomBD;
    }

    public static ConexioBD getInstance() {
        if (instance == null) {
            instance = new ConexioBD();
        }
        return instance;
    }

    public String getNomBD() {
        return nomBD;
    }

    public void setNomBD(String nomBD) {
        this.nomBD = nomBD;
    }
}
