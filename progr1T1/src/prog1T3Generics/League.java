package prog1T3Generics;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private String name;
    private List<T> teamList;
    int scale = 1000;


    public League(String name) {
        this.name = name;
        teamList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addTeam(T team) {
        this.teamList.add(team);
    }

    public void addTeam(T[] teams) {
        this.teamList.addAll(Arrays.asList(teams));
    }


    /**
     * javadoc
     * depricated method because it's shit
     * replaced with printTeamsStream()
     */

    @Deprecated
    public void printTeams() {
        long timeStampBefore = Instant.now().getNano();
        Collections.sort(teamList);
        System.out.println("\n" + this.name);
        for (T t : teamList) {
            System.out.printf("%s : %s", t.getName(), t.getPoints());
        }
        long timeStampAfter = Instant.now().getNano();

        System.out.printf("before %d : after %d%n", timeStampBefore, timeStampAfter);
        System.out.println("%nFor : " + (timeStampAfter - timeStampBefore) / scale);


    }


    public void printTeamsStream() {
        long timeStampBefore = Instant.now().getNano();

        teamList.stream().sorted().forEach(t -> System.out
                .printf("%s : %s", t.getName(), t.getPoints()));
        // dla kazdej zmiennej t ktora jest elementem strumienia wykonaj kod


        long timeStampAfter = Instant.now().getNano();

        System.out.printf("before %d : after %d%n", timeStampBefore, timeStampAfter);
        System.out.println("%nStream : " + (timeStampAfter - timeStampBefore) / scale);
    }

    @SuppressWarnings("unused")
    public void printTeamsOther() {
        Collections.sort(teamList);

        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(teamList.get(i));
        }
    }

    public List<T> getTeamList() {
        return teamList;
    }
}
