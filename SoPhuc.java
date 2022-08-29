package studyJavaPTIT;

import java.util.*;

class Complex {
    private double real, imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public String compString(double comp) {
        int temp = (int) comp;
        if (comp == temp)
            return Integer.toString(temp);
        return Double.toString(comp);
    }
    
    public static Complex add(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return(temp);
    }
    
    public static Complex mul(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real * n2.real - n1.imag * n2.imag;
        temp.imag = n1.real * n2.imag + n1.imag * n2.real;
        return(temp);
    }

    @Override
    public String toString() {
        return compString(real) +  " + " + compString(imag) + "i";
    }
    
}
public class SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            Complex a = new Complex(sc.nextDouble(), sc.nextDouble());
            Complex b = new Complex(sc.nextDouble(), sc.nextDouble());
            Complex temp = Complex.add(a, b);
            Complex c = Complex.mul(temp, a);
            Complex d = Complex.mul(temp, temp);
            System.out.println(c + ", " + d);
        }
    }
}