package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        Sort(num1, num2, num3);
    }

    public static void Sort(int a, int b, int c)
    {
        int tmp;
        if (a < b)
        {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c)
        {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b < c)
        {
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}



