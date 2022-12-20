package day20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    private static String listFile = "D:\\movementList.csv";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) throws IOException {
        String filePath = "d:\\movementList.csv";
        List<Account> accounts = ParseAccountCsv(filePath);
        accounts.forEach(System.out::print);

    }

    private static List<Account> ParseAccountCsv(String filePath) throws IOException {

        List<Account> accounts = new ArrayList<>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        for (String fileLine : fileLines) {
            String[] splitedText = fileLine.split(",");
            ArrayList<String> columnList = new ArrayList<>();
            for (int i = 0; i < splitedText.length; i++) {
                if (IsColumnPart(splitedText[i])) {
                    String lastText = columnList.get(columnList.size() - 1);
                    columnList.set(columnList.size() - 1, lastText + "," + splitedText[i]);
                } else {
                    columnList.add(splitedText[i]);
                }
            }
            Account account = new Account();
            account.name = columnList.get(0);
            account.number = columnList.get(1);
            account.nameAccount = columnList.get(2);
            account.date = columnList.get(3);
            account.ref = columnList.get(4);
            account.operation = columnList.get(5);
            account.prihod = columnList.get(6);
            account.rashod = columnList.get(7);

        }
        return accounts;
    }

    private static boolean IsColumnPart(String text) {
        String trimText = text.trim();
        return trimText.indexOf("\"") == trimText.lastIndexOf("\"") && trimText.endsWith("\"");
    }
}

class Account {
    public String name;
    public String number;
    public String nameAccount;
    public String date;
    public String ref;
    public String operation;
    public String prihod;
    public String rashod;

}