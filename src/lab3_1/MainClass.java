package lab3_1;

public class MainClass {
    public static void main(String[] args) {
        One obj1 = new One(1.1, 2.2, 3.3);
        Two obj2 = new Two(4.4, 5.5, 6.6);
        Three obj3 = new Three(7.7, 8.8, 9.9);

        obj1.print();
        System.out.println("Сума у класі One: " + obj1.sum());

        obj2.print();
        System.out.println("Сума у класі Two: " + obj2.sum());

        obj3.print();
        obj3.printOne(obj1);
    }
}
