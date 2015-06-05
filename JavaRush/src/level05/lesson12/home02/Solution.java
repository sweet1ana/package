package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man Jack = new Man("Jack", 27, "NewYork");
        Man Stew = new Man("Stew", 34, "Sidney");

        Woman Anna = new Woman("Anna", 25, "Kiev");
        Woman Virginia = new Woman("Virginia", 28, "Stambul");

        // Выведи их на экран тут
        System.out.println(Jack.name + " " + Jack.age + " " + Jack.address);
        System.out.println(Stew.name + " " + Stew.age + " " + Stew.address);
        //System.out.println(Jack);
        System.out.println(Anna.name + " " + Anna.age + " " + Anna.address);
        System.out.println(Virginia.name + " " + Virginia.age + " " + Virginia.address);
    }

    // Напиши тут свои классы
    public static class Man
    {
        //name(String), age(int), address(String)
        private String name;
        private int age;
        private String address;


        //Создай конструкторы, в которые передаются все возможные параметры.
        public Man(String name)
        {
            this.name = name;
        }

        public Man(int age)
        {
            this.age = age;
        }


        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }


    }

    public static class Woman
    {

        private String name;
        private int age;
        private String address;


        public Woman(String name)
        {
            this.name = name;
        }

        public Woman(int age)
        {
            this.age = age;
        }


        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
