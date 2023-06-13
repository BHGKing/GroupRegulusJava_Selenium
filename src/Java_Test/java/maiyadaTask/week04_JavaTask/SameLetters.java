package maiyadaTask.week04_JavaTask;

public class SameLetters {

    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static boolean sameLetter(String str1, String str2){


        if(str1.equals(str2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "cab"));
    }
}
