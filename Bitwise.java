class Bitwise{
  public static void main(String args[]){
    int a = 5, b = 6, c , d, e;
    c = a & b;
    d = a | b;
    e = a ^ b;
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}

// Output
//   0101  (5)
// & 0110  (6)
// = 0100  → 4


//   0101  (5)
// | 0110  (6)
// = 0111  → 7



//   0101  (5)
// ^ 0110  (6)
// = 0011  → 3
