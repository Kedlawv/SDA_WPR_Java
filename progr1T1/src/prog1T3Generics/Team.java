package prog1T3Generics;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Team team) {
        if (this.points > team.points) {
            return -1;
        }
        if (this.points < team.points) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
