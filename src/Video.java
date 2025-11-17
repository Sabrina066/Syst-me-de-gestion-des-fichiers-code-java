public class Video extends Fichier {

    public long duree;

    public Video(String nom, String chemin, long  duree, long  date, String extension ) {
        super(nom, chemin, 0,date, extension);
        this.duree = duree;
    }
    public void setduree(long duree) {
        this.duree = duree;
    }
    public long getduree() {
        return duree;
    }
    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Durée :" + this.duree);
    }
}


