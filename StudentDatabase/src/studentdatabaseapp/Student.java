package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private double costOfCourse = 600;

    //Constructor with name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n"
                + "Enter student class level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " "+lastName+" - "+gradeYear+".");
    }
    //Generate ID

    //Enrol in courses
    //View balance
    //Pay Tuition
    //Show status
}
