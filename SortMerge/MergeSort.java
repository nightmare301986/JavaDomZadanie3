// (Дополнительно) Реализовать алгоритм сортировки слиянием
package SortMerge;

import java.util.ArrayList;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) throws Exception {

        final int n = 10;
        Random rd = new Random(2);                                  //Формируем случайным образом ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            list.add(rd.nextInt(0, 220));
        }

        System.out.println(list);
        mergeSort(list, 0, n);                                      //Вызов метода сортировки (сортировка слиянием)

        System.out.println(list);
    }

    public static void mergeSort(ArrayList<Integer> list, int beg, int fin) {
        if (fin - beg >= 2) {
            int mid = beg + (fin - beg) / 2;
            mergeSort(list, beg, mid);
            mergeSort(list, mid, fin);
            Merge(list, beg, mid, fin);
        }
    }

    public static void Merge(ArrayList<Integer> list, int beg, int mid, int fin) {  //Сортировка с помощью двух подмассивов
        ArrayList<Integer> left = new ArrayList<Integer>(list.subList(beg, mid));
        ArrayList<Integer> right = new ArrayList<Integer>(list.subList(mid, fin));

        int i = 0;
        int j = 0;
        int k = beg;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k, left.get(i++));
            } else {
                list.set(k, right.get(j++));
            }
            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i++));
            k++;
        }

        while (j < right.size()) {
            list.set(k, right.get(j++));
            k++;
        }
    }
}