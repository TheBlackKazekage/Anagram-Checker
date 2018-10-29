package com.company;

public class Anagram {
    public static void main(String[] args) {
        anagramCheck("","smith");
    }

    private static void anagramCheck(String prefix, String str) {
        if(str.length() <= 1){
            System.out.println(prefix + str);
        }else{
            anagramCheck(prefix + str.charAt(0), str.substring(1));

            for(int i = 1; i <= str.length() - 2; i++){
                anagramCheck(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }

            anagramCheck(prefix + str.charAt(str.length() - 1), str.substring(0, str.length() - 1));
        }
    }
}
