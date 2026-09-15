import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usuaris = new String[99];
        int contador = 0;

        while (true) {
            menuPrincipal();
            try {
                switch (sc.nextInt()) {
                    case 1:
                        contador = submenu(sc, usuaris, contador);
                        break;
                    case 2:
                        System.out.println("Sistema funcional.");
                        break;
                    case 0:
                        System.out.println("Finalitzant programa.");
                        return;
                }
            }
            catch (Exception e) {
                System.out.println("Input incorrecte");
                sc.next();
            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("1. Gestió d'usuaris\n" +
                "2. Veure estat del sistema\n" +
                "0. Sortir\n");
    }

    public static int submenu(Scanner sc, String[] usuaris, int contador) {
        System.out.println("1. Llistar usuaris\n" +
                "2. Afegir nou usuari\n" +
                "0. Tornar al menú principal\n");

        switch (sc.nextInt()) {
            case 1:
                for (int i = 0; i < usuaris.length; i++) {
                    if (usuaris[i] != null){System.out.println(usuaris[i]);}
                }
                break;
            case 2:
                System.out.println("Nom del nou usuari:");
                usuaris[contador] = sc.nextLine();
                contador += 1;
                System.out.println("Usuari creat satisfactoriament.");
                break;
            case 0:
                return contador;
        }
        return contador;
    }
}
