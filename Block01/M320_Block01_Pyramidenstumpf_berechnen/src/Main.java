import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Länge der Deckseite A ein:");
        double deckseiteA = scanner.nextDouble();

        System.out.println("Geben Sie die Länge der Deckseite B ein:");
        double deckseiteB = scanner.nextDouble();

        System.out.println("Geben Sie die Länge der Basisseite A ein:");
        double basisseiteA = scanner.nextDouble();

        System.out.println("Geben Sie die Länge der Basisseite B ein:");
        double basisseiteB = scanner.nextDouble();

        System.out.println("Geben Sie die Höhe ein:");
        double hoehe = scanner.nextDouble();

        Pyramidenstumpf pyramidenstumpf = new Pyramidenstumpf(deckseiteA, deckseiteB, basisseiteA, basisseiteB, hoehe);

        double mantelflaeche = pyramidenstumpf.berechneMantelflaeche();
        double volumen = pyramidenstumpf.berechneVolumen();
        double oberflaeche = pyramidenstumpf.berechneOberflaeche();

        System.out.println("Mantelfläche: " + mantelflaeche);
        System.out.println("Volumen: " + volumen);
        System.out.println("Oberfläche: " + oberflaeche);

        scanner.close();
    }
}
