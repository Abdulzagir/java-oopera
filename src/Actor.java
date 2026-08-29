import java.util.Objects;

public class Actor extends Person {
   private double height;


    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }

    @Override
    public boolean equals (Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Actor)) {
            return false;
        }
        Actor actor = (Actor) o;
        return getName().equals(actor.getName()) &&
        getSurname().equals(actor.getSurname()) &&
                getHeight() == actor.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }
}
