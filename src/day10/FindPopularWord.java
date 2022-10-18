package day10;

import java.util.Locale;

public class FindPopularWord {
    public static void main(String[] args) {
        String text = "hello java world java hello I Hello Java World java";
        String word = fintpopularWord(text);
        System.out.println(word);
    }

    private static String fintpopularWord(String text) {
        String[] words = findAllWordsInText(text);
        String[][] uniqeWordsAndCounts = fintuniqeWordsAndCounts(words);
        return getWordWithMaxCount(uniqeWordsAndCounts);
    }

    private static String[] findAllWordsInText(String text) {
        return text.split(" ");
    }

    private static String[][] fintuniqeWordsAndCounts(String[] words) {
        String[] uniqueWord = new String[words.length];
        String[] counts = new String[words.length];
        int count = 0;
        for (String word : words) {
            var lowerCaseWord = word.toLowerCase();
            if (!isAlredyProcessed(uniqueWord, lowerCaseWord, count)) {
                int total = calculateWords(words, lowerCaseWord);
                uniqueWord[count] = lowerCaseWord;
                counts[count] = String.valueOf(total);
                count++;
            }

        }
        return convertResults(uniqueWord, counts, count);
    }

    private static boolean isAlredyProcessed(String[] uniqueWord, String word, int count) {
        for (int i = 0; i < count; i++) {
            if (uniqueWord[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    private static int calculateWords(String[] words, String word) {
        int count = 0;
        for (String w : words) {
            if (word.equalsIgnoreCase(w)) {
                count++;
            }
        }
        return count;
    }


    private static String[][] convertResults(String[] uniqueWord, String[] counts, int count) {
        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = uniqueWord[i];
            result[i][1] = counts[i];
        }
        return result;
    }

    private static String getWordWithMaxCount(String[][] uniqeWordsAndCounts) {
        String word = uniqeWordsAndCounts[0][0];
        int maxCount = Integer.parseInt(uniqeWordsAndCounts[0][1]);
        for (int i = 1; i < uniqeWordsAndCounts.length; i++) {
            int currentCount = Integer.parseInt(uniqeWordsAndCounts[i][1]);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                word = uniqeWordsAndCounts[i][0];
            }
        }
        return word;
    }
}
