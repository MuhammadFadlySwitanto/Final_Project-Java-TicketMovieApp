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

public class Time {
    private int hour;
    private int minute;
    
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
