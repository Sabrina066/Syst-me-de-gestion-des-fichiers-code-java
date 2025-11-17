public class Text extends Fichier {

    public String encodage;

    public Text(String nom, String chemin, long  taille, long  date, String extension,String encodage ) {
        super(nom, chemin, taille, date, extension);
        this.encodage = encodage;
    }
    public void setEncodage(String encodage) {
        this.encodage = encodage;
    }
    public String getEncodage() {
        return encodage;
    }
    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Encodage :" + this.encodage);
    }
}
