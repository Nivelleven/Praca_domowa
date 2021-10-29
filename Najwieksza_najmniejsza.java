public class Najwieksza_najmniejsza {
    public static void main(String[] args){
        int i = 0;
        double minLobyntsev = 100;
        double maxLobyntsev = 0;

        while (i < 10){
            double randomLobyntsev = Math.random() * 100;
            System.out.println(String.format("%.2f%n", randomLobyntsev));
            if (randomLobyntsev > maxLobyntsev)
                maxLobyntsev = randomLobyntsev;

            if (randomLobyntsev < minLobyntsev)
                minLobyntsev = randomLobyntsev;
            i++;
        }

        System.out.println("Minimalna liczba jest: " + String.format("%.2f%n", minLobyntsev));
        System.out.println("Maxymalna liczba jest: " + String.format("%.2f%n", maxLobyntsev));
    }
}
