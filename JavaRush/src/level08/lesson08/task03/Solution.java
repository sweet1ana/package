package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Анна"));
        System.out.println(getCountTheSameLastName(createMap(), "Васильев"));

    }

    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Воронов", "Михаил");
        hashMap.put("Степанов", "Влад");
        hashMap.put("Ололоева", "Анна");
        hashMap.put("Васильев", "Андрей");
        hashMap.put("Карманова", "Яна");
        hashMap.put("Васильева", "Анна");
        hashMap.put("Долгожитова", "Анна");
        hashMap.put("Сибирякова", "Светлана");
        hashMap.put("Васин", "Владимир");
        hashMap.put("Петросянов", "Алексей");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int countFirstName = 0;

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();

            if (name.equals(value))
            {
                countFirstName++;
            }
        }
        return countFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int countLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(familiya))
            {
                countLastName++;
            }
        }
        return countLastName;
    }
}
