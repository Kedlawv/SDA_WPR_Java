package prog1T3Generics;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        FootballTeam fbTeam1 = new FootballTeam("Atletico Madrid");
        FootballTeam fbTeam2 = new FootballTeam("Chelsea FC");
        FootballTeam fbTeam3 = new FootballTeam("Juventus Turyn");
        FootballTeam fbTeam4 = new FootballTeam("Arsenal Londyn");

        VolleyballTeam vbTeam1 = new VolleyballTeam("Skra Belchatow");
        VolleyballTeam vbTeam2 = new VolleyballTeam("Asseco Resovia");
        VolleyballTeam vbTeam3 = new VolleyballTeam("Zaksa");
        VolleyballTeam vbTeam4 = new VolleyballTeam("Onico Warszawa");

        fbTeam1.setPoints(15);
        fbTeam2.setPoints(10);
        fbTeam3.setPoints(12);
        fbTeam4.setPoints(8);


        vbTeam1.setPoints(4);
        vbTeam2.setPoints(5);
        vbTeam3.setPoints(17);
        vbTeam4.setPoints(12);

        League<FootballTeam> championsLeague = new League("Champions League");
        championsLeague.addTeam(new FootballTeam[]{fbTeam1, fbTeam2, fbTeam3, fbTeam4});

        League<FootballTeam> innaLiga = new League("Inna liga");
        innaLiga.addTeam(new FootballTeam[]{fbTeam1, fbTeam2, fbTeam3, fbTeam4});


        championsLeague.printTeams();

        League<VolleyballTeam> plusLiga = new League("PlusLiga");
        plusLiga.addTeam(new VolleyballTeam[]{vbTeam1, vbTeam2, vbTeam3, vbTeam4});
        plusLiga.printTeams();

        //todo Comparable, Comparator, Genererics , Streams, Lambdas, Predicate

        championsLeague.getTeamList()// pobieramy listę drużyn
                .stream()//z listy drużyn generujemy strumień
                .forEach(System.out::println);// dla kazdego elementu strumienia(listy druzyny)
        // wywołujemy metodę println. Dla pakietu System.out :: wykonaj metode println i podaj element
        //strumienia jako argument.

        // for each wersja
        for (Team t : championsLeague.getTeamList()) {
            System.out.println(t);
        }

        championsLeague.getTeamList()
                .stream()
                .filter(o -> o.getPoints() > 10 && o.getPoints() < 15)
                // (o -> o.getPoints() > 10 && o.getPoints()<15) mogloby byc metoda(o)
                .forEach(System.out::println);
        // strzalka -> oznacza "wykonaj"

        List<Team> zlaczenie =
                Stream.concat(championsLeague.getTeamList().stream(),
                        innaLiga.getTeamList().stream()) // laczymy dwa strumienie
                        .collect(Collectors.toList());//zamieniamy strumien na liste

        zlaczenie = Stream.of(championsLeague.getTeamList(), innaLiga.getTeamList())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        System.out.println("____________printTeamsStream____________");
        championsLeague.printTeamsStream();

        championsLeague.printTeams();
        championsLeague.printTeamsStream();

        silnia(7);

        sumaISredniaDopokiNieZero(new int[]{3, 4, 5, 56, 67, 0, 3, 4, 5, 6, 7});
        sumaISredniaDopokiNieZero(new int[]{1, 2, 3, 0});
        sumaISredniaDopokiNieZero(new int[]{0, 1, 2, 3, 4});
        sumaISredniaDopokiNieZero(new int[]{});

        for (int i : (fibonnaci(30))) {
            System.out.print(i + " ");
        }


    }

    public static void silnia(int n) {
        int silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }
        System.out.printf("Silnia %d to %d%n", n, silnia);
    }

    public static void sumaISredniaDopokiNieZero(int[] tablicaN) {
        if (tablicaN.length == 0) {
            System.out.println("Tablica jest pusta");
            return;
        }

        int iloscN = 0;
        double suma = 0;
        for (int i = 0; i < tablicaN.length; i++) {
            if (tablicaN[i] == 0) {
                break;
            } else {
                suma += ((Integer) tablicaN[i]).doubleValue();
                iloscN++;
            }
        }
        System.out.println("Suma: " + suma + " Srednia: " +
                suma / iloscN);
    }

    public static int[] fibonnaci(int n) {
        if (n <= 1) {
            return new int[]{1};
        }

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;

    }
}
