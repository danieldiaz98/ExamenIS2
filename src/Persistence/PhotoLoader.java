/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Entrar
 */
public class PhotoLoader implements PhotoLoaderInterface{
    
    private String fileName;
    private Image image;
    
    public PhotoLoader (String fileName) {
        this.fileName = fileName;
    }
    
    public void load () {
        try {
            BufferedImage img = ImageIO.read(new File(fileName));
            Image image = img;
            this.image = image;
        } catch (IOException e) { }
    }
    
    public Image getImage () {
        return image;
    }
}
