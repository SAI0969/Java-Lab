import java.util.Scanner;
class Problem1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of rows : ");
    int rows = sc.nextInt();

    int i, j;
    System.out.println("Output : ");
    for (i = 1; i <= rows; i++){
      for (j = 1; j <= i ; j++){
        System.out.print(j);
      }
      System.out.println();
    }

  }
}


output ->> 
  
Enter the number of rows : 5
Output :
1
12
123
1234
12345
