package utilitaires;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManage {

    public static File openFile(String path) {
        File file = new File(path);
        return file;
    }

    public static File createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("File created: " + file.getName());
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
        return file;
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

    public static void writeInFile(File file, ArrayList<String> lines) {
        try {
            java.io.FileWriter myWriter = new java.io.FileWriter(file);
            for(String line : lines) {

                myWriter.write(line);
                myWriter.write(System.getProperty("line.separator"));

            }
            myWriter.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static boolean fileExist(String path) {
        File file = new File(path);
        return file.exists();
    }
}
