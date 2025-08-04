import java.util.Scanner;
class Problem3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int x = sc.nextInt();

    for (int i = 1; i <= 12; i++){
      System.out.println(x + " x " + i + " = " + (x * i));
    }

  }
}


output ->>

Enter the number : 5

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35 
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
5 x 11 = 55
5 x 12 = 60
