class Problem7{
	public static void main(String args[]){
		int x = 10, y = 20;
        int result = (x < y && y > 15) ? x + y : x - y;
        System.out.println("Result = " + result);

	}
}

output ->> 
Result = 30

x < y ->> 10 < 20 true

y > 15 ->> 20 > 15 true

condition ? true : false

true && true ->> true 
x + y = 10 + 20
	  = 30