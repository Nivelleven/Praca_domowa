package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float weightLobyntsev, heightLobyntsev, resultLobyntsev;

        Scanner num = new Scanner(System.in);

        System.out.print("Wprowadź swoją wagę: ");
        weightLobyntsev = num.nextFloat();

        System.out.print("Wprowadź swój wzrost w metrach: ");
        heightLobyntsev = num.nextFloat();


        resultLobyntsev = (weightLobyntsev / ((float)Math.pow(2.0f, heightLobyntsev)));

        if (resultLobyntsev < 16.00f) {
            System.out.println("Twój BMI: " + resultLobyntsev + " - wygłodzenie");
        } else if (resultLobyntsev >= 16.00f){
            if (resultLobyntsev <= 16.99f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - wychudzenie");
            }
        } else if (resultLobyntsev >= 17.00f){
            if (resultLobyntsev <= 18.49f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - niedowaga");
            }
        } else if (resultLobyntsev >= 18.50f){
            if (resultLobyntsev <= 22.99f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - norma niski przedział");
            }
        } else if (resultLobyntsev >= 23.00f){
            if (resultLobyntsev <= 24.99f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - norma wysoki przedział");
            }
        } else if (resultLobyntsev >= 25.00f){
            if (resultLobyntsev <= 27.49f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - nadwaga niski przedział");
            }
        } else if (resultLobyntsev >= 27.50f){
            if (resultLobyntsev <= 29.99f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - nadwaga wysoki przedział");
            }
        } else if (resultLobyntsev >= 30){
            if (resultLobyntsev <= 34.9f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - otyłość I stopnia");
            }
        } else if (resultLobyntsev >= 35){
            if (resultLobyntsev <= 39.9f){
                System.out.println("Twój BMI: " + resultLobyntsev + " - otyłość II stopnia");
            }
        } else if (resultLobyntsev >= 40){
            System.out.println("Twój BMI: " + resultLobyntsev + " - otyłość III stopnia");
        }
    }
}
