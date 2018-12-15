import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int liczba1;
        int liczba2;
        String znak;

        Scanner czytaj = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe:");
        liczba1 = czytaj.nextInt();
        czytaj.nextLine(); // bez tego pomija zapytanie o znak dzialania
        System.out.println("Podaj znak dzialania:");
        znak = czytaj.nextLine();
        System.out.println("Podaj druga liczbe:");
        liczba2 = czytaj.nextInt();

        switch(znak){
            case "+":
                System.out.println("Wynik to: "+(liczba1 + liczba2));
                break;
            case "-":
                System.out.println("Wynik to: "+(liczba1 - liczba2));
                break;
            case "*":
                System.out.println("Wynik to: "+(liczba1 * liczba2));
                break;
            case "/":
                System.out.println("Wynik to: "+(liczba1 / liczba2));
                break;
            default:
                System.out.println("Podano nieprawidlowy znak. Dostepne znaki to +, -, *, /");
        }


    }
}
