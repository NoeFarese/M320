class Jugendlicher extends Person {
    private boolean isGutGelaunt;

    public Jugendlicher(int id, String name, boolean isGutGelaunt) {
        super(id, name);
        this.isGutGelaunt = isGutGelaunt;
    }

    @Override
    public void ausgabe() {
        if (isGutGelaunt) {
            System.out.println("Jugendlicher " + name + " sagt: Boa ey voll krass man, eyy ond so!");
        } else {
            System.out.println("Jugendlicher " + name + " sagt: hau ab");
        }
    }
}