class Problem6{
	public static void main(String args[]){
		int a = 5;
        int b = a++ + ++a * 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

	}
}

output ->> 
a = 7
b = 19


a++ → Post-increment: use the current value of a (which is 5), then increment a to 6.

++a → Pre-increment: increment a to 7(final a), then use it.

Multiplication * has higher precedence than +.

b = 5 + (7 * 2)
  = 5 + 14
  = 19
