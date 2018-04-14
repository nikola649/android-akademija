/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import java.util.Arrays;

public class Zad6 {

    
    public static void main(String[] args) {
        int[] vektor = {1,2, 3,0 ,7,8,9,10};
        for (int start = 0, end = vektor.length - 1; start <= end; start++, end--) {
        int aux = vektor[start];
        vektor[start]=vektor[end];
        vektor[end]=aux;
        }
        System.out.print(Arrays.toString(vektor));
    
}
}
    

