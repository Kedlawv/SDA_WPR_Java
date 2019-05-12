package pl.sdacademy.stringtest;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        StringUtils utils = new StringUtils();
        Scanner scanner = new Scanner(System.in);

        log("Podaj tekst");
        String tekst = scanner.nextLine();

        String s1 = "Dan";
        String s2 = "Dan";

        String s3 = new String("Dan");
        String s4 = new String("Dan");

        System.out.println(s1==s2);
        System.out.println(s3==s4);

        log("" + utils.textLength(tekst));
        log(utils.toUpper(tekst));
        log(utils.replace(tekst));
        logSArr(utils.split(tekst));
        log(utils.findLetter(tekst, "K")+"");



    }

    public static void log(String str){
        System.out.println(str);
    }

    public static void logSArr(String[] strArr){
        for(String item : strArr){
            log(item);
        }
    }
}
