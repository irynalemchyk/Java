package lab2_2;

public class Task2 {
    public static void main(String[] args) {
        int n = 245;
        int first = n / 100;
        int second = (n / 10) % 10;
        int third = n % 10;
        int maxDigit;

        if (first > second) {
            if (first > third) {
                maxDigit = first;
            } else {
                maxDigit = third;
            }
        } else {
            if (second > third) {
                maxDigit = second;
            } else {
                maxDigit = third;
            }
        }

        System.out.println("Найбільша цифра числа " + n + " = " + maxDigit);
    }
}
