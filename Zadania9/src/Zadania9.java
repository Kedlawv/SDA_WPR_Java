public class Zadania9 {

    void wypiszWKierunku(int[] tablica, boolean doPrzodu) {

        if (doPrzodu) {

            for (int i = 0; i < tablica.length; i++) {
                System.out.print(tablica[i] + " ");
            }

        } else {
            for (int i = tablica.length - 1; i >= 0; i--) {
                System.out.print(tablica[i] + " ");

            }
        }
    }

    void zamien(int a, int b, int[] tablica) {

        if (a == 0 || b == 0 || a > tablica.length || b > tablica.length) {
            System.out.println("Niedozwolony parametr");
            return;
        }

        System.out.print("Tablica przed zamiana:");
        for (int el : tablica) {
            System.out.print(el + " ");
        }

        int temp = tablica[a - 1];
        tablica[a - 1] = tablica[b - 1];
        tablica[b - 1] = temp;

        System.out.print("Tablica po zamianie:");
        for (int el : tablica) {
            System.out.print(el + " ");
        }
    }

    int wystepuje(int liczba, int[] tablica){
         int ilosc = 0;
         for(int el : tablica){
             if(el == liczba){
                 ilosc++;
             }
         }
         System.out.println("Liczba wystepuje: " + ilosc + " razy.");
         return ilosc;
    }

    boolean czyMozliwyTrojkat(int a, int b, int c){
        System.out.println("a = " + a + "| b = " + b + "| c = " + c);
        System.out.println("a + b = " + (a+b) + "| a + c = " + (a + c) + "| b + c = " + (b+c) );

        if(a + b >= c && a + c >= b && b + c >= a){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }


    public static void main(String[] args) {

        Zadania9 zd = new Zadania9();
//        zd.wypiszWKierunku(new int[]{1,2,3,4,5,6,7}, false);
//        zd.zamien(2, 6, new int[]{1, 2, 3, 4, 5, 6});
//        zd.wystepuje(6, new int[]{1,2,3,4,4,5,6,6,6});
        zd.czyMozliwyTrojkat(1,2,3);
//
    }
}
