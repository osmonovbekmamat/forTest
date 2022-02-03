package com.company;

public class Student {
    private static String name;
    private int age;
    private int group;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public   void showInfo(){
        System.out.println("info about Student");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("group: "+group);
    }


}

