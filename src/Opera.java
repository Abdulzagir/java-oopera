import java.util.ArrayList;

public class Opera extends  MusicalShow {
   private int numberOfChorusMembers;

    public Opera(String title, double duration, Director director,
                 ArrayList<Actor> listOfActors, String musicAuthor, String liberttoText,
                 int numberOfChorusMembers) {
        super(title, duration, director, listOfActors, musicAuthor, liberttoText);
        this.numberOfChorusMembers = numberOfChorusMembers;
    }

    public int getNumberOfChorusMembers() {
        return numberOfChorusMembers;
    }


}
