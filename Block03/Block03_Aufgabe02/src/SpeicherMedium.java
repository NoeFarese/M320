public class SpeicherMedium implements Bezeichnung {
    private eInhalt inhalt;
    private String titel;

    public SpeicherMedium(eInhalt inhalt, String titel) {
        this.inhalt = inhalt;
        this.titel = titel;
    }

    public eInhalt getInhalt() {
        return inhalt;
    }

    public void setInhalt(eInhalt inhalt) {
        this.inhalt = inhalt;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public Person getBesitzer() {
        return null;
    }

    @Override
    public String getBezeichnung() {
        return inhalt + ": " + titel;
    }
}