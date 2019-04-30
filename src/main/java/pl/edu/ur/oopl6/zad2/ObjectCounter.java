package pl.edu.ur.oopl6.zad2;

import java.util.Random;

/**
 */
public class ObjectCounter {
    public static void main(String[] args){
        Point[] p = new Point[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Point(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Point.last_point.toString());
        System.out.println("-------------------------------------------------");
        Point.ShowLastPoint();
    }
}
