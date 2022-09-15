package day3.model;

public class ExceptionService {

    public int umnozenie(int a) {
        return ostatok(a * 3);
    }

    public int ostatok(int b) {
        return b % 2;
    }
}