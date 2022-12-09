package model;

import java.io.File;
import java.util.ArrayList;

import static utilitaires.FileManage.openFile;
import static utilitaires.FileManage.readFile;

public class Physique {
    private final ArrayList<String> model;
    private final ArrayList<Integer> id = new ArrayList<>();

    //open model txt and append each line to model


    public Physique() {
        File file = openFile("C:\\Users\\Lhuillery\\Desktop\\ExerciceJava\\Tamomon-Java\\Tamagotchi_Projet\\src\\model\\model.txt");
        this.model = readFile(file);
        for (int i = 0; i < model.size(); i++) {
            id.add(i);
        }
    }

    public ArrayList<String> getModel() {
        return model;
    }

    public ArrayList<Integer> getId() {
        return id;
    }
}
