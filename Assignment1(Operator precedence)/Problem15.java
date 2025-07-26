class Problem15{
	public static void main(String args[]){
		int a = 2;
        int result = a++ * ++a * a++;
        System.out.println("a = " + a);
        System.out.println("result = " + result);

	}
}

output ->>
a = 5
result = 32


a++ ->> value is 2 but a = 3
++a ->> value is 4
a++ ->> value is 4 but a = 5

2 * 4 * 4 = 32