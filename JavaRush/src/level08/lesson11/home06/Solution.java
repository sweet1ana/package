package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> childs = new ArrayList<Human>();

        Human son1 = new Human("son1", true, 2, childs);
        Human son2 = new Human("son2", true, 4, childs);
        Human daughter = new Human("daughter", false, 3, childs);

        ArrayList<Human> parents = new ArrayList<Human>();

        parents.add(son1);
        parents.add(son2);
        parents.add(daughter);

        Human pa = new Human("pa", true, 40, parents);
        Human ma = new Human("ma", false, 39, parents);

        ArrayList<Human> grandParents1 = new ArrayList<Human>();
        grandParents1.add(pa);
        ArrayList<Human> grandParents2 = new ArrayList<Human>();
        grandParents2.add(ma);

        Human grandPa1 = new Human("grandPa1", true, 70, grandParents1);
        Human grandPa2 = new Human("grandPa2", true, 69, grandParents1);
        Human grandMa1 = new Human("grandMa1", false, 65, grandParents2);
        Human grandMa2 = new Human("grandMa2", false, 67, grandParents2);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
