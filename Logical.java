class Logical{
  public static void main(String args[]){
    int a = 5, b = 6, c = 7;
    System.out.println((a > b) && (b < c));
    System.out.println((a > b) || (b < c));
  }
}

// output 
// false && true → false
// false || true → true
