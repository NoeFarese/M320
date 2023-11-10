class Lehrer extends Person {
    private final double gehalt;

    public Lehrer(int id, String name, double gehalt) {
        super(id, name);
        this.gehalt = gehalt;
    }

    @Override
    public void ausgabe() {
        if(gehalt > 100){
            System.out.println("Lehrer " + name + " sagt: Es beliebt mich zu erquicken");
        } else {
            System.out.println("Lehrer " + name + " sagt: ich glaub mein schwein pfeifft");
        }
    }
}
