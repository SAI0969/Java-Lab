import java.util.Scanner;

class Charcalc{
  char a, b;

  Charcalc(char a, char b){
    this.a = a;
    this.b = b;
  }

  char add(){
    return (char) (a + b);
  }

  char sub(){
    return (char) (a - b);
  }

  char mul(){
    return (char) (a * b);
  }

  char div(){
    if (b != 0) {
      return (char) (a / b);
    }
    else {
      System.out.print("Error");
      return 0;

    }
  }
}

public class Question3{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first character : ");
    char a = (char) sc.nextLine().charAt(0);

    System.out.print("Enter second character : ");
    char b = (char) sc.nextLine().charAt(0);

    Charcalc c1 = new Charcalc(a, b);

    System.out.println("Sum : " + (int) c1.add());

    System.out.println("Subtraction : " + (int ) c1.sub());

    System.out.println("Mul : " + (int) c1.mul());

    System.out.println("Div : " + (int) c1.div());
  }
}
