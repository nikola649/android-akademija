/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

/**
 *
 * @author Nikola
 */
public class Zad5 {

    public static int findLargest(int array[])
    {
        int largest = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > largest)
                largest = array[i];   
        }

        return largest;
    }


    
    public static void main(String[] args) {
        int[] vektor = {5,4,13,70,7,8,9,10,5};
        int largestElement = findLargest(vektor);
        System.out.print(largestElement);
    }
    
}
