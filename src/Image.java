public class Image extends Fichier {

    public String resolution;

    public Image(String nom, String chemin, long  taille, long  date, String resolution ) {
        super(nom, chemin, taille, date, null);
        this.resolution = resolution;
    }
    public void setresolution(String resolution) {
        this.resolution = resolution;
    }
    public String getresolution() {
        return resolution;
    }
    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("resolution :" + this.resolution);
    }
}

