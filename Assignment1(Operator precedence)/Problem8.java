class Problem8{
	public static void main(String args[]){
		int a = 5, b = 3, c = 7;
        int result = (a > b) ? ((b > c) ? b : c) : a;
        System.out.println("Result = " + result);

	}
}

output ->> 
Result = 7


a > b ->> 5 > 3 true

now evaluate b > c

b > c ->> 3 > 7 false

condition ? true : false

c = 7

Result = 7