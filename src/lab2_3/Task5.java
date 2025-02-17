package lab2_3;

public class Task5 {
    public static void main(String[] args) {
        int number = 0;
        for(int h = 0; h < 24; h++) {
            for(int m = 0; m < 60; m++) {

                int first = h / 10;
                int second = h % 10;
                int third = m / 10;
                int fourth = m % 10;

                if (first == fourth && second == third) {
                    number++;
                }
            }
        }
        System.out.println("Кількість симетричних комбінацій: " + number);
    }
}
