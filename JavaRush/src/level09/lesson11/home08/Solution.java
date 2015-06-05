package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Создать список, элементами которого будут массивы чисел.
        ArrayList<int[]> listArrays = new ArrayList<int[]>();

        int [] ar1 = {0,1,2,3,4};
        int [] ar2 = {0,1};
        int [] ar3 = {0,1,2,3};
        int [] ar4 = {0,1,2,3,4,5,6};
        int [] ar5 = new int[0];
        listArrays.add(ar1);
        listArrays.add(ar2);
        listArrays.add(ar3);
        listArrays.add(ar4);
        listArrays.add(ar5);

        return listArrays;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array : list)
        {
            for (int x : array)
            {
                System.out.println(x);
            }
        }
    }
}
