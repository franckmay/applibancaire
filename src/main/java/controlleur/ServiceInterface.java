package controlleur;

import java.util.List;
import modele.Client;
import modele.Compte;

public interface ServiceInterface {

    public double monSolde(Compte cp, double montant);

    public double updateSolde(Compte cp, double montant);

    public List<Compte> mesComptes(Client c);

    public boolean exist(Client c);

    public Client authentification(String login, String password);

    public boolean ajouterCompte(Client c, Compte cp);

    public boolean ajouterClient(Client c);

    public boolean modifierCompte(Compte cp);

    public boolean modifierClient(Client c);

    public boolean supprimerCompte(Compte cp);

    public boolean supprimerClient(Client c);

}
