package lab2_3;

public class Task4 {
        public static void main(String[] args) {
        int n,f;
        f = 1;
        n = 10;
            for(int i=1; i<=n; i++) {
                f = f*i;
            }
            System.out.println(n+"! = "+f);
        }
}