import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'K';
        char studentLastInitial = 'H';

        boolean hasPerfectAttendance = true;
        String studentFirstName = "Eden";
        String studentLastName = "Marcello";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + (studentGPA));
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        //input.nextDouble();
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " " + "now has a GPA of " + " " + studentGPA);


        //char studentFirstInitial = studentFirstName.charAt(0)
        //char studentLastInitial = studentLastName.charAt(0)

    }
}

