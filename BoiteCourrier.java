public class BoiteCourrier {
    private Courrier[] courriers;
    private int nbCourriers;

    public BoiteCourrier(int n) {
        courriers = new Courrier[n];
        nbCourriers = 0;
    }

    public void ajouter(Courrier c) {
        if (nbCourriers < courriers.length) {
            courriers[nbCourriers++] = c;
        } else {
            System.out.println("Boite pleine : impossible d'ajouter le courrier.");
        }
    }

    // Retourne le montant total d'affranchissement de tous les courriers
    public double affranchir() {
        double total = 0;
        for (int i = 0; i < nbCourriers; i++) {
            total += courriers[i].affranchir();
        }
        return total;
    }

    // Retourne le nombre de courriers invalides
    public int courriersInvalides() {
        int nb = 0;
        for (int i = 0; i < nbCourriers; i++) {
            if (!courriers[i].estValide()) {
                nb++;
            }
        }
        return nb;
    }

    public void afficher() {
        System.out.println("===== Contenu de la boite aux courriers =====");
        for (int i = 0; i < nbCourriers; i++) {
            System.out.println("--- Courrier n°" + (i + 1) + " ---");
            courriers[i].decrire();
            if (!courriers[i].estValide()) {
                System.out.println("  >>> COURRIER INVALIDE <<<");
            }
            System.out.println("  Montant d'affranchissement : " + courriers[i].affranchir() + " DT");
        }
    }
}
