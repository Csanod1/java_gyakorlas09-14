import java.util.Scanner;




    public class Feladat1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kérem adja meg a medence átmérőjét: ");
            double diameter = sc.nextDouble();
            System.out.println("Kérem adja meg a medence magasságát: ");
            double height = sc.nextDouble();

            double volume = (diameter / 2) * (diameter / 2) * Math.PI * height;
        /*
        Egész szám %d
        Tört szám %f
        Szöveg, egyéb %s
         */
            System.out.printf("A medence térfogata %.3f köbméter", volume);

        }
    }
