import java.util.Scanner;
public class Controlflow4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day:  ");
        int today = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = sc.nextInt();

        int futureDay = (today + elapsedDays) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Today is " + days[today] + " and the future day is " + days[futureDay]);

        sc.close();
    }
}
