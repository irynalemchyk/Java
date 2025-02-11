package lab2_2;

public class Task4 {
    public static void main(String[] args) {
        String input = "Так";

        switch (input) {
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невірний вибір!");
        }
    }
}