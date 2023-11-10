public class Main {
    public static void main(String[] args) {
        SpeicherMedium r1 = new CompactDisc(eInhalt.Daten, "01.11.2018");
        CompactDisc r2 = new CompactDisc(eInhalt.Musik, "The Best of Mittelwelle 531");
        SpeicherMedium r3 = new DigitalVersatileDisc(eInhalt.Film, "Ein Quantum Trost");
        DigitalVersatileDisc r4 = new DigitalVersatileDisc();
        r4.setInhalt(eInhalt.Musik);
        r4.setTitel("mp3-Sammlung 05");
        SpeicherMedium r5 = new BluRay(eInhalt.Film, "KillBill", eLayer.SingleLayer);
        BluRay r6 = new BluRay();
        r6.setInhalt(eInhalt.Film);
        r6.setLayer(eLayer.DualLayer);
        r6.setTitel("mp3-Sammlung 05");

        Hund r7 = new Hund("Fido", 3);
        Hund r8 = new Hund("Benji");
        r8.setAlter(1);

        Person person = new Person("Dogfan", "Karlotta");
        person.addBesitz(r1);
        person.addBesitz(r2);
        person.addBesitz(r3);
        person.addBesitz(r4);
        person.addBesitz(r5);
        person.addBesitz(r6);
        person.addBesitz(r7);
        person.addBesitz(r8);

        System.out.println("\n----------BESITZ----------");
        for (IBezeichnung ib : person.getBesitz()) {
            System.out.println(ib.getBezeichnung());
        }
        System.out.println("\n\n----------HUNDE----------");
        System.out.println("Hund:" + r7.getName() + " Besitzer:" + r7.getBesitzer().getFullName());
        System.out.println("Hund:" + r8.getName() + " Besitzer:" + r8.getBesitzer().getFullName());

        System.out.println();
    }
}
