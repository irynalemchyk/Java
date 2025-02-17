package lab2_3;

public class Task3 {
    public static void main (String[] args){
        int a = 10;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
