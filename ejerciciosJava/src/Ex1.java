package ejerciciosJava.src;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try{
            int a = sc.nextInt();
            if (a % 2==0){
                System.out.println("Es par");
            }else System.out.println("Es impar");
        } catch (Exception e){
            System.out.println("Error");
        }
        sc.close();
    }
}
