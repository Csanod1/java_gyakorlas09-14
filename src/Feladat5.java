import java.util.Scanner;
public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát");
        var a = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Kérem adja meg a téglalap 'b' oldalát");
        var b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Kérem adja meg a mit szeretne kiszámítani ('K' kerület 'T' terület)");
        String muvelet = sc.nextLine();

        if (muvelet.equals("K")) {
            double kerulet = (a + b) * 2;
            System.out.printf("A téglalap kerülete %f.2 cm.",kerulet);
        }else if (muvelet.equals("T")){
            double terulet = a*b;
            System.out.printf("A téglalap területe %f.2 cm^2.",terulet);
        }else{
            System.out.println("hibás műveletet adot meg");
        }
        if (a==b){
            System.out.println("A megadott téglalap egy négyzet");
        }


    }
}
