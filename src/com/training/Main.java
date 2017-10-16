package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sentence = inputString();
        String sentenceInAlBhed = translateToAlBhed(sentence);
        System.out.println("Al-Bhed: " + sentenceInAlBhed);
    }

    public static String translateToAlBhed(String englishSentence) {
        List<Character> englishAlphabet = Arrays.asList('e','p','s','t','i','w','k','n','u','v','g','c','l','r','y','b','x','h','m','d','o','f','z','q','a','j');
        List<Character> alBhedAlphabet = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        String alBhedSentence ="";
        englishSentence.toLowerCase();
        for (int i = 0; i < englishSentence.length(); i++) {
            alBhedSentence += alBhedAlphabet.get(englishAlphabet.indexOf(englishSentence.charAt(i)));
        }
        return alBhedSentence.toUpperCase();
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("English: ");
        return scanner.nextLine();
    }
}
