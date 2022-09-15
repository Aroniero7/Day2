package day4.Person;

public final class Person {
    private int age;
    private String name;
    private double cashMoney;

    public Person(int age, String name, double cashMoney) {
        this.age = age;
        this.name = name;
        this.cashMoney = cashMoney;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(double cashMoney) {
        this.cashMoney = cashMoney;
    }

    @Override
    public String toString() {
        return "Person{" + "age: " + age + ", name: '" + name + ", cashMoney: " + cashMoney;
    }
}
