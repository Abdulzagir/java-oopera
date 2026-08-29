import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Максимов", Gender.MALE, 180);
        Actor actor2 = new Actor("Валерий", "Сюткин", Gender.MALE, 175);
        Actor actor3 = new Actor("Леонардо", "Уллубиев", Gender.MALE, 170);


        Director director1 = new Director("Анна", "Елисеева", Gender.FEMALE, 7);
        Director director2 = new Director("Алина", "Магомедова", Gender.FEMALE, 15);


        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Михаил Фокин";

        ArrayList<Actor> actorsForShow = new ArrayList<>();
        ArrayList<Actor> actorsForOpera = new ArrayList<>();
        ArrayList<Actor> actorsForBallet = new ArrayList<>();

        Show show = new Show("Гамлет", 120, director1, actorsForShow);
        Opera opera = new Opera("Евгений Онегин", 150, director2, actorsForOpera, musicAuthor,
                "История Евгения Онегина", 30);
        Ballet ballet = new Ballet("Лебединое ощеро", 130, director1, actorsForBallet,
                musicAuthor, "История принцессы Одетты",choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Актеры спектакля: ");
        show.printActors();

        System.out.println("Актеры оперы: ");
        opera.printActors();

        System.out.println("Актеры балета: ");
        ballet.printActors();

        show.replaceActor(actor3, "Максимов");
        System.out.println("Актеры спектакля после замены: ");
        show.printActors();

        //Птаюсь заменить несуществующего актера
        opera.replaceActor(actor2, "Петров");
        //

        System.out.println("Либерто оперы: ");
        opera.printLiberto();

        System.out.println("Либерто балета");
        ballet.printLiberto();

    }
}
