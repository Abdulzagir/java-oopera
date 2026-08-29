
import java.util.ArrayList;

public class Show {
   private String title;
   private double duration;
   private Director director;
   private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director,
                ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Director director() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if(listOfActors.contains(actor)) {
            System.out.println("Такой актер уже учавствует в спектактле.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        for(int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).getSurname().equals(surname)){
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актер с такой фамилией не найден.");
    }
}
