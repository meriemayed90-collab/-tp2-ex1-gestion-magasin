public class TestCourrier {
    public static void main(String[] args) {
        BoiteCourrier boite = new BoiteCourrier(5);

        boite.ajouter(new Lettre(false, "10 Rue de Tunis, Bizerte", 200, "A4"));
        boite.ajouter(new Lettre(true, "5 Avenue Bourguiba, Tunis", 500, "A3"));
        boite.ajouter(new Colis(false, "12 Rue de Sfax, Sousse", 2000, 10));
        boite.ajouter(new Colis(true, null, 1500, 8));      // invalide
        boite.ajouter(new Courrier(true, "Rue Habib Thameur, Nabeul"));

        boite.afficher();

        System.out.println();
        System.out.println("Montant total d'affranchissement : " + boite.affranchir() + " DT");
        System.out.println("Nombre de courriers invalides : " + boite.courriersInvalides());
    }
}
