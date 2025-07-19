class Primitivedatatypes{
  public static void main(String args[]){
    System.out.println("The size of bytes is : " + Byte.BYTES + "bytes");
    System.out.println("The size of short is : " + Short.BYTES + "bytes");
    System.out.println("The size of int is : " + Integer.BYTES + "bytes");
    System.out.println("The size of float is : " + Float.BYTES + "bytes");
    System.out.println("The size of double is : " + Double.BYTES + "bytes");
    System.out.println("The size of character is : " + Character.BYTES + "bytes");
  }
}

// Output :
// The size of bytes is : 1 bytes
// The size of short is : 2 bytes
// The size of int is : 4 bytes
// The size of float is : 4 bytes
// The size of double is : 8 bytes
// The size of character is : 2 bytes


// The size for boolean is not specified in wrapper class as boolean only contains 1 bit
// Java doesn't specify how much memory a boolean takes — it depends on the JVM implementation.
