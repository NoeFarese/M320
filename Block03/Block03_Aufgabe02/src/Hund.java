public class Hund implements Bezeichnung, hatBesitzer {
    private String name;
    private int alter;
    private Person besitzer;

    public Hund(String name) {
        this.name = name;
    }

    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public Person getBesitzer() {
        return besitzer;
    }

    @Override
    public void setBesitzer(Person besitzer) {
        this.besitzer = besitzer;
    }

    @Override
    public String getBezeichnung() {
        return "Hund: " + name + " Alter = " + alter;
    }
}
