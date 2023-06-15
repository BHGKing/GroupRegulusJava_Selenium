package AikaC.Week04;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(FrequencyOfCharacters("AAABBCDD"));

    }

    public static String FrequencyOfCharacters(String str) {

        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }


            result += ch + "" + count;

        }

        return result;
    }
}
