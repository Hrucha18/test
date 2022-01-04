import java.io.*;
import java.net.SocketOption;
import java.util.Scanner;

import static java.lang.Integer.sum;


public class sumoftwo {


    public static void main(String args[]) {
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x=sc.nextInt();
        System.out.println("Enter second number");
        y=sc.nextInt();
        sum = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum);
    }
}

}
