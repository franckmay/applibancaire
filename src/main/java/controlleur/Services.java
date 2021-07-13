package controlleur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modele.Client;
import modele.Compte;

public class Services implements ServiceInterface {

    public Connection conn;
    private Connexion c;
    PreparedStatement statement = null;
    ResultSet resultat;

    public Services() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public double monSolde(Compte cp, double montant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double updateSolde(Compte cp, double montant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compte> mesComptes(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exist(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client authentification(String login, String password) {

        c.connexionBD();
        conn = c.getConnect();
        Client cl = new Client();

        try {
            statement = (PreparedStatement) conn.createStatement();
            String sql = "SELECT * FROM client WHERE login ='" + login + "'";
            resultat = statement.executeQuery(sql);

            if (resultat.next()) {

                int id = Integer.valueOf(resultat.getString(0));
                String nom = resultat.getString(1);
                String prenom = resultat.getString(2);
                String date_naiss = resultat.getString(3);
                String adresse = resultat.getString(4);
                String telephone = resultat.getString(5);
                String log = resultat.getString(6);
                String motDePasse = resultat.getString(7);
                String comptes = resultat.getString(8);

                if (motDePasse.equals(password)) {

                    System.out.println("Connexion réussie ! ");
                    cl = new Client(id, nom, prenom, date_naiss, adresse, telephone);

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
        return cl;

    }

    @Override
    public boolean ajouterCompte(Client c, Compte cp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ajouterClient(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifierCompte(Compte cp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifierClient(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimerCompte(Compte cp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimerClient(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
