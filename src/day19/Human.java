package day19;

import java.util.ArrayList;

public class Human {

    private String name;
    private Boolean sex;
    private int age;
    private ArrayList<Human> children;

    public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
    }

    public String toString() {
        String text = "";
        text += "���: " + this.name;
        text += ", ���: " + (this.sex ? "�������" : "�������");
        text += ", �������: " + this.age;

        int childCount = this.children.size();
        if (childCount > 0) {
            text += ", ����: " + this.children.get(0).name;

            for (int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text += ", " + child.name;
            }
        }

        return text;
    }
}

