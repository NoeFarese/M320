public class Pyramidenstumpf {
    private final double deckseiteA;
    private final double deckseiteB;
    private final double basisseiteA;
    private final double basisseiteB;
    private final double hoehe;

    Pyramidenstumpf(double deckseiteA, double deckseiteB, double basisseiteA, double basisseiteB, double hoehe){
        this.deckseiteA = deckseiteA;
        this.deckseiteB = deckseiteB;
        this.basisseiteA = basisseiteA;
        this.basisseiteB = basisseiteB;
        this.hoehe = hoehe;
    }

    public double berechneVolumen() {
        return (basisseiteA * basisseiteB + 2 * (deckseiteA * deckseiteB + basisseiteA * deckseiteA + basisseiteB * deckseiteB)) * hoehe / 6.0;
    }


    public double berechneMantelflaeche() {
        double term1 = (basisseiteA + deckseiteA) * Math.sqrt((deckseiteA - basisseiteA) * (deckseiteA - basisseiteA) / 4 + hoehe * hoehe);
        double term2 = (basisseiteB + deckseiteB) * Math.sqrt((deckseiteB - basisseiteB) * (deckseiteB - basisseiteB) / 4 + hoehe * hoehe);
        return term1 + term2;
    }

    public double berechneOberflaeche() {
        return berechneMantelflaeche() + (basisseiteA * basisseiteB) + (deckseiteA * deckseiteB);
    }
}