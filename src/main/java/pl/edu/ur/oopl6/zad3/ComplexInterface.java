package pl.edu.ur.oopl6.zad3;

/**
 */
public interface ComplexInterface {

    double abs();
    Complex plus(Complex b);
    Complex minus(Complex b);
    Complex times(Complex b);
    Complex scale(double alpha);
    Complex conjugate();
    Complex reciprocal();
    Complex divides(Complex b);
    Complex exp();
    Complex sin();
    Complex cos();
    Complex tan();
    void setRe(double re);
    void setIm(double im);
    double getRe();
    double getIm();


}
