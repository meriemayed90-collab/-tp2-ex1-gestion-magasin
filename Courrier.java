public class Courrier {
    public static final double TARIF_BASE = 0.5; // dinar

    protected boolean express;
    protected String adresse;

    public Courrier(boolean express, String adresse) {
        this.express = express;
        this.adresse = adresse;
    }

    public boolean estValide() {
        return adresse != null;
    }

    public void decrire() {
        System.out.println("Courrier :");
        System.out.println("  Mode d'expedition : " + (express ? "express" : "normal"));
        System.out.println("  Adresse de destination : " + adresse);
        System.out.println("  Valide : " + (estValide() ? "oui" : "non"));
    }

    public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        return express ? 2 * TARIF_BASE : TARIF_BASE;
    }
}
