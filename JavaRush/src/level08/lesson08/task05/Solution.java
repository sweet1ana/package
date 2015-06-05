package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> hashMap = createMap();
        System.out.println(hashMap);
        removeTheFirstNameDuplicates(hashMap);
        System.out.println(hashMap);
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //  Напишите тут ваш код
        HashMap<String, String> map1 = new HashMap<String, String>(map);
        HashMap<String, String> map2 = new HashMap<String, String>(map);

        for (Iterator<Map.Entry<String, String>> iterator1 = map1.entrySet().iterator(); iterator1.hasNext(); )
        {
            Map.Entry<String, String> pair1 = iterator1.next();
            int num = 0;
            for (Iterator<Map.Entry<String, String>> iterator2 = map2.entrySet().iterator(); iterator2.hasNext(); )
            {
                Map.Entry<String, String> pair2 = iterator2.next();

                if (pair1.getValue().equals(pair2.getValue()))
                {
                    num++;
                    if (num >= 2)
                    {
                        removeItemFromMapByValue(map, pair1.getValue());
                    }
                }
            }

        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
