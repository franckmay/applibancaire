package controlleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connexion {

    public Connection conn;

    public Connexion() {
    }

    public void connexionBD() {

        /*  Chargement de la Base de données  */
        try {

            Class.forName("com.mysql.jdbc.Driver.");

        } catch (Exception e) {

            System.out.println(" Erreur de chargement de la Base de données");
            e.getMessage();
            System.exit(0);

        }

        /*    Connexion de la Base de données  */
        try {

            String url = "jdbc:mysql://localhost/banque";
            String user = "root";
            String passwd = "";
            conn = DriverManager.getConnection(url, user, passwd);

        } catch (Exception e) {
            System.out.println(" Erreur de Connexion à la Base de données ");
        }

    }

    /*   */
    public Connection getConnect() {

        return conn;
    }

    /*   Deconnexion  */
    public void Deconnexion() {

        try {
            conn.close();

        } catch (Exception e) {
            System.out.println(" Déconnexion Impossible ");
        }
    }

}
