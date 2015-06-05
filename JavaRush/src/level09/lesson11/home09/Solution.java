package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Barsik1", new Cat("Barsik1"));
        map.put("Barsik2", new Cat("Barsik2"));
        map.put("Barsik3", new Cat("Barsik3"));
        map.put("Barsik4", new Cat("Barsik4"));
        map.put("Barsik5", new Cat("Barsik5"));
        map.put("Barsik6", new Cat("Barsik6"));
        map.put("Barsik7", new Cat("Barsik7"));
        map.put("Barsik8", new Cat("Barsik8"));
        map.put("Barsik9", new Cat("Barsik9"));
        map.put("Barsik10", new Cat("Barsik10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            Cat cat = pair.getValue();
            set.add(cat);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat : set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }


}
