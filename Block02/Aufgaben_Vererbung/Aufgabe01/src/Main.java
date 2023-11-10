import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p01 = new Jugendlicher(1, "Karlotta", false);
        Person p02 = new Jugendlicher(2, "Ludwig-Bernhard", true);
        Person l01 = new Lehrer(3, "Lämpel", 259.95);

        List<Person> personen = new ArrayList<>();
        personen.add(p01);
        personen.add(p02);
        personen.add(l01);
        for (Person p : personen) {
            p.ausgabe();
        }

    }
}
