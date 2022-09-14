import java.util.Scanner;
public class Feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg=0;
        int paros = 0;
        int paratlan = 0;
        while (osszeg <= 100){
            System.out.print("Adjon meg egy számot");
            int szam = sc.nextInt();
            osszeg += szam;
            if (szam%2==0){
                paros++;
            }else{
                paratlan++;
            }
        }
        System.out.printf("Összesen %d db páros és %d db páratlan szám volt", paros, paratlan);
    }
}
