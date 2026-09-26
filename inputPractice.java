import java.util.Scanner;

public class inputPractice {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Enter Your ID: ");
        String id = input.nextLine();
        //System.out.print("Enter Your ID: ");
        //int id = input.nextInt();
        //input.nextLine(); 
        System.out.print("Enter Department: ");
        String dept = input.nextLine();

        System.out.print("Enter Your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println();
        System.out.println("------STUDENT INFORMATION------");

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa); 

    }
}
