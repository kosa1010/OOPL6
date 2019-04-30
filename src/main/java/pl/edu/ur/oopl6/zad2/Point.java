package pl.edu.ur.oopl6.zad2;

/**
 */
public class Point {

    private int x;
    private int y;
    private int z;

    // Pole statyczne przechowuj�ce w pami�ci ilo�� obiekt�w klasy Punkt
    // Pole jest wsp�dzielone dla wszystkich obiekt�w
    private static int counter;
    public static Point last_point;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;
        last_point = this;
    }

    public static void ShowLastPoint() {
        System.out.println("Klasa Punkt o wsp�rz�dnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje ju�"
                + " " + last_point.counter + " obiekt tej klasy.");
    }

    @Override
    public String toString(){
        String s = "Klasa Punkt o wsp�rz�dnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje ju�"
                + " " + last_point.counter + " obiekt tej klasy.";
        return s;
    }

}
