/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drugi;

import java.util.Scanner;

/**
 *
 * @author Nikola
 */
public class Drugi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("daj mi n");
        int n = input.nextInt();
        int suma=0;
        int produkt=1;
        System.out.println("hoces sumu[pisi s] ili produkt[pisi p]?");
        Scanner input2 = new Scanner(System.in);
        String kljucna_rijec = input2.nextLine();
        
        if (kljucna_rijec.equals("s"))
        {
            for(int i=1; i<=n; i++ )
            {
                suma+=i;
            }
                System.out.printf("%d", suma);
        }
        else
        {
            for(int i=1; i<=n; i++ )
            {
                produkt=produkt*i;
            }
                System.out.printf("%d", produkt); 
        }
    }
    
}
