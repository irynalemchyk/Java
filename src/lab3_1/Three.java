package lab3_1;

public class Three {
    double g;
    double h;
    double i;

    public Three(double g, double h, double i) {
        this.g = g;
        this.h = h;
        this.i = i;
    }

    public void print() {
        System.out.println("Клас Three: g = " + g + ", h = " + h + ", i = " + i);
    }

    public void printOne(One obj) {
        System.out.println("Дані екземпляра класу One:");
        obj.print();
    }
}
