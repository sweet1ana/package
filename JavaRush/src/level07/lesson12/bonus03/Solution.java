package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        // version1
        // Arrays.sort(array, Collections.reverseOrder());


        for (int i=0; i< array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {

                    if (array[i] > array[j])
                    {
                        int tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                        System.out.println(i + "-i " + j + "-j " );
                    }


            }
        }
    }
}
