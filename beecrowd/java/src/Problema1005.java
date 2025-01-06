import java.util.Scanner;

public class Problema1005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble() * 3.5;
        double num2 = sc.nextDouble() * 7.5;

        System.out.printf("MEDIA = %.5f", (num1 + num2)/11);
        System.out.println("");
    }

}
