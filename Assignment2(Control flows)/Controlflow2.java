import java.util.Scanner;
class Controlflow2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lottery pick(two digits): ");
		int guess = sc.nextInt();
		int lottery = (int)(Math.random() * 100) ;


		int lot1 = lottery / 10;
		int lot2 = lottery % 10;

		int gue1 = guess / 10;
		int gue2 = guess % 10;


		if (guess == lottery){
			System.out.print("Exact match: you win $10,000");
		} 
		else if(gue1 ==  lot2 && gue2 == lot1){
			System.out.print("Digits matched not in correct order: you win $3,000");
		}
		else if(gue1 == lot1 || gue2 == lot2 || gue1 == lot2 || gue2 == lot1){
			System.out.print("Only one digit matched: you win $1,000");
		}
		else{
			System.out.print("No match");
		}
	}
}
