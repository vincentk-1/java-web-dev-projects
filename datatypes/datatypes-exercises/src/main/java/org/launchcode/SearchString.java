package org.launchcode;

import java.util.Map;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {

        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String lowerCaseQuote = quote.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to search in the string:");

        String searchTerm = input.next();

        String lowerCaseSearchTerm = searchTerm.toLowerCase();

        if (lowerCaseQuote.contains(lowerCaseSearchTerm)) {
                System.out.println("Your word '" + searchTerm + "' is in the sentence above");
         } else {
                System.out.println("Your word '" + searchTerm + "' is NOT there");
        }

        Integer index = lowerCaseQuote.indexOf(lowerCaseSearchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = lowerCaseQuote.replace(lowerCaseSearchTerm, "");
        System.out.println(modifiedSentence);

    }
}
