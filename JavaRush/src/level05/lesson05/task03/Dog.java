package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog
{
    //добавьте переменные класса тут
    public String name;
    public int age;

    //добавьте геттеры и сеттеры тут

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public static void main(String[] args)
    {
        Dog SomeDog = new Dog();
        SomeDog.setName("Bim");
        System.out.println(SomeDog.getName());

    }
}