package AikaC.Week01_JavaTasks;

public class Division {
    public static int Divide(int num1, int num2) {
        String fornum1 = "";
        String fornum2 = "";
        int result = 0;

        for (int i = 0; i < num1; i++) {
            fornum1 += "#"; // ########## - #####
        }
        for (int i = 0; i < num2; i++) {
            fornum2 += "#"; // #####
        }

        while (fornum1.contains(fornum2)){
            result++;
            fornum1 = fornum1.replaceFirst(fornum2, "");
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Divide(10, 5) ) ;
    }

}
