
import java.util.Scanner;

class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[7];
        for (int i = 0; i < 7; i++) {
            System.err.println("enter the element:-");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(a[i] * 2);
        }
    }
}
