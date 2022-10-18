package day18;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int tail;

    public Cat(String name, int age, int weight, int tail) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = this.tail;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    List<Cat> cats = new ArrayList<Cat>();


    @Override
    public String toString() {
        return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tail;
    }
}
