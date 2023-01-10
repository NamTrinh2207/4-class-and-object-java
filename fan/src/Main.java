import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("fan: " + fan);

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMedium());
        fan2.setRadius(5);
        fan2.getColor();
        fan2.setStatus(false);

        Scanner input = new Scanner(System.in);
        System.out.println("trạng thái on/off :");
        String status = input.nextLine();

        if (status.equals("off")) {
            System.out.println("Fan :" + fan2 + " " + " fan is off");
        } else if (status.equals("on")) {
            System.out.println("Fan :" + fan1 + " " + " fan is on");
        }
    }
}