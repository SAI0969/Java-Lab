class Problem3{
	public static void main(String args[]){
		int result = 10 + 2 * 3 - 4 / 2;
		System.out.println(result);

	}
}

output ->>
operator precedence * and / before + and -
same precedence level evaluated from left to right
2 *3 = 6 
4 / 2 = 2
10 + 6 -2
16 - 2
14