public class Lettre extends Courrier {
    private double poids;   // en grammes
    private String format;  // "A3" ou "A4"

    public Lettre(boolean express, String adresse, double poids, String format) {
        super(express, adresse);
        this.poids = poids;
        this.format = format;
    }

    @Override
    public void decrire() {
        System.out.println("Lettre :");
        System.out.println("  Mode d'expedition : " + (express ? "express" : "normal"));
        System.out.println("  Adresse de destination : " + adresse);
        System.out.println("  Poids : " + poids + " g");
        System.out.println("  Format : " + format);
        System.out.println("  Valide : " + (estValide() ? "oui" : "non"));
    }

    @Override
    public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        double tarifBase = format.equalsIgnoreCase("A3") ? 3.50 : 2.50;
        double montant = tarifBase + 0.5 * (poids / 1000.0);
        return express ? 2 * montant : montant;
    }
}
