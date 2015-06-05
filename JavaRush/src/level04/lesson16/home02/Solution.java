package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num < num1 && num > num2)
        {
            System.out.println(num);
        } else if (num > num1 && num < num2)
        {
            System.out.println(num);
        }

        else if (num1 > num && num1 < num2)
        {
            System.out.println(num1);
        }
        else if (num1 < num && num1 > num2)
        {
            System.out.println(num1);
        }
        else
            System.out.println(num2);
    }
}
