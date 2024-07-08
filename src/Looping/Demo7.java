package Looping;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean status=true;
        while (status) {
            System.out.println("1. AREA OF CIRCLE");
            System.out.println("2. CIRCUMFERENCE OF CIRCLE");
            System.out.println("3. EXIT");
            System.out.println("ENTER YOUR CHOICE");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("ENTER RADIUS");
                double radius = scanner.nextDouble();
                areaOfCircle(radius);
            } else if (choice == 2) {
                System.out.println("ENTER RADIUS");
                double radius = scanner.nextDouble();
                circumferenceOfCircle(radius);
            } else if(choice==3) {
                status=false;
            }else{
                    System.out.println("INVALID CHOICE");
                }
            }
        }

    public static void areaOfCircle(double rad){
        System.out.println("AREA OF CIRCLE IS "+(3.14*rad*rad));
    }
    public static void circumferenceOfCircle(double rad){
        System.out.println("CIRCUMFERENCE OF CIRCLE IS "+(2*3.14*rad));
    }
}
