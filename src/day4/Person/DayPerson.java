package day4.Person;

import java.util.ArrayList;
import java.util.List;

public class DayPerson {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person(18, "Pasha", 10250.29));
        person.add(new Person(14, "Sergey", 324.15));
        person.add(new Person(34, "Stas", 6847.1));
        person.add(new Person(27, "Vasya", 3333.9));
        person.add(new Person(10, "Rak", 1111.11));
        System.out.println("min name: " + minName(person));
        System.out.println("min age: " + minAge(person));
        System.out.println("max Cash: " + maxCash(person));
        System.out.println("avg Cash: " + avgCash(person));
        System.out.println("allSumCash: " + sumCash(person));
        System.out.println("avgAge: " + avgAge(person));
//        money(person);
        System.out.println(maxMoney(person));
    }

    public static Person minName(List<Person> persons) {
        Person x = persons.get(0);
        for (Person person : persons) {
            if (x.getName().length() > person.getName().length()) {
                x = person;
            }
        }
        return x;
    }

    public static Person minAge(List<Person> persons) {
        Person x = persons.get(0);
        for (Person person : persons) {
            if (x.getAge() > person.getAge()) {
                x = person;
            }
        }
        return x;
    }

    public static Person maxCash(List<Person> persons) {
        Person x = persons.get(0);
        for (Person person : persons) {
            if (x.getCashMoney() < person.getCashMoney()) {
                x = person;
            }
        }
        return x;
    }

    public static double avgCash(List<Person> persons) {
        double x = 0;
        for (Person person : persons) {
            x = x + person.getCashMoney();

        }
        return x / persons.size();
    }

    public static double sumCash(List<Person> persons) {
        double sum = 0;
        for (Person person : persons) {
            sum = sum + person.getCashMoney();
        }
        return sum;
    }

    public static int avgAge(List<Person> persons) {
        int x = 0;
        for (Person person : persons) {
            x = x + person.getAge();
        }
        return x / persons.size();
    }

    public static void money(List<Person> persons) {
        Person person = minAge(persons);
        double sum = sumCash(persons);
        person.setCashMoney(sum);
        System.out.println(person);
    }

    public static double maxMoney(List<Person> persons) {
        Person person = maxCash(persons);
        double avg = avgCash(persons);
        return person.getCashMoney() - avg;
    }
}
