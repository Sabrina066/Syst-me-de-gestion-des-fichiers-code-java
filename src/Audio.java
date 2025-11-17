public class Audio extends Fichier {

    public long duree2;

    public Audio(String nom, String chemin, long  duree2, long  date, String extension ) {
        super(nom, chemin, duree2, date, extension);
        this.duree2 = duree2;
    }
    public void setduree2(long duree) {
        this.duree2 = duree2;
    }
    public long getduree2() {
        return duree2;
    }
    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Durée :" + this.duree2);
    }
}
