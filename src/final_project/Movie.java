/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_project;

/**
 *
 * @author ASUS
 */
//import java.util.*;

public class Movie {
    private String name;
    private String genre;
    private int ageRating;
    private boolean type3D;
    
     public Movie(){
        name = null;
        genre = null;
        ageRating = 0;
        type3D = false;
    }
    
    public Movie(String name, String genre, int ageRating, boolean type3D){
        this.name = name;
        this.genre = genre;
        this.ageRating = ageRating;
        this.type3D = type3D;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public int getAgeRating(){
        return ageRating;
    }
    
    public void setAgeRating(int ageRating){
        this.ageRating = ageRating;
    }
    
     public boolean get3D(){
        return type3D;
    }
    
    
    public boolean equals (Object other){
        Movie m = (Movie) other;
        return this.genre.equals(m.genre);
    }
}
