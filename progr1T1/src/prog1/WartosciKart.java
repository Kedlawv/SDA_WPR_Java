package prog1;

public enum WartosciKart {
    DZIEWIEC(9),
    DZIESIEC(10),
    WALET(2),
    DAMA(3),
    KROL(4),
    AS(11),
    JOKER(-1);

    int wartosc;

    WartosciKart(int wartosc){
        this.wartosc = wartosc;
    }
}
