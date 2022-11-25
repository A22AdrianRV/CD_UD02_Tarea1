package ejerciciosJava.src;

import java.util.Scanner;

public class ex5{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Luns");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Mércores");
                break;
            case 4:
                System.out.println("Xoves");
                break;
            case 5:
                System.out.println("Venres");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
            System.out.println("Non corresponde a ningún dia");
                break;
        }
        sc.close();
    }

}