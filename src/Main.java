import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.printf("Unesite odredisni planet (M, J ili S).%nNakon toga unesite status vjernosti (G, S ili N) %nNa kraju unesite svoju dob.%n");
        char odredisniPlanet = skener.next().charAt(0);
        char statusVjernosti = skener.next().charAt(0);
        int dob = skener.nextInt();
        double osnovnaCijena, cijena, ukupniPopust = 0;

        switch (odredisniPlanet) {
            case 'M':
                osnovnaCijena = 50000;
                break;
            case 'J':
                osnovnaCijena = 80000;
                break;
            case 'S':
                osnovnaCijena = 120000;
                break;
            default:
                System.out.println("Krivo uneseni planet!");
                osnovnaCijena = 0f;
        }

        if (statusVjernosti == 'G'){
            cijena = osnovnaCijena * 0.85;
            ukupniPopust =  osnovnaCijena * 0.15;
        } else if (statusVjernosti == 'S') {
            cijena = osnovnaCijena * 0.9;
            ukupniPopust =  osnovnaCijena * 0.1;
        } else {
            cijena = osnovnaCijena;
        }

        if (dob < 16) {
            cijena -= 5000;
            ukupniPopust += 5000;
        } else if (dob > 60) {
            cijena -= 2000;
            ukupniPopust += 2000;
        }

        System.out.println("Osnovna cijena je: " + osnovnaCijena + ", ukupno ste ustedjeli: " + ukupniPopust + ", te vasa konacna cijena iznosi: " + cijena);
    }
}