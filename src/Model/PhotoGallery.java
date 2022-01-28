/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Entrar
 */
public class PhotoGallery {
    
    private ArrayList<Photo>gallery;
    
    public PhotoGallery () {
        gallery = new ArrayList<>();
    }
    
    public ArrayList<Photo> getPhotoGallery () {
        return gallery;
    }
    
}
