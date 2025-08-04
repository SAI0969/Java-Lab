import java.util.Scanner;
class Problem2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number : ");
    double num1 = sc.nextDouble();

    System.out.print("Enter second number : ");
    double num2 = sc.nextDouble();

    int num1_1 = (int) (num1 * 1000);
    int num2_2 = (int) (num2 * 1000);


    if (num1_1 == num2_2){
      System.out.print("Both numbers are same");
    }
    else{
      System.out.print("Both numbers are different");
    }
  }
}



output ->>

Enter first number : 5.123456
Enter second number : 5.123498
Output: Both numbers are same 
