class Problem5{
	public static void main(String args[]){
		int a = 10, b = 20, c = 30;
		boolean res = a < b || b > c && c > a;
		System.out.print(res);
	}
}

output ->> 
true


operator precedence ->> && is higher than ||

b > c ->> 20 > 30 false
c > a ->> 30 > 10 true
a < b ->> 10 < 20 true

false && true ->> true
true && true ->> true