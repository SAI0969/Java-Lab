class Problem6 {
  public static void main(String[] args) {
    System.out.println("Even numbers from 1 to 20:");

    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        continue; 
      }
      System.out.print(i + " ");
    }
  }
}


output ->>

Even numbers from 1 to 20:
2 4 6 8 10 12 14 16 18 20
