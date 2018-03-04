package basic;

import java.util.Scanner;

public class Loops1 {

        public static void main(String [] args) {

            System.out.println("Enter number : ");
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int i;
            if(N <= 2 || N <= 20) {

                for( i = 1 ; i <=10 ; i++ ){
                    System.out.println(N + " x " + " " +i + " = " + N*i);
                }
            }
        }
}
