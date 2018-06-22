import java.io.*;
import java.util.*;

public class Factorial {
  public static void main(String args[]) {
    int num, result = 1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    num = sc.nextInt();
    for(int i=1; i<=num; i++) {
      result *= i;
    }
    sc.close();

    System.out.println("Factorial of " + num + " = " + result);
  }
}
