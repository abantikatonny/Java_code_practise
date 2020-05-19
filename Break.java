/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Abantika
 */
public class Break {
    public static void main(String args[]){
        String season = null;
        int month =4;
        switch(month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "blabla";
                break;
            case 6:
            case 7:
                season = "bla";
        }
        System.out.println("So the season is " + season);
               
    }
                
}
    
