import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    String name;
    int marks;

    Student(String name , int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

public class Student_Grade_Tracker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for(int i =0 ; i<n ; i++){
            sc.nextLine(); // Consume newline

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        int total = 0 ;
        int highest = students.get(0).marks;
        int lowest = students.get(0).marks;

        for(Student s : students){
            total += s.marks;
            if(s.marks > highest){
                highest = s.marks;
            }
            if(s.marks < lowest){
                lowest = s.marks;
            }
        }
            double average = (double) total / students.size();

            System.out.println("\n ------- Student Summary Report-------");

            for(Student s1 : students){
                System.out.println("Name: " + s1.name + " | Marks: " + s1.marks);
            }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}