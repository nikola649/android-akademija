/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prvasubota;

import java.util.Scanner;

/**
 *
 * @author Nikola
 */
public class Zad2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("daj mi n");
        int n = input.nextInt();
        int suma=0;
        int produkt=0;
            
        for(int i=1; i<=n; i++ )
        {
            suma+=i;
        }
            System.out.printf("%d", suma);
    }
    
}
