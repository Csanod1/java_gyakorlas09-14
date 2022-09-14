import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a fal szélességét (m)");
        double szelesseg = sc.nextDouble() * 100;
        System.out.print("Kérem adja meg a fal magasságát (m)");
        double magassag = sc.nextDouble() * 100;

        double csempeszam = Math.round((szelesseg * magassag * 1.1) / (20 * 20));
        System.out.printf("A burkolónak %.0f db csempére van szüksége", csempeszam);


    }
}
