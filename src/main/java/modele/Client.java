package modele;

import java.util.List;

public class Client {

    private int id_client;
    private String nom;
    private String prenom;
    private String date_naiss;
    private String adresse;
    private String telephone;

    public Client() {

    }

    public Client(int id_client, String nom, String prenom, String date_naiss, String adresse, String telephone) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.adresse = adresse;
        this.telephone = telephone;

    }

    public int getId_client() {
        return id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
