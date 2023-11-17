package Calcolatrice;

import java.util.Scanner;

public class Calcolatrice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        double numero1= scanner.nextDouble();
        double numero2= scanner.nextDouble();

        System.out.println("Select Operation:");
        String operation= scanner.next();

        System.out.println(numero1 +" "+ operation +" "+ numero2 + " = " + calcolo(numero1, numero2, operation));
    }

    public static double calcolo(double numero1, double numero2,String operation) {
        double result = 0;

        switch (operation){
            case "*":
                result= numero1 * numero2 ;
                break;
            case "-":
                result= numero1 - numero2;
                break;
            case "+":
                result= numero1 + numero2;
                break;
            case "/":
                if(numero2 != 0 ){
                    result= numero1 / numero2;
                }else{
                    System.out.println("Errore, impossibile dividere per zero");
                }
                break;
            default:
                System.out.println("Errore, simbolo non trovato");
        }
        return result;
    }
}
