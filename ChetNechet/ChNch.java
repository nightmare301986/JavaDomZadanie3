/*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/
package ChetNechet;

import java.util.ArrayList;
import java.util.Random;


public class ChNch {
    public static void main(String[] args) {
        final int n = 10;
        Random rd = new Random(2);                              //Формирование массива (случайные элементы)
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<n; i++)
        {
            arr.add(rd.nextInt(-20, 55));
            
        }
        System.out.println(arr);
        poiskChet(arr);
        System.out.println(arr);
        
}
    public static void poiskChet(ArrayList<Integer> arr){            //Поиск четных чисел в массиве и удаление этих чисел из массива
        ArrayList<Integer> arr1 = arr;
        for (int i = arr1.size()-1; i >= 0 ; i--) {
            if (arr1.get(i)%2 == 0 ) {
             arr1.remove(i);
            }
        }
        
    }
}
