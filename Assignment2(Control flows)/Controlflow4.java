import java.util.Scanner;

public class FutureDayWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day (0=Sun, 1=Mon, ..., 6=Sat): ");
        int today = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = sc.nextInt();

        int future = (today + elapsed) % 7;

        String todayName = "", futureName = "";

        switch (today) {
            case 0: todayName = "Sunday"; break;
            case 1: todayName = "Monday"; break;
            case 2: todayName = "Tuesday"; break;
            case 3: todayName = "Wednesday"; break;
            case 4: todayName = "Thursday"; break;
            case 5: todayName = "Friday"; break;
            case 6: todayName = "Saturday"; break;
            default: todayName = "Invalid day"; break;
        }

        switch (future) {
            case 0: futureName = "Sunday"; break;
            case 1: futureName = "Monday"; break;
            case 2: futureName = "Tuesday"; break;
            case 3: futureName = "Wednesday"; break;
            case 4: futureName = "Thursday"; break;
            case 5: futureName = "Friday"; break;
            case 6: futureName = "Saturday"; break;
        }

        if (!todayName.equals("Invalid day")) {
            System.out.println("Today is " + todayName + " and the future day is " + futureName);
        } else {
            System.out.println("Invalid input for today's day.");
        }

        sc.close();
    }
}
