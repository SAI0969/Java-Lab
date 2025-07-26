class Problem11{
	public static void main(String args[]){
		int a = 2, b = 3;
        int result = a++ + b++ + ++a + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

	}
}

output ->> 
a = 4
b = 5
result = 14


a++ ->> use a = 2, then a = 3

b++ ->> use b = 3, then b = 4

++a ->> increment a to 4, then use 4

++b ->> increment b to 5, then use 5

result = 2 + 3 + 4 + 5 = 14
