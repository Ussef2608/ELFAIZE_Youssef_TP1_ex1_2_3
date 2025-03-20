public class Imc {
    private double taille;
    private double poids;

    public Imc(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }

    public double calcul() {
        return poids / (taille * taille);
    }

    @Override
    public String toString() {
        return String.format("%.2f", calcul()); // Affichage de l'IMC avec 2 décimales
    }
}
