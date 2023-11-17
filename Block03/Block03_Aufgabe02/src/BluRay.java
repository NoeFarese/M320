
public class BluRay extends SpeicherMedium {
    private eLayer layer;

    public BluRay(eInhalt inhalt, String titel, eLayer layer) {
        super(inhalt, titel);
        this.layer = layer;
    }

    public BluRay() {
        super(eInhalt.Daten, "");
    }

    public eLayer getLayer() {
        return layer;
    }

    public void setLayer(eLayer layer) {
        this.layer = layer;
    }
}