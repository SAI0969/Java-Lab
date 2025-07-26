class Problem12{
	public static void main(String args[]){
		boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean result = a || b && c;
        System.out.println("Result = " + result);

	}
}

output ->> 
Result = true

precedence order && is higher than || 

false && true ->> true

true || true ->> true