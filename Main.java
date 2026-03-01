import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a pool of letters: ");
        String letters = scn.nextLine().toUpperCase();

        Map<Character, Integer> lettersCount = getCharacterCount(letters);

        BufferedReader reader = new BufferedReader(new FileReader("src/dic.txt"));

        System.out.println("All possible word you can make out of those letters: ");

        for (String word = reader.readLine(); word != null; word = reader.readLine()){
            Map<Character, Integer> currentWord = getCharacterCount(word);

            boolean canMakeWord = true;
            for (Character ch : currentWord.keySet()){
                int currentWordChar = currentWord.get(ch);
                int currentLettersCount = lettersCount.containsKey(ch) ?
                                          lettersCount.get(ch) : 0;

                if (currentWordChar > currentLettersCount){
                    canMakeWord = false;
                    break;
                }
            }

            if (canMakeWord){
                System.out.println(word);
            }
        }
        scn.close();
        reader.close();
    }

    private static Map<Character, Integer> getCharacterCount(String letters) {
        Map<Character, Integer> lettersCount = new HashMap<>();

        for (int i = 0; i < letters.length(); i++){
            char currentChar = letters.charAt(i);

            int count = lettersCount.containsKey(currentChar) ?
                    lettersCount.get(currentChar) : 0;

            lettersCount.put(currentChar, count + 1);
        }

        return lettersCount;
    }
}
