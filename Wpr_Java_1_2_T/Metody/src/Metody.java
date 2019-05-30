public class Metody {

    void przywitajSie() {
        System.out.println("Czesc");
    }

    void writeToConsole() {
        System.out.println("Gotowe");
    }

    double returnSqrt(int a) {
        return Math.sqrt(a);
    }

    double obliczKoloPola(int r) {
        return Math.PI * r * r;
    }

    void outArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " \n"); // \n to po prostu znak nowej linii
        }
    }

    void tabMnoz(int rozmiar) {
        for (int i = 1; i <= rozmiar; i++) {
            for (int j = 1; j <= rozmiar; j++) {
                System.out.print(String.format("%3d ", (i * j))); //String.format formatuje text, nie konieczne do zadania
            }

            System.out.println();
        }
    }

    boolean isEven(int liczba) {
        return liczba % 2 == 0;
    }

    boolean isInArray(int value, int[] array) {
        for (int v : array) {
            if (v == value) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        new Metody().przywitajSie();

        Metody myMetody = new Metody();
        myMetody.przywitajSie();
        myMetody.writeToConsole();

        System.out.println(myMetody.returnSqrt(66));
        System.out.println(myMetody.obliczKoloPola(5));

        myMetody.outArray(new int[]{1, 2, 3, 4, 5, 6}); //new int[]{} to po prostu skrot na inicjacje nowej tablicy i podanie wartosci elementow
        myMetody.tabMnoz(20);

        System.out.println(myMetody.isEven(2));
        System.out.println(myMetody.isEven(3));

        System.out.println(myMetody.isInArray(3, new int[]{3,3,4,5,56}));
        System.out.println(myMetody.isInArray(3, new int[]{8,7,4,5,56}));




    }
}
