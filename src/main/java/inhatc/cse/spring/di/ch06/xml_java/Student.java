package inhatc.cse.spring.di.ch06.xml_java;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private ArrayList<String> hobbys;
    private double height;
    private double weight;

    public Student(String name, int age, ArrayList<String> hobbys) {
        this.name = name;
        this.age = age;
        this.hobbys = hobbys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(ArrayList<String> hobbys) {
        this.hobbys = hobbys;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
