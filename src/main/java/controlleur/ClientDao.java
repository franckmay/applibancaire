package controlleur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDao {

    public Connection conn;
    private Connexion c;
    PreparedStatement statement = null;
    ResultSet resultat;

    public ClientDao() {
        // TODO Auto-generated constructor stub
    }

    public void authentification(String login, String pass) {
        c.connexionBD();
        conn = c.getConnect();
        try {
            statement = (PreparedStatement) conn.createStatement();
            String sql = "SELECT password FROM client WHERE login ='" + login + "'";
            resultat = statement.executeQuery(sql);

            if (resultat.next()) {

                String motDePasse = resultat.getString(1);

                if (motDePasse.equals(pass)) {

                    System.out.println("Connexion réussie ! ");
                } else {

                    System.out.println("Mot de passe incorrect ! ");
                }
            } else {

                System.out.println("Login incorrect ! ");
            }

            conn.close();

        } catch (SQLException e4) {

            System.out.println(e4.getMessage());
        }
    }
}
