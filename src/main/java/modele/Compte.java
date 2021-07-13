package modele;

public class Compte {

    private int id_compte;
    private int titulaire;
    private String intitule;
    private String date_ouverture;
    private String type;
    private Double solde;

    public Compte() {

    }

    public Compte(int id_compte, int titulaire, String intitule, String date_ouverture, String type, Double solde) {
        this.id_compte = id_compte;
        this.titulaire = titulaire;
        this.intitule = intitule;
        this.date_ouverture = date_ouverture;
        this.type = type;
        this.solde = solde;
    }

    public int getId_compte() {
        return id_compte;
    }

    public int getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(int titulaire) {
        this.titulaire = titulaire;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDate_ouverture() {
        return date_ouverture;
    }

    public void setDate_ouverture(String date_ouverture) {
        this.date_ouverture = date_ouverture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

}
