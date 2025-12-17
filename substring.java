import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        // String s="dhiraj";
        for (int i = 0; i < s.length(); i++) {
            // char ch=s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                // char ch1=s.charAt(j);
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println(" ");

        }

    }
}
