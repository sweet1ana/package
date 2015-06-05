package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму,
ока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true)
        {
            String s = reader.readLine();
            if (s.equals("сумма"))
            {
                System.out.println(sum);
                break;
            } else
            {
                sum += Integer.parseInt(s);

            }
        }
    }
}
