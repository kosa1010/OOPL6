package pl.edu.ur.oopl6.zad1;

/**
 */
public class Figures {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczaj�ca wielko�� figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczaj�ca pole ko�a
     */
    public static double FieldOfCircle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczaj�ca obw�d ko�a
     */
    public static double PerimeterOfCircle(double r) {
        return 2 * Math.PI * r;
    }

    /**
     * Metoda statyczna obliczaj�ca pole kwadratu
     */
    public static double FieldOfSquare(double a) {
        return a * a;
    }

    /**
     * Metoda statyczna obliczaj�ca obw�d kwadratu
     */
    public static double PerimeterOfSquare(double a) {
        return 4 * a;
    }

    /**
     * Metoda statyczna obliczaj�ca pole prosto�ta
     */
    public static double FieldOfRectangle(double a, double b) {
        return a * b;
    }

    /**
     * Metoda statyczna obliczaj�ca obw�d prostok�ta
     */
    public static double PerimeterOfRectangle(double a, double b) {
        return a + a + b + b;
    }

    /**
     * Metoda statyczna obliczaj�ca pole sto�ka
     */
    public static double FieldOfCone(double h, double r) {
        return FieldOfCircle(r) * h / 3;
    }

    /**
     * Metoda statyczna obliczaj�ca obj�to�� sto�ka
     */
    public static double SizeOfCone(double h, double r) {
        return FieldOfCircle(r) + (Math.PI * Math.sqrt(h * h + r * r) * r);
    }

    /**
     * Metoda statyczna obliczaj�ca pole walca
     */
    public static double FieldOfCylinder(double h, double r) {
        return 2 * FieldOfCircle(r) + (PerimeterOfCircle(r) * h);
    }

    /**
     * Metoda statyczna obliczaj�ca obj�to�� sto�ka
     */
    public static double SizeOfCylinder(double h, double r) {
        return FieldOfCircle(r) * h;
    }
}
