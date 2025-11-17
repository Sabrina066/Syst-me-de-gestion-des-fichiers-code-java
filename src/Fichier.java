public class Fichier {
    private String nom;
    private String chemin;
    private long  taille;
    private long date;
    private String extension;

    //constructeur permet de creer une methode et n'a pas de type de retour
    public Fichier(String nom, String chemin, long  taille, long  date, String extension) {
        //Reinitialisation les identifiants de chaque fichier
        this.nom = nom;
        this.chemin = chemin;
        this.taille = taille;
        this.date = date;
        this.extension = extension;

    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getChemin() {
        return this.chemin;
    }
    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public long getTaille() {
        return this.taille;
    }
    public void setTaille(long taille) {
        this.taille = taille;
    }

    public long getDate() {
        return this.date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    public void afficherInformation(){
        System.out.println("Nom :" + this.nom);
        System.out.println("Chemin :" + this.chemin);
        System.out.println("Taille :" + this.taille);
        System.out.println("Date :" + this.date);
        System.out.println("Extension :" + this.extension);
    }

}
