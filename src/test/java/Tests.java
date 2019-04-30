import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl6.zad1.Figures;
import pl.edu.ur.oopl6.zad3.Complex;

/**
 */
public class Tests {

    @Test(timeout = 10000)
    public void testEx1Square(){

        Assert.assertEquals(25, Figures.FieldOfSquare(5), 0);
        Assert.assertEquals(20, Figures.PerimeterOfSquare(5), 0);
    }

    @Test(timeout = 10000)
    public void testEx1Rectangle(){
        Assert.assertEquals(50, Figures.FieldOfRectangle(5, 10), 0);
        Assert.assertEquals(30, Figures.PerimeterOfRectangle(5, 10), 0);
    }

    @Test(timeout = 10000)
    public void testEx1Cone(){
        Assert.assertEquals(190.0, Figures.FieldOfRectangle(5, 5), 5.0);
        Assert.assertEquals(130.0, Figures.SizeOfCone(5, 5), 5.0);
    }

    @Test(timeout = 10000)
    public void testEx1Cylinder(){
        Assert.assertEquals(314.0, Figures.FieldOfRectangle(5, 5), 5.0);
        Assert.assertEquals(392.0, Figures.SizeOfCone(5, 5), 5.0);
    }

    public Complex init(double re, double im){
        Complex a = new Complex(re, im);

        return a;
    }


    @Test(timeout = 10000)
    public void testEx3ComplexPlus(){
        Complex a = init(5.0, 6.0);
        Complex b = init(-3.0, 4.0);

        Complex c = b.plus(a);

        Assert.assertEquals(2.0, c.getRe(), 0);
        Assert.assertEquals(10.0, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexMinus(){
        Complex a = init(5.0, 6.0);
        Complex b = init(-3.0, 4.0);

        Complex c = a.minus(b);

        Assert.assertEquals(8.0, c.getRe(), 0);
        Assert.assertEquals(2.0, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexAmultiply10(){
        Complex a = init(5.0, 6.0);

        Complex c = a.scale(10);

        Assert.assertEquals(50.0, c.getRe(), 0);
        Assert.assertEquals(60.0, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexAmultiplyB(){
        Complex a = init(5.0, 6.0);
        Complex b = init(-3.0, 4.0);

        Complex c = a.times(b);

        Assert.assertEquals(-39.0, c.getRe(), 0);
        Assert.assertEquals(2.0, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexBMultiplyA(){
        Complex a = init(5.0, 6.0);
        Complex b = init(-3.0, 4.0);

        Complex c = b.times(a);

        Assert.assertEquals(-39.0, c.getRe(), 0);
        Assert.assertEquals(2.0, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexADivideB(){
        Complex a = init(5.0, 6.0);
        Complex b = init(-3.0, 4.0);

        Complex c = a.divides(b);

        Assert.assertEquals(0.36, c.getRe(), 0);
        Assert.assertEquals(-1.52, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexConjugate(){
        Complex a = init(5.0, 6.0);

        Complex c = a.conjugate();

        Assert.assertEquals(5.0, c.getRe(), 0);
        Assert.assertEquals(-6.0, c.getIm(), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexSin(){
        Complex a = init(5.0, 6.0);

        Complex c = a.sin();

        Assert.assertEquals(-193, c.getRe(), 0.5);
        Assert.assertEquals(57, c.getIm(), 0.5);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexCos(){
        Complex a = init(5.0, 6.0);

        Complex c = a.cos();

        Assert.assertEquals(57.0, Math.round(c.getRe()), 0);
        Assert.assertEquals(193.0, Math.round(c.getIm()), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexTan(){
        Complex a = init(5.0, 6.0);

        Complex c = a.tan();

        Assert.assertEquals(0, Math.round(c.getRe()), 0);
        Assert.assertEquals(1, Math.round(c.getIm()), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexAbs(){
        Complex a = init(5.0, 6.0);

        Assert.assertEquals(8, Math.round(a.abs()), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexExp(){
        Complex a = init(5.0, 6.0);

        Complex c = a.exp();

        Assert.assertEquals(143.0, Math.round(c.getRe()), 0);
        Assert.assertEquals(-41.0, Math.round(c.getIm()), 0);
    }

    @Test(timeout = 10000)
    public void testEx3ComplexReciprocal(){
        Complex a = init(5.0, 6.0);

        Complex c = a.reciprocal();

        Assert.assertEquals(0.08, c.getRe(), 0.01);
        Assert.assertEquals(-0.09, c.getIm(), 0.01);
    }
}
 