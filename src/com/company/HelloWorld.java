package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class HelloWorld{
    private static TreeSet<String> set = new TreeSet<>();

    public static void main(String []args){




        anagramCheck("", "cat");



        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    private static void anagramCheck(String prefix, String word){

        if(word.length() <= 1)
        {
//            set.add(prefix+word);
            System.out.println(prefix+word);
        }

        else
        {
            anagramCheck(prefix + word.charAt(0), word.substring(1));

            for(int i = 1; i <= word.length() - 2; i++)
            {
                anagramCheck(prefix+word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }

            anagramCheck(prefix + word.charAt(word.length() - 1), word.substring(0, word.length() - 1));
        }
    }
}