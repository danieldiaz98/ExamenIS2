/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.PhotoLoader;
import java.awt.Image;

/**
 *
 * @author Entrar
 */
public class Photo {
    
    private String fileName;
    private PhotoLoader loader;
    private Image img;
    
    public Photo (String ileName) {
        this.fileName = fileName;
        loader = new PhotoLoader(fileName);
        loader.load();
        this.img = loader.getImage();
    }
    
    public Image getImage () {
        return img;
    }
}
