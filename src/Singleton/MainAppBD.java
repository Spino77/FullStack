package Singleton;

public class MainAppBD {
    public static void main(String[] args) {
        ConexioBD con = ConexioBD.getInstance();
        System.out.println(con.getNomBD());
        mX();
    }

    public static void mX() {
        ConexioBD con = ConexioBD.getInstance();
        System.out.println(con.getNomBD());
    }


}
