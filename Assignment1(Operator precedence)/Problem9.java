class Problem9{
	public static void main(String args[]){
		int x = 4, y = 2;
        boolean result = (x & y) != 0 && (x | y) > 4;
        System.out.println("Result = " + result);

	}
}

output ->> 
Result = false

x = 4 
  = 0100(binary)

y = 2
  = 0010(binary)

x & y

   0100
 & 0010
   0000 ->> 0 

0 != 0 (false)

x | y 


   0100
 | 0010
   0110 ->> 6 

6 > 4 (true)

false && true 

false