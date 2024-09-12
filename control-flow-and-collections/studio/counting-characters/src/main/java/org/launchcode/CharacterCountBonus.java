package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string to count characters:");
        String userString = input.nextLine();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] charArray = userString.toUpperCase().toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();

        for( char letter : charArray){
            if (alphabet.indexOf(letter) >= 0 ) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character,Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }

}