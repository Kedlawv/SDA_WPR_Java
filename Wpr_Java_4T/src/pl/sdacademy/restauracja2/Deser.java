package pl.sdacademy.restauracja2;

public class Deser extends Danie {



    public Deser(String nazwaDeseru, double cena_deseru){
        this.nazwa = nazwaDeseru;
        this.cena = cena_deseru;
    }


    @Override
    public double wartosc() {

        if (cena < 9) {
            return cena + 5;
        }

        if (cena > 20) {
            return cena * 0.9;
        }

        return cena;
    }
}
