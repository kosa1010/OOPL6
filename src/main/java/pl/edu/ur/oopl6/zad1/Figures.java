package pl.edu.ur.oopl6.zad1;

/**
 */
public class Figures {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczajÄ…ca wielkoÅ›Ä‡ figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczaj¹ca pole ko³a
     */
    public static double FieldOfCircle(double r){
        return Math.PI*Math.pow(r,2);
    }

    /**
     * Metoda statyczna obliczaj¹ca obwód ko³a
     */
    public static double PerimeterOfCircle(double r){
        return 2*Math.PI*r;
    }


    public static double FieldOfSquare(double a){
        return 0;
    }


    public static double PerimeterOfSquare(double a){
        return 0;
    }

    public static double FieldOfRectangle(double a, double b){
        return 0;
    }


    public static double PerimeterOfRectangle(double a, double b){
        return 0;
    }

    public static double FieldOfCone(double h, double r){
        return 0;
    }


    public static double SizeOfCone(double h, double r){
        return 0;
    }

    public static double FieldOfCylinder(double h, double r){
        return 0;
    }


    public static double SizeOfCylinder(double h, double r){
        return 0;
    }
}
