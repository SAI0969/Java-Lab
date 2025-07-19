class Prepost{
  public static void main(String args[]){
    int a = 5; 
    System.out.println(a++);
    System.out.println(++a);
  }
}

// output

// a = 5

// System.out.println(a++);

// This is post-increment: the current value of a is printed first, then a is incremented.

// Output: 5

// After this line, a = 6

// System.out.println(++a);

// This is pre-increment: a is incremented first, then the new value is printed.

// a = 7

// Output: 7
