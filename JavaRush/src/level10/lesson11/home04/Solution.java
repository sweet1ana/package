package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chars = s.toCharArray();
        for (int i = 0; i < 40; i++)
        {
            String string = new String(chars, i, chars.length - i);
            System.out.println(string);
        }
        //Напишите тут ваш код
        /*for (int i = 0; i < s.length(); i++){
            System.out.println(s.substring(i, s.length()));*/
    }
}


