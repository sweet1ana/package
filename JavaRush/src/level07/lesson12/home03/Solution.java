package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[20];

        int maximum = MIN_VALUE;
        int minimum = MAX_VALUE;

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = Integer.parseInt(reader.readLine());
            if(ar[i] < minimum){
                minimum = ar[i];
            }
            if(ar[i] > maximum){
                maximum = ar[i];
            }
        }

        System.out.print(maximum + " " + minimum);


      /*  version1

      maximum = ar[0];
        minimum = ar[0];

        for (int i = 0; i < ar.length; i++)
        {
            if (maximum < ar[i])
            {
                int tmp = maximum;
                maximum = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++)
        {
            if (minimum > ar[i]){
                int tmp = minimum;
                minimum = ar[i];
            }

        System.out.println(maximum);
        System.out.println(minimum);
        }*/
    }
}
