package AikaC.Week01_JavaTasks;

import java.util.Scanner;

public class OddOrEven_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();


        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }


}
