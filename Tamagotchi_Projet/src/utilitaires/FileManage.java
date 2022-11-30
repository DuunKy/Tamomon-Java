package utilitaires;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManage {

    public static File openFile(String path) {
        File file = new File(path);
        return file;
    }

    public static void createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<String> readFile(File file) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
        return lines;
    }

    public static void writeFile(File file, ArrayList<String> lines) {
        try {
            for(String line : lines) {
                System.out.println(line);
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
