package pl.edu.ur.oopl6.zad1;

/**
 */
public class Figures {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double FieldOfCircle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double PerimeterOfCircle(double r) {
        return 2 * Math.PI * r;
    }

    /**
     * Metoda statyczna obliczająca pole kwadratu
     */
    public static double FieldOfSquare(double a) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca obwód kwadratu
     */
    public static double PerimeterOfSquare(double a) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca pole prostoąta
     */
    public static double FieldOfRectangle(double a, double b) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca obwód prostokąta
     */
    public static double PerimeterOfRectangle(double a, double b) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca pole stożka
     */
    public static double FieldOfCone(double h, double r) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca objętość stożka
     */
    public static double SizeOfCone(double h, double r) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca pole walca
     */
    public static double FieldOfCylinder(double h, double r) {
        return 0;
    }

    /**
     * Metoda statyczna obliczająca objętość stożka
     */
    public static double SizeOfCylinder(double h, double r) {
        return 0;
    }
}
