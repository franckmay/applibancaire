package modele;

public class Operation {

    private int id_operation;
    private int compte;

    private String date;
    private Double montant;
    private String motif;

    public Operation() {
        // TODO Auto-generated constructor stub
    }

    public Operation(int id_operation, int compte, String date, Double montant, String motif) {
        this.id_operation = id_operation;
        this.compte = compte;
        this.date = date;
        this.montant = montant;
        this.motif = motif;
    }

    public int getId_operation() {
        return id_operation;
    }

    public int getCompte() {
        return compte;
    }

    public void setCompte(int compte) {
        this.compte = compte;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

}
