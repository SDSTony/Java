// use java.util.Scanner to get input 

import java.util.Scanner;

public class Add_with_input {

    public static void main(String[] args) {

        int A, B, addresult;

        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        B = scn.nextInt();

        addresult = A + B;

        System.out.println(addresult);

        scn.close(); // make sure to close scanner to prevent resource leak

    }
    
}
