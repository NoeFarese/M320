import java.util.ArrayList;
import java.util.List;

public class Person implements Bezeichnung {
    private String nachname;
    private String vorname;
    private List<Bezeichnung> besitz;

    public Person(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.besitz = new ArrayList<>();
    }

    public void addBesitz(Bezeichnung bezeichnung) {
        besitz.add(bezeichnung);
        if (bezeichnung instanceof hatBesitzer) {
            ((hatBesitzer) bezeichnung).setBesitzer(this);
        }
    }

    public List<Bezeichnung> getBesitz() {
        return besitz;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getFullName() {
        return vorname + " " + nachname;
    }

    @Override
    public Person getBesitzer() {
        return null;
    }

    @Override
    public String getBezeichnung() {
        return "Person: " + getFullName();
    }
}