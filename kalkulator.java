import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class kalkulator {
    public static void main(String[] args) throws IOException {
        Scanner num = new Scanner(System.in);

        float firstNumLobyntsev, secondNumLobyntsev, resultSumLobyntsev, resultRoznicaLobyntsev,
        resultIloczynLobyntsev, resultIlorazLobyntsev;

        System.out.print("Wprowadź pierwszą liczbę: ");
        firstNumLobyntsev = num.nextFloat();

        System.out.print("Wprowadź drugą liczbę: ");
        secondNumLobyntsev = num.nextFloat();

        resultSumLobyntsev = firstNumLobyntsev + secondNumLobyntsev;
        resultRoznicaLobyntsev = firstNumLobyntsev - secondNumLobyntsev;
        resultIloczynLobyntsev = firstNumLobyntsev * secondNumLobyntsev;
        resultIlorazLobyntsev = firstNumLobyntsev / secondNumLobyntsev;


        System.out.println("Suma jest równa: " + resultSumLobyntsev);
        System.out.println("Różnica jest równa: " + resultRoznicaLobyntsev);
        System.out.println("Iloczyn jest równy: " + resultIloczynLobyntsev);
        System.out.println("Iloraz jest równy: " + resultIlorazLobyntsev);
    }
}
