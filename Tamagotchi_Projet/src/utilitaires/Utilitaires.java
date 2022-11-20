package utilitaires;

import java.util.Scanner;

public class Utilitaires {
    public static int returnUnChiffre() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try{
            i = sc.nextInt();
        }
        catch(Exception e) {
        }
        return i;
    }

    public static String getStringFromUser() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
}
