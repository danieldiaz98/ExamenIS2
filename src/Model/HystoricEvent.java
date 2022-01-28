/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Entrar
 */
public class HystoricEvent {
    
    private String name;
    private ExpansionTrayectory trayectory;
    private PhotoGallery gallery;
    
    public HystoricEvent (String nam, PhotoGallery gallery) {
        this.name = name;
        this.gallery = gallery;
    }
    
    public String getName () {
        return name;
    }
    
    public void setTrayectory (ExpansionTrayectory trayectory) {
        this.trayectory = trayectory;
    }
    
    public ExpansionTrayectory getTrayectory () {
        return trayectory;
    }
    
    public PhotoGallery getGallery () {
        return gallery;
    }
}
