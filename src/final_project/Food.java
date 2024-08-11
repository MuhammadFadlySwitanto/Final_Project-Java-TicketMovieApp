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

public class Food {
    private String snack;
    private String drink;
    private Movie movie;
    
    public Food(Movie  m){
        movie = m;
    }
    
    public String getSnack(){
        return snack;
    }
    
    public void setSnack(String snack){
        this.snack = snack;
    }
    
    public String getDrink(){
        return drink;
    }
    
    public void setDrink(String drink){
        this.drink = drink;
    }
    
    public Movie getMovie(){
        return movie;
    }
    
    public void setMovie(Movie movie){
        this.movie = movie;
    }
    
    public String foodTheme(){
        
        if(movie.getGenre().equals("Horror")){
            snack = "Sweet Pop Corn";
            drink = "Coca-cola";
        }
        if(movie.getGenre().equals("Action")){
            snack = "Salt Pop Corn";
            drink = "Orange Fanta";
        }
        if(movie.getGenre().equals("Thriller")){
            snack = "Butter Pop Corn";
            drink = "Strawberry Fanta";
        }
        if(movie.getGenre().equals("Animation")){
            snack = "French Fries";
            drink = "Coca-cola";
        }
    return "Snack: "+snack+" Drink: "+drink;
    }
}
