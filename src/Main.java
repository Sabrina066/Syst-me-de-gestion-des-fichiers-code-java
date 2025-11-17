public class Main {
    public static void main(String[] args) {
        Text texte1 = new Text(
                "Atelier 3",
                "c:/Users/Sabrina/Documents/TP",
                548,
                15/11/2025,
                ".txt",
                "ASCII");
        texte1.afficherInformation();

        Image img1 = new Image(
                "Atelier 3 PHN",
                "c:/Users/Sabrina/Image/TP",
                832,
                15/11/2025,
                "DPI");
        img1.afficherInformation();

        Video vid1 = new Video(
                "PHN",
                "c:/Users/Sabrina/Video/TP",
                23,
                15/11/2025,
                ".mp4");

        vid1.afficherInformation();



    }

}
