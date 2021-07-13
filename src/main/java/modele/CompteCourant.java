package modele;

public class CompteCourant extends Compte {

    private String libelle;
    private Double solde_min;
    private Double retrait_max;

    public CompteCourant() {
        super();
    }

    public CompteCourant(String libelle, Double solde_min, Double retrait_max, int id_compte, int titulaire, String intitule, String date_ouverture, String type, Double solde) {
        super(id_compte, titulaire, intitule, date_ouverture, type, solde);
        this.libelle = libelle;
        this.solde_min = solde_min;
        this.retrait_max = retrait_max;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getSolde_min() {
        return solde_min;
    }

    public void setSolde_min(Double solde_min) {
        this.solde_min = solde_min;
    }

    public Double getRetrait_max() {
        return retrait_max;
    }

    public void setRetrait_max(Double retrait_max) {
        this.retrait_max = retrait_max;
    }

}
