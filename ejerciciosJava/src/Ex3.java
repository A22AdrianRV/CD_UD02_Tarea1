package ejerciciosJava.src;

import java.util.Scanner;

public class Ex3{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            if (a>=5 && a<10 && a>0){
                System.out.println("Aprobado");
            }else if(a<5 && a<10 && a>0 ){
                System.out.println("Suspenso");
            }else System.out.println("Nota inválida");
            
        }catch (Exception e) {
            System.out.println("Error");
        }
        sc.close();
    }

}