import java.util.ArrayList;

public class MusicalShow extends Show {
   private String musicAuthor;
   private String liberttoText;

    public MusicalShow(String title, double duration, Director director,
                       ArrayList<Actor> listOfActors, String musicAuthor, String liberttoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.liberttoText = liberttoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLiberttoText() {
        return liberttoText;
    }


    public void printLiberto() {
        System.out.println(liberttoText);
    }
}
