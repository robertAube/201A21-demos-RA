//Robert Aubé
class Fruit {
    private String nom;
    private int quantite; //quantité en inventaire

    public Fruit(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    public void setNom(String name) { this.nom = name; }
    public void setQuantite(int quantity) { this.quantite = quantity; }
    public String getNom() { return this.nom; }
    public int getQuantite() { return this.quantite; }
    public String toString() {
        return String.format("{nom: %s, quantité: %d}", this.nom, this.quantite);
    }
}