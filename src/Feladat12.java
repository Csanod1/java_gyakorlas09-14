import java.util.Scanner;
public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy összeget (min 1, max 1000Ft)");
        double maradek = sc.nextInt();
        double osszeg = maradek;
        double ketszaz = 0;
        double szaz = 0;
        double otven = 0;
        double husz = 0;
        double tiz = 0;
        double ot = 0;

        ketszaz = Math.floor(maradek/200);
        maradek -= (ketszaz*200);
        szaz = Math.floor(maradek/100);
        maradek -= (szaz*100);
        otven = Math.floor(maradek/50);
        maradek -= (otven*50);
        husz = Math.floor(maradek/20);
        maradek -= (husz*20);
        tiz = Math.floor(maradek/10);
        maradek -= (tiz*10);
        ot = Math.floor(maradek/5);
        maradek -= (ot*5);

        System.out.printf("A %.0f Ft-ot így lehet a lehető legkevesebb érméből összerakni \n",osszeg);
        System.out.printf("200 Ft-os: %.0f\n", ketszaz);
        System.out.printf("100 Ft-os: %.0f\n", szaz);
        System.out.printf("50 Ft-os: %.0f\n", otven);
        System.out.printf("20 Ft-os: %.0f\n", husz);
        System.out.printf("10 Ft-os: %.0f\n", tiz);
        System.out.printf("5 Ft-os: %.0f\n", ot);
        System.out.printf("Maradék: %.0f", ketszaz);




    }
}
