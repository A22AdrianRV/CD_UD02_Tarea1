package ejerciciosJava.src;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            System.out.println((num1 + num2) / 2);
        } catch (Exception e) {
            System.out.println("error");
        }

        sc.close();

    }

}