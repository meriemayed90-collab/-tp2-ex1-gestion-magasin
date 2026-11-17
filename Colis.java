public class Colis extends Courrier {
    private double poids;   // en grammes
    private double volume;  // en litres

    public Colis(boolean express, String adresse, double poids, double volume) {
        super(express, adresse);
        this.poids = poids;
        this.volume = volume;
    }

    @Override
    public void decrire() {
        System.out.println("Colis :");
        System.out.println("  Mode d'expedition : " + (express ? "express" : "normal"));
        System.out.println("  Adresse de destination : " + adresse);
        System.out.println("  Poids : " + poids + " g");
        System.out.println("  Volume : " + volume + " L");
        System.out.println("  Valide : " + (estValide() ? "oui" : "non"));
    }

    @Override
    public double affranchir() {
        if (!estValide()) {
            return 0;
        }
        double montant = 0.25 * volume + (poids / 1000.0) * 1.0;
        return express ? 2 * montant : montant;
    }
}
