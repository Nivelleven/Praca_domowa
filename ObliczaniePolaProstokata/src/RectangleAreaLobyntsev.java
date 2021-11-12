import java.util.Scanner;

public class RectangleAreaLobyntsev {
    Scanner scanner = new Scanner(System.in);
    int wysokosc, dlugosc;

    public void PobieranieDanychLobyntsev(){
        System.out.print("Wprowadź wysokosc: ");
        wysokosc = scanner.nextInt();

        System.out.print("Wprowadź dlugosc: ");
        dlugosc = scanner.nextInt();
    }

    public int ObliczanieDanychLobyntsev(int a, int b){
        a = wysokosc;
        b = dlugosc;
        return a * b;
    }

    public void WyswietlaniePolaLobyntsev(){
        System.out.println("Pole prostokąta jest równe: " + ObliczanieDanychLobyntsev(wysokosc, dlugosc));
    }
}