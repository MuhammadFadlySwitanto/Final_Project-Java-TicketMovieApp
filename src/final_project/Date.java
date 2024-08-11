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

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    
    public Date(String dateString) {
        String[] parts = dateString.split("/");
        day = Integer.parseInt(parts[0]);
        month = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }
    
    public Date() {
        this(1, 1, 2023); // default date: January 1, 2023
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
     
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

