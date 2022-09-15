import java.util.Scanner;
import java.util.Locale;
public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy szöveget");

        String szoveg = sc.nextLine();
        String menuPont = "";
        while(!menuPont.equals("f")){
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - nagybetűssé alakítás");
            System.out.println("\tb - Kisbetűssé alakítani");
            System.out.println("\tc - lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani a másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiíratni");
            System.out.println("\tf - Kilépés");
            System.out.println("Adja meg a menüpontot: ");
            menuPont = sc.nextLine();
            switch (menuPont){
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter\n", szoveg.length());
                    break;
                case "d":
                    System.out.println("Kérem adja meg a másik szöveget: ");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = szoveg.compareToIgnoreCase(szoveg2);
                    if (osszehasonlitas < 0){
                        System.out.println("Az első szöveg előrébb van az ABC-ben");
                    }else if (osszehasonlitas > 0){
                        System.out.println("A második szöveg előrébb van az ABC-ben");
                    }else{
                        System.out.println("A két szöveg ugyan az");
                    }
                    break;
                case "e":
                    break;
                case "f":
                    break;
                default:

                    break;
            }
        }
    }
}
