class Problem10{
	public static void main(String args[]){
		int a = 5, b = 3;
        int result = (a += 2) * (b -= 1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Result = " + result);

	}
}

output ->> 
a = 7
b = 2
Result = 14


(a += 2) ->> a = a + 2 ->> a = 7

(b -= 1) ->>  b = b - 1 ->>  b = 2

7 * 2 ->> 14