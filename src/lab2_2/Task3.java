package lab2_2;

public class Task3 {
    public static void main(String[] args) {
        String direction = "До низу";
        int floor = 2;

        if (direction.equals("До гори")) {
            if (floor == 2 || floor == 3) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (floor >= 1 && floor <= 9) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            } else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        } else if (direction.equals("До низу")) {
            if (floor == 2 || floor == 1) {
                System.out.println("Ви спустились на 1 поверх");
            } else if (floor >= 3 && floor <= 9) {
                System.out.println("Ви спустились на " + floor + " поверх");
            } else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        } else {
            System.out.println("Невірний напрямок!");
        }
    }
}