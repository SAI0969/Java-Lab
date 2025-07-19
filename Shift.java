class Shift{
  public static void main(String args[]){
    int a = 3, b = -6;
    System.out.println(a >> 2);
    System.out.println(a << 2);
    System.out.println(b << 2);
    System.out.println(b >> 2);
    System.out.println(a >>> 9);
    System.out.println(b >>> 10);
  }
}


// Output

// 3 in binary:      0000 0011
// Right shift >> 2: 0000 0000  → 0

// 3 in binary:      0000 0011
// Left shift << 2:  0000 1100  → 12

// -6 in binary (32-bit signed): 1111...1111 1010
// Left shift << 2: shifts bits left → the value becomes more negative -24

// Same as above -2

// 3 >>> 9 = 0 (logical right shift → bits all 0)	0
// Large positive number (fills with 0s from left)	4194303



