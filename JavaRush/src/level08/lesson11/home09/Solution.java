package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "JANUARY 02 1960";
        System.out.println(isDateOdd(date)); // true or false
    }

    public static boolean isDateOdd(String date)
    {
       /* //перевели стринг в дату
        Date stringDate = new Date(date);

        //получили время от начала отсчета 1 января 1970 до введенной даты в мс
        long time = stringDate.getTime();
        System.out.println(time + " время от начала отсчета 1 января 1970 до введенной даты");

        //в днях
        long timeInDays = time / 1000 / 60 / 60 / 24;
        System.out.println(timeInDays + " -- в днях");

        //нашли год введенной даты (начало отсчета 1900)
        int year = stringDate.getYear();
        Date beginOfYear = new Date(year, 0, 1);
        long time2 = beginOfYear.getTime();
        System.out.println(time2 + " получили время от начала отсчета 1 января 1970 до начала года введенной даты");

        //в днях
        long timeInDays2 = time2 / 1000 / 60 / 60 / 24;
        System.out.println(timeInDays2 + " -- в днях");

        //считаем разницу
        long difference = timeInDays - timeInDays2;
        System.out.println(difference + " dif");
        if (difference % 2 != 0)
        {
            return true;
        } else return false;*/


        Date date2 = new Date(date);
        int[] array = new int[11];
        array[0] = 30;
        if (date2.getYear() % 4 == 0) array[1] = 29;
        else array[1] = 28;
        array[2] = 31;
        array[3] = 30;
        array[4] = 31;
        array[5] = 30;
        array[6] = 31;
        array[7] = 31;
        array[8] = 30;
        array[9] = 31;
        array[10] = 30;
        int count = date2.getDate();
        for (int i = 0; i < date2.getMonth(); i++)
            count += array[i];

        if (count % 2 == 0) return false;
        else return true;
    }

}
