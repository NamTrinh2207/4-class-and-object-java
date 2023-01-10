import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào a : ");
        double a = input.nextDouble();

        System.out.print("Nhập vào b : ");
        double b = input.nextDouble();

        System.out.print("Nhập vào c : ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDelta();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt :");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot1());
        } else if (delta == 0) {
            System.out.print("Phương trình có nghiệm kép x1 = x2 = ");
            System.out.print(quadraticEquation.getRoot());
        } else {
            System.out.println("phương trình vô nghiệm");
        }

    }
}