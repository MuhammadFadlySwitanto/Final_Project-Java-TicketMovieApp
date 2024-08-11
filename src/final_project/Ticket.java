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

public class Ticket {
    private double price;
    private int rowNum;
    private int seatNum;
    private int ticketNum;
    private String type;
    private boolean student;
    private Movie movie;
    private Food food;
    private Date showDate;
    private Time showTime;
    
    public Ticket(){
        seatNum = 0;
        showDate = null;
        showTime = null;
        movie = null;
        food = null;
        ticketNum++;
    }
    
     public Ticket(int s, Date d, Time t, Movie m, Food f){
        seatNum = s;
        showDate = d;
        showTime = t;
        movie = m;
        food = f;
        
        ticketNum++;
    }
     
     public int getRowNum(){
        return rowNum;
    }
    
    public void setRowNum(int rowNum){
        this.rowNum = rowNum;
    }
    
    public int getTicketNum(){
        return ticketNum ;
    }
    
    public void setTicketNum(int ticketNum ){
        this.ticketNum  = ticketNum ;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public Date getShowDate(){
        return showDate;
    }
    
    public void setShowDate(Date showDate){
        this.showDate = showDate;
    }
    
    public Time getShowTime(){
        return showTime;
    }
    
    public void setShowTime(Time showTime){
        this.showTime = showTime;
    }
    
     public int checkRowNum(){
        if(seatNum >= 1 && seatNum <= 10){
            rowNum = 1;
        }
        if(seatNum >= 11 && seatNum <= 20){
            rowNum = 2;
        }
        if(seatNum >= 21 && seatNum <= 30){
            rowNum = 3;
        }
        if(seatNum >= 31 && seatNum <= 40){
            rowNum = 4;
        }
        if(seatNum >= 41 && seatNum <= 50){
            rowNum = 5;
        }
         
         return rowNum;
    }
    
     public String checkType(){ //buat nentuin row vip 1,2 regular 3,4,5
        if (checkRowNum() >= 1 && checkRowNum() <= 2){
            type = "VIP";
//            System.out.println("you booked a VIP seat");
        }
        if (checkRowNum() >= 3 && checkRowNum() <= 5){
            type = "Regular";
//            System.out.println("you booked a Regular seat");
        }
        return type;
    }
     
     public double TotalPrice(boolean student){
        if(checkType().equals("VIP"))
            price += 60000;
        
        if(checkType().equals("Regular"))
            price += 30000;
        
        if(movie.get3D())
            price += 20000;
        
        if(student == true){
            price = price * 0.2;
        }
        return price;
    }
     
    public String printTicket(){
        String str = "";
        if(type.equals("VIP")){
            str = "\nNo. "+ticketNum+" Seat Number: "+seatNum+" Row number: "+rowNum+"\n"
                    + "Movie Details --> ("+movie.getName()+") "+movie.getGenre()+"\n!!FOOD & DRINK!!\n "
                            +food.foodTheme()+"\nShow Date: "+showDate.toString()+"\nTime of Show: "
                    +showTime.toString()+"\n"+"\nTotal Price: Rp"+price+"\n"
                    + "Free Souvenirs & Poster for VIP";
        }
        if(type.equals("Regular")){
            str = "\nNo. "+ticketNum+" Seat Number: "+seatNum+" Row number: "+rowNum+"\n"
                    + "Movie Details --> ("+movie.getName()+") "+movie.getGenre()+"\n!!FOOD & DRINK!!\n "
                            +food.foodTheme()+"\nShow Date: "+showDate.toString()+"\nTime of Show: "
                    +showTime.toString()+"\nTotal Price: "+price;
        }
        return str;
    }
     
     
}
