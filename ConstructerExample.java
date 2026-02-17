package com.gla;

public class ConstructerExample {
    int id;
    String name;
    int age;

    public ConstructerExample(){
        System.out.println("Default Constructor");

    }
    public ConstructerExample(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }
    void diplay(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.print("age" +age);
    }
    public static void main(String[]args){
        ConstructerExample cd = new ConstructerExample();
        ConstructerExample cdd = new ConstructerExample(1 , "jay" , 19);
        cdd.diplay();
    }
}
