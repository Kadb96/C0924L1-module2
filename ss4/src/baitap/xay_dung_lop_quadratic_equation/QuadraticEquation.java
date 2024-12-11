package baitap.xay_dung_lop_quadratic_equation;

public class QuadraticEquation {
    double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(this.getDiscriminant())) / 2 / a;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(this.getDiscriminant())) / 2 / a;
        }
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
