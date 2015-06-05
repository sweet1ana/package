package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        Cat Masya = new Cat("Masya", 1, 4, 3);
        Cat Pol = new Cat("Pol", 5, 5, 4);
        Cat Borka = new Cat("Borka", 3, 4, 5);
        System.out.println(Cat.count);
    }

    public static class Cat
    {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength)
        {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
