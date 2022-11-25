package ejerciciosJava.src;

import java.util.Scanner;

public class Ex6{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int suma = 0;
            if (a>b){
                for (int i =b; i <= a; i++) {
                    suma +=i;
                }
                System.out.println(suma);
            }else {
                for (int i = a; i < b; i++) {
                    suma +=i;

                }
                System.out.println(suma);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
        sc.close();

    }
}