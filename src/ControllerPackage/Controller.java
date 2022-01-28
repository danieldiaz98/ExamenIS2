/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerPackage;

import Model.HystoricEvent;
import Model.Photo;
import Model.PhotoGallery;
import Persistence.PhotoLoader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Entrar
 */
public class Controller {
    
    private String fileName;
    
    public Controller (String fileName) {
        this.fileName = fileName;
    }
    
    public void controll () {
        ArrayList<HystoricEvent> historicEvents = new ArrayList<>();
        ArrayList<String> eventNames = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (true) {
                String line = reader.readLine().split(" ")[0];
                eventNames.add(line);
                if (line == null) {
                    break;
                }
            }
        } catch (IOException ex) {}
        for (String s : eventNames) {
            HystoricEvent he = new HystoricEvent(s,new PhotoGallery());
            historicEvents.add(he);
        }
    }
}
