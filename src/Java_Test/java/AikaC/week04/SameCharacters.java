package AikaC.week04;

import java.util.Arrays;

public class SameCharacters {
    public static void main(String[] args) {

        System.out.println(Same_characters("abc", "cab"));
        System.out.println(Same_characters("abc", "abb"));
    }


    public static boolean Same_characters(String str1, String str2){


        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }



    }

