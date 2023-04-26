/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class MinMaxAverage {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите размер массива:");               //Формирование массива (значение количества элементов в массиве)
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        in.close();
        Random rd = new Random(2);                                //Формирование массива (случайные элементы)
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(0, 50));
        }
        System.out.println(arr);
        MinMax(arr, n);
    }

    public static void MinMax(ArrayList<Integer> arr, double n) {       //Поиск минимума и максимума в массиве
        ArrayList<Integer> arr1 = arr;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int summar = 0;
        int praver1 = Integer.MIN_VALUE;
        for (int i = 0; i <= arr1.size() - 1; i++) {
            summar += arr1.get(i);
            if (arr1.get(i) < minimum) {
                minimum = arr1.get(i);
            }
            if (arr1.get(i) > maximum) {
                maximum = arr1.get(i);
            }

        }
        double average = summar / n;
        double praver = maximum - minimum;

        for (int i = 0; i <= arr1.size() - 1; i++) {                    //Нахождение максимально приближенного элемента в массиве
            if ((Math.abs(average - arr1.get(i))) <= praver) {
                praver = (Math.abs(average - arr1.get(i)));
                praver1 = arr.get(i);
            }

        }
        System.out.println("Максимальный элемент массива равен:");
        System.out.printf("%d", maximum);
        System.out.println();
        System.out.println("Минимальный элемент массива равен:");
        System.out.printf("%d ", minimum);
        System.out.println();
        System.out.println("Среднее арифметическое значение этого массива равно:");
        System.out.printf("%.2f ", average);
        System.out.println();
        System.out.println("Среднее значение (элемент массива) (максимально близкое к среднему арифметическому) в этом массива равно:");
        System.out.printf("%d ", praver1);

    }

}