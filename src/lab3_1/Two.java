package lab3_1;

public class Two {
    // змінні екземпляра класу
    double d;
    double e;
    double f;

    // конструктор класу
    public Two(double d, double e, double f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public void print () {
        System.out.println("Клас Two: d = " + d + ", e = " + e + ", f = " + f);
    }

    public double sum () {
        return d + e + f;
    }

}
