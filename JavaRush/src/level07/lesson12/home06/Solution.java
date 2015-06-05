package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grandFather1 = new Human("Иван", true, 70, null, null);
        Human grandFather2 = new Human("Степан", true, 72, null, null);

        Human grandMother1 = new Human("Мария", false, 67, null, null);
        Human grandMother2 = new Human("Евдокия", false, 69, null, null);

        Human father = new Human("Владимир", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Людмила", false, 45, grandFather2, grandMother2);

        Human daughter1 = new Human("Катя", false, 10, father, mother);
        Human daughter2 = new Human("Софья", false, 16, father, mother);
        Human son = new Human("Боря", true, 7, father, mother);

        System.out.println(grandFather1 + "\n" + grandFather2 + "\n" + grandMother1 + "\n" + grandMother2 + "\n"
                + father + "\n" + mother + "\n" + daughter1 + "\n" + daughter2 + "\n" + son);
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
