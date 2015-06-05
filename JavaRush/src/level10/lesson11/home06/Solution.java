package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private String city;
        private String profession;
        private int salary;

        //1
        Human()
        {

        }

        //2
        Human(String name)
        {
            this.name = name;
        }

        //3
        Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
        }

        //4
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //5
        Human(String name, boolean sex, int age, String city)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.city = city;
        }

        //6
        Human(String name, boolean sex, int age, String city, String profession)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.city = city;
            this.profession = profession;
        }

        //7
        Human(String name, boolean sex, int age, String city, String profession, int salary)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.city = city;
            this.profession = profession;
            this.salary = salary;
        }

        //8
        Human(boolean sex, int age, String city, String profession, int salary)
        {
            this.sex = sex;
            this.age = age;
            this.city = city;
            this.profession = profession;
            this.salary = salary;
        }

        //9
        Human(int age, String city, String profession, int salary)
        {
            this.age = age;
            this.city = city;
            this.profession = profession;
            this.salary = salary;
        }

        //10
        Human(String profession, int salary)
        {
            this.profession = profession;
            this.salary = salary;
        }
    }
}
