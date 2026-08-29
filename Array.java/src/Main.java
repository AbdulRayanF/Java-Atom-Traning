import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] a = new Integer[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            System.out.println(Arrays.toString(a));
        }
    }
}