class Problem13{
	public static void main(String args[]){
		int a = 5;
        double b = 2;
        double result = (double) a / (int) b;
        System.out.println("Result = " + result);

	}
}

output ->> 
Result = 2.5


(double) a ->> converts a from 5 to 5.0

(int) b ->> converts b from 2.0 to 2

5.0 / 2 = 2.5