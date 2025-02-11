package lab3_1;

public class One {
    // змінні екземпляра класу
    double a;
    double b;
    double c;

    // конструктор класу
    public One(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print () {
        System.out.println("Клас One: a = " + a + ", b = " + b + ", c = " + c);
    }

    public double sum () {
        return a + b + c;
    }

}
