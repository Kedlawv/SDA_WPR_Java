package figury;
import java.util.Random;

public class Punkt {

    private int x;
    private int y;

    public Punkt(){
        System.out.println("Konstruktor bezparametrowy");
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Konstruktor klasy Punkt2D");
    }

    public static void main(String[] args){
        Punkt p = new Punkt();
        Punkt p2 = new Punkt(2,4);
    }

}
