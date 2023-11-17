public class DigitalVersatileDisc extends SpeicherMedium {
    public DigitalVersatileDisc(eInhalt inhalt, String titel) {
        super(inhalt, titel);
    }

    public DigitalVersatileDisc() {
        super(eInhalt.Daten, "");
    }
}