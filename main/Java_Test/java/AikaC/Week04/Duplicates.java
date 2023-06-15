package AikaC.Week04;

public class Duplicates {

    public static void main(String[] args) {


        System.out.println(removeDuplicate("AAABBBCCC"));


    }


    public static String removeDuplicate(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }
}

