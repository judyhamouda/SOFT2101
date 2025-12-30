import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = a + 1; i < b; i++) {
<<<<<<< HEAD
            if (i % 2 == 0) {

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b + 1; i < a; i++) {

                System.out.println(i);
            }
        }

        input.close();
=======
    if (i % 2 != 0) {
        System.out.println(i);
    }
}

>>>>>>> feature-2
    }
}


