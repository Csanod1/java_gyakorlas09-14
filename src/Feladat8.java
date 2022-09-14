import java.util.Scanner;
public class Feladat8 {
    public static void main(String[] args) {
        System.out.print("Kérem adja meg a tippét ()");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        //Veletlen egész szám a és b köött: (int) (Math.random() b - a+1) + a
        int feldobas = (int) (Math.random() * 2);
        String feldobaszSzoveg = (feldobas == 0) ? "Fej" : "Irás";
        System.out.printf("A dobás eredménye %s", feldobaszSzoveg);
        if (tipp == feldobas){
            System.out.println("Gratulálok nyert");
        }else{
            System.out.println("Sajnos most nem nyert, próbálkozzon újra");
        }
    }
}
