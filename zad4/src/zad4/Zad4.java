/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

/**
 *
 * @author Nikola
 */
public class Zad4 {

    
    public static boolean isLeapYear(int year) {
           return year % 4 == 0 & (year % 100 != 0 || year % 400 == 0);
        }
    public static void main(String[] args) {
        int brojac=20;
        int godina=2018;
        while(brojac!=0)
        {
            if(isLeapYear(godina))
            {
                System.out.print(godina+"\n");
                brojac--;
                
            }
        godina++;
        }
    }
}
