class Problem2{
	public static void main(String args[]){
		int x = 10;
		int y = 5;
		int result = x++ * --y;
		System.out.print(result);
	}
}

output ->> 
40

x++ =  x is 10 (used before increment)
--y = y is 4

x * y = 10 * 4 = 40
